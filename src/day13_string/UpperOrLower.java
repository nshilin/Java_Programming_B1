package day13_string;

import java.util.Scanner;

public class UpperOrLower {
    public static void main(String[] args) {

        char letter = 'a'; //-- >97

        //lower case --- > 97 - 122
        //upper case --- > 65 - 90

        if(letter >= 97 && letter <= 122) {
            System.out.println("You entered letter: " + letter + "\nYour converted letter: " + (char)(letter - 32));
        }else if(letter >= 65 && letter <= 90){
            System.out.println("You entered letter: " + letter + "\nYour converted letter: " + (char)(letter + 32));
        }
    }
}