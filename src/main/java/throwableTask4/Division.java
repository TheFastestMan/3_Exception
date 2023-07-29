package throwableTask4;

public class Division {
    public Double divide(String... arguments) {

        try {
            if (arguments.length < 2) {
                throw new IllegalArgumentException("At least 2 numbers");
            }

            int numerator = Integer.parseInt(arguments[0]);
            int denominator = Integer.parseInt(arguments[1]);
            if (denominator == 0) {
                throw new ArithmeticException("Can't divide by 0");
            }
            Double result = (double) numerator / denominator;

            for (int i = 2; i < arguments.length; i++) {
                int nextNum = Integer.parseInt(arguments[i]);
                if (nextNum == 0) {
                    throw new ArithmeticException("Can't divide by 0");
                }
                result = result / nextNum;
            }
            return result;

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

}
