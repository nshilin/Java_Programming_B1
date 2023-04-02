package day15_string;

import java.util.Scanner;

public class ShortestWithA {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 words: ");
        String wordOne = input.next();
        String wordTwo = input.next();
        String wordThree = input.next();

        int wordOneLength = wordOne.length();
        int wordTwoLength = wordTwo.length();
        int wordThreeLength = wordThree.length();

        String result = "";

        if (wordOne.contains("a") && (wordOneLength <= wordTwoLength && wordOneLength <= wordThreeLength ) ){
            result = wordOne + " is the smallest with \"a\"";
        } else if (wordTwo.contains("a") && (wordTwoLength <= wordOneLength && wordTwoLength <= wordThreeLength ) ){
            result = wordTwo + " is the smallest with \"a\"";
        } else if (wordThree.contains("a") && (wordThreeLength <= wordOneLength && wordThreeLength <= wordTwoLength ) ){
            result = wordThree + " is the smallest with \"a\"";
        } else {
            result = "No single largest word with \"a\"";
        }
        System.out.println(result);
    }

}
/*ask the user to enter 3 String inputs. Find and print the shortest word that also contains 'a'

Ex:
    "java"
    "mouse"
    "computer"

Output: java

Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.
 */