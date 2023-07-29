package finalTask;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.time.LocalDate;

class PhoneBookImplTest {

    private PhoneBook phoneBook;
    private File phoneBookFile;

    @BeforeEach
    public void setup() {
        phoneBook = new PhoneBookImpl();
        phoneBookFile = new File("/Users/rail/IdeaProjects/Java/SkillSpace_Java-Core/number_list/phonebook.txt");
    }

    @Test
    public void testAddUserAndGetByNameAndGetByNumber() {
        phoneBook.addUser("Ivan", 123, LocalDate.now());
        phoneBook.addUser("Petr", 345, LocalDate.now());

        int number = phoneBook.getNumberByName("Petr");
        Assertions.assertEquals(345, number);

        String name = phoneBook.getNameByNumber(123);
        Assertions.assertEquals("Ivan", name);
    }

    @Test
    public void testStoreAndLoadFromFile() {
        phoneBook.addUser("Ivan", 123, LocalDate.now());
        phoneBook.addUser("Petr", 345, LocalDate.now());

        phoneBook.storeToFile(phoneBookFile);

        PhoneBook phoneBook2 = new PhoneBookImpl();
        phoneBook2.loadFromFile(phoneBookFile);

        String name = phoneBook2.getNameByNumber(123);
        Assertions.assertEquals("Ivan", name);

        int number = phoneBook2.getNumberByName("Petr");
        Assertions.assertEquals(345, number);
    }
}