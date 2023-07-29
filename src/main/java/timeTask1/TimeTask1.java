package timeTask1;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeTask1 {
    public static void main(String[] args) {

        int enteredMonth = enterMonthFromKeyboard();

        int currentYear = LocalDate.now().getYear();

        LocalDate date = LocalDate.of(currentYear, Month.of(enteredMonth), 1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d::MMM::uuuu");
        while (date.getMonthValue() == enteredMonth) {
            String formattedDate = date.format(formatter);
            System.out.println(formattedDate);
            date = date.plusDays(1);
        }
    }
    private static int enterMonthFromKeyboard() {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        return month;
    }

}