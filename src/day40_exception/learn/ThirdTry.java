package day40_exception.learn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter a number");
            int num = input.nextInt();

            System.out.println("Enter a number 2");
            int num2 = input.nextInt();

            System.out.println(num / num2);

        } catch (InputMismatchException e) {
            e.printStackTrace();

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("FINALLY BLOCK");
            input.close();
        }


        System.out.println("Done");
    }
}
