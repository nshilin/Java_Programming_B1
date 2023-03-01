package day08_scanner_logical_operators;

import java.util.Scanner;
/*
create Scanner object
        ask the user to enter their first name - next
        ask the user to enter their last name - next
        ask the user if they are employed - boolean
        ask the user if they are a student - boolean
 */
public class WorkStatus {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter your first name: ");
        String firstName = input.next();

        System.out.println("Enter your last name: ");
        String lastname = input.next();

        System.out.println("How are you? ");
        String feeling = input.next();

        System.out.println("What is the best team? ");
        String team = input.next();

        System.out.println("How much are you making? ");
        String answerSalary = input.next();

        System.out.println("\nFirst name:\t" + firstName + "\nLast name:\t" + lastname);
        System.out.println("How are you:\t" + feeling);
        System.out.println("Best team ever:\t");
        input.nextLine();
        System.out.println("How much are you making? ");
    }
}

