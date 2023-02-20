package day4_variables;

import java.sql.SQLOutput;

public class Fruits {
    public static void main(String[] args) {
        //create 3 variables called apples, grapes, bananas

        //int apples = 50;
        //int grapes = 100;
        //int bananas = 150;

        int apples = 50, grapes = 100, bananas = 150;

        //let's print out this is how many apples we have

        System.out.println("This is how many apples we have:");
        System.out.println(apples);

        System.out.println("This is how many apples we have: " + apples);
        System.out.println("This is how many apples we have: " + grapes);
        System.out.println("This is how many apples we have: " + bananas);

        //We gave 20 apples to a friend
        apples = 30;
        System.out.println("Apples left: " + apples);

        //declare new variable and assign value 20.0

        double price = 20.0;

        System.out.println("The price for " + grapes +" grapes is $" + price); //dynamic

    }
}
