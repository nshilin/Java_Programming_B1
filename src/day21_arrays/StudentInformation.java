package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
        all String types
        0 -> id
        1 -> first name
        2 -> last name
        3 -> batch number
     */
public class StudentInformation {
    public static void main(String [] args){

        String [] student1 = {"B001", "Tom", "Jerry", "B#1"};
        System.out.println("This is the info for the Student 1" + Arrays.toString(student1));
//        System.out.println(student1); //it's a hashcode - location in memory

        System.out.println("--------------------------------------");
        String [] student2 = new String[4];
        System.out.println("This is the info for the Student 1" + Arrays.toString(student2));

        student2[0] = "B002";
        student2[1] = "John";
        student2[2] = "Wick";
        student2[3] = "B#2";

        System.out.println("This is the info for the Student 2" + Arrays.toString(student2));

        System.out.println("--------------------------------------");
        String [] student3 = new String[4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ID: ");
        student3[0] = input.next();

        System.out.println("Enter first name: ");
        student3[1] = input.next();

        System.out.println("Enter last name: ");
        student3[2] = input.next();

        System.out.println("Enter Batch No: ");
        student3[3] = input.next();

        System.out.println("This is the info for the Student 3" + Arrays.toString(student3));

        System.out.println("--------------------------------------");

        String [] questions = {"Enter ID:", "Enter first name:", "Enter last name:", "Enter Batch No:"};
        String [] student4 = new String[4];
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            student4[i] = input.next();
        }
        System.out.println("This is the info for the Student 4" + Arrays.toString(student4));
    }
}
