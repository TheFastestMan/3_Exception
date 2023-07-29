package debugTask5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        System.out.println("Welcome to the game!");
        System.out.println("Write number from 1 to 100 and try to guess its.");
        System.out.println("You have only 5 attempts!");

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int magicNumber = random.nextInt(100) + 1;
        int attempts = 5;

        while (attempts > 0) {
            try {
                if (attempts == 1) {
                    System.out.println("This is your last try, don't let me down!");
                }
                int guess = sc.nextInt();
                if (guess < 1 || guess > 100) {
                    throw new IllegalArgumentException("Number should be between 1 and 100!");
                }

                if (guess < magicNumber) {
                    System.out.println("The magic number is greater");
                } else if (guess > magicNumber) {
                    System.out.println("The magic number is less");
                } else {
                    System.out.println("You win!");
                    break;
                }
                attempts--;
            } catch (InputMismatchException e) {
                System.out.println("There should be number");
                sc.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
        if (attempts == 0) {
            System.out.println("Game over");
            System.out.println("Magic Number is: " + magicNumber);
        }
    }

}