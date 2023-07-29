package timeTask2;


import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeTask2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int amongDaysAgo = sc.nextInt();

        ZoneId zoneId = ZoneId.of("Asia/Yerevan");
        LocalDateTime currentDate = LocalDateTime.now(zoneId);

        LocalDateTime yerevanDate = currentDate.minusDays(amongDaysAgo);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy HH:mm");
        String formattedDate = yerevanDate.format(formatter);

        System.out.println(formattedDate);
    }

}
