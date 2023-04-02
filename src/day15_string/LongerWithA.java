package day15_string;

import java.util.Scanner;

public class LongerWithA {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 words: ");
        String wordOne = input.next();
        String wordTwo = input.next();
        String wordThree = input.next();

        int wordOneLength = wordOne.length();
        int wordTwoLength = wordTwo.length();
        int wordThreeLength = wordThree.length();

        if (wordOne.contains("a") && (wordOneLength >= wordTwoLength && wordOneLength >= wordThreeLength ) ){
            System.out.println(wordOne + " is the biggest with \"a\"");
        } else if (wordTwo.contains("a") && (wordTwoLength >= wordOneLength && wordTwoLength >= wordThreeLength ) ){
            System.out.println(wordTwo + " is the biggest with \"a\"");
        } else if (wordThree.contains("a") && (wordThreeLength >= wordOneLength && wordThreeLength >= wordTwoLength ) ){
            System.out.println(wordThree + " is the biggest with \"a\"");
        } else {
            System.out.println("No single largest word with \"a\"");
        }

    }
}
/*
create a class LongestWithA
ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'

Ex:
    "java"
    "mouse"
    "computer"

Output: java

Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.
 */