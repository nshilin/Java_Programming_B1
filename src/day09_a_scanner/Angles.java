package day09_a_scanner;

import java.util.Scanner;

/*
Write a program that asks the user to enter 3 angle numbers ( can be floating numbers )
Determine if the angles make a triangle, which means the angles add to 180.0
and
Determine if the angles make a circle, which means the angles add to 360.0
 */
public class Angles {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        //asks the user to enter 3 angle numbers

        System.out.println("Enter 3 angle numbers");
        double degreeOne = input.nextDouble(),
                degreeTwo = input.nextDouble(),
                degreeThree = input.nextDouble();

        //for triangle ---> total degree of inner calculation is 180

        //Calcultae what's the total of 3 numbers
        double total = degreeOne + degreeTwo + degreeThree;

        //Write a print statement  that print if it is triangle
        System.out.println("It is triangle: " + (total == 180));

        //Write a print statement if it is a circle
        System.out.println("It is circle: " + (total == 360));

        //Write a print statement that prints if it is EITHER triangle or circle
        System.out.println("It is either triangle or circle: " + (total == 180 || total == 360));





    }
}
