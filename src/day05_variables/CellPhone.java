package day05_variables;

import java.sql.SQLOutput;

public class CellPhone {
    public static void main(String[] args) {

        String brand = "Apple";
        String model = "iphone 10";
        String color = "black";
        double price = 1000.99;
        int storage = 128;
        boolean hasCamera = true;
        char sim = 'A';

        System.out.println("I have an " + model + " from " + brand);
        System.out.println("It came in the color " + color + " and it has " + storage + "GB");
        System.out.println("For the sim type " + sim + " with a camera " + hasCamera + " the total price was $" + price);

        System.out.println();

        String fullMessage = "I have an " + model + " from " + brand + "\nIt came in the color s" + color + " and it has " + storage + "GB";
        System.out.println(fullMessage);
    }
}
