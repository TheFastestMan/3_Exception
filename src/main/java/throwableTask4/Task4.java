package throwableTask4;

public class Task4 {
    public static void main(String[] args) {

        Division division = new Division();

        System.out.println("Valid division:");
        System.out.println(division.divide("6","2","2"));

        System.out.println("--------------------------");

        System.out.println("Division by 0:");
        System.out.println(division.divide("6","0"));

        System.out.println("--------------------------");

        System.out.println("Division by 0 with 3 numbers:");
        System.out.println(division.divide("6","2","0"));

        System.out.println("--------------------------");

        System.out.println("Invalid format:");
        System.out.println(division.divide("6","a"));

        System.out.println("--------------------------");

        System.out.println("Division with 1 number:");
        System.out.println(division.divide("6"));


    }
}
