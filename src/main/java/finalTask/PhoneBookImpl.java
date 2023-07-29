package finalTask;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PhoneBookImpl implements PhoneBook {
    private List<User> users;
    private char comma = ',';

    public PhoneBookImpl() {
        users = new ArrayList<>();
    }

    @Override
    public void addUser(String name, int number, LocalDate createdDate) {
        User user = new User(name, number, createdDate);
        users.add(user);
    }

    @Override
    public int getNumberByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user.getNumber();
            }
        }
        throw new RuntimeException("There is no user with this name: " + name);
    }

    @Override
    public String getNameByNumber(int number) {
        for (User user : users) {
            if (user.getNumber() == number) {
                return user.getName();
            }
        }
        throw new RuntimeException("There is no user with this number: " + number);
    }

    @Override
    public void storeToFile(File phoneBookFile) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(phoneBookFile))) {
            for (User user : users) {
                String userLine = user.getName() + comma + " " + user.getNumber() + comma + " " + user.getCreatedDate();
                writer.write(userLine);
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException("Unable to write to file: " + phoneBookFile.getName(), e);
        }
    }

    @Override
    public void loadFromFile(File phoneBookFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(phoneBookFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userData = line.split(",");
                String name = userData[0];
                int number = Integer.parseInt(userData[1].trim());

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate createdDate = LocalDate.parse(userData[2].trim(), formatter);

                addUser(name, number, createdDate);

            }
        } catch (FileNotFoundException e) {
            System.out.println("File " + phoneBookFile.getName() + " is not found. " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

}
