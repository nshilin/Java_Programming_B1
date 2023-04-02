package day17_loops;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
    write a program that asks user to enter 5 numbers and returns the biggest and smallest numbers from those 5

    repeated steps:

        ask for a number

        check is it the biggest

        check is it the smallest

 */
public class MinAndMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;

        System.out.println("Enter a number");
        int num = input.nextInt();

        int smallest = num;
        int biggest = num;

        while ( count <= 4){
            System.out.println("Enter a number");

            if(num > smallest){
                smallest = num;
            }

            if(num < biggest){
                biggest = num;
            }


            count++;
        }

        System.out.println("My max number " + smallest);
        System.out.println("My max number " + biggest);
    }
}
