package day17_loops;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        /*ask user to guess a number
         * check number if it is lower than my guessed number, tell the user  -> it is too low
         * check number if it is higher than my guessed number, tell the user  -> it is too high
         * if it is correct guess - end the loop and print "you guessed correct"*/

        Scanner input = new Scanner(System.in);
        int ourSecretNum = 34;
        int guessNumber;

        do {
            System.out.println("Guess a number from 1 to 100 to find out what's in my mind");
            guessNumber = input.nextInt();

            if (guessNumber < ourSecretNum) {
                System.out.println("it's too low");
            } else if (guessNumber > ourSecretNum) {
                System.out.println("it's too high");
            }
        } while (guessNumber != ourSecretNum);
        System.out.println("You guessed the correct number which is " + ourSecretNum);
    }
}
