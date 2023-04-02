package day11_if_statements;

/*
ask a number from user
if number = between 1 and 10
then check if it is even or odd

else
number is not in the range
 */

import java.util.Scanner;

public class NestedExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = input.nextInt();

        if (number >= 1 && number <= 10) { //Outer if condition

            if (number % 2 == 0) {  //Inner if condition
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }else{
            System.out.println("The number is not in the range");
        }

    }
}
