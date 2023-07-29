package fileReaderTask4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class FileTask4 {
    public static void main(String[] args) {
        Person[] people = generatePeople(10);

        try (BufferedWriter bw = new BufferedWriter(new
                FileWriter("/Users/rail/IdeaProjects/Java/SkillSpace_Java-Core/task4/peopleList.txt"))) {

            bw.write(Arrays.toString(people));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Person[] generatePeople(int amountOfPersons) {
        Person[] personArr = new Person[amountOfPersons];
        String[] names = {"Stacy", "Sean", "Jess", "Ian", "Ivan", "Brian", "Lucy", "Vladimir",
                "Yuri", "Luba", "Alex", "Rail", "Indira", "Dominic", "Lev"};
        String[] sureNames = {"Ivanov", "Muller", "Romanov", "Russo", "Colombo", "Bianchi",
                "Williams", "Brown", "Johnson", "Gagarin", "Tsiolkovsky", "Tolstoy", "Lomonosov", "Korolyov"};
        Random random = new Random();

        for (int i = 0; i < amountOfPersons; i++) {
            String name = names[random.nextInt(names.length)];
            String sureName = sureNames[random.nextInt(sureNames.length)];
            int age = random.nextInt(57) + 15;

            personArr[i] = new Person(name, sureName, age);
        }
        return personArr;
    }
}

