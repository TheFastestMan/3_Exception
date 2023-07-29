package throableTast2;

public class Task2 {
    public static void main(String[] args) {

        try {
            throwException();
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void throwException() throws CustomException {
        throw new CustomException("My CustomException");
    }

}
