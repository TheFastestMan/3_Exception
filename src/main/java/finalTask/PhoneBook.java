package finalTask;

import java.io.File;
import java.time.LocalDate;

public interface PhoneBook {
    void addUser(String name, int number, LocalDate createdDate);

    int getNumberByName(String name);

    String getNameByNumber(int number);

    void storeToFile(File phoneBookFile);

    void loadFromFile(File phoneBookFile);
}
