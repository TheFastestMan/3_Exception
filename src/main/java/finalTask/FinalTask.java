package finalTask;

import java.io.File;
import java.time.LocalDate;

public class FinalTask {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        PhoneBookImpl phoneBook = new PhoneBookImpl();
        File file = new File("/Users/rail/IdeaProjects/Java/SkillSpace_Java-Core/number_list/peopleList.txt");


        User user1 = new User("Alex", 1234, localDate);
        User user2 = new User("Ian", 5274, localDate);
        User user3 = new User("Vladimir", 4565, localDate);
        User user4 = new User("Dominic", 7645, localDate);
        User user5 = new User("Rail", 9876, localDate);
        User user6 = new User("Luba", 4534, localDate);

        phoneBook.addUser(user1.getName(), user1.getNumber(), user1.getCreatedDate());
        phoneBook.addUser(user2.getName(), user2.getNumber(), user2.getCreatedDate());
        phoneBook.addUser(user3.getName(), user3.getNumber(), user3.getCreatedDate());
        phoneBook.addUser(user4.getName(), user4.getNumber(), user4.getCreatedDate());
        phoneBook.addUser(user5.getName(), user5.getNumber(), user5.getCreatedDate());
        phoneBook.addUser(user6.getName(), user6.getNumber(), user6.getCreatedDate());

        phoneBook.storeToFile(file);
        phoneBook.loadFromFile(file);

        System.out.println(phoneBook.getNumberByName(user1.getName()));
        System.out.println(phoneBook.getNameByNumber(user1.getNumber()));

    }

}
