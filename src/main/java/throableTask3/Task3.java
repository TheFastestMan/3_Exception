package throableTask3;

public class Task3 {
    public static void main(String[] args) {

        try {
            myArrayExceptionHandler();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handling an exception at the level above: ");
            System.out.println(e.getMessage());
        }

    }

    public static void myArrayExceptionHandler() throws RuntimeException {
        int[] arr = new int[10];
        for (int i = 0; i <= arr.length; i++) {
            arr[i] = i + 1;
        }
    }

}
