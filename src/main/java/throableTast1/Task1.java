package throableTast1;

public class Task1 {
    public static void main(String[] args) {

        try {
            String word = null;
            int length = word.length();
            System.out.println(length);
        } catch (NullPointerException e) {
            System.out.println("System caught NullPointerException");
            System.out.println("Description: " + e.getMessage());
        }

    }
}
