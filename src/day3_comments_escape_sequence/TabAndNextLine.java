package day3_comments_escape_sequence;

import java.sql.SQLOutput;

public class TabAndNextLine {

    public static void main(String [] args){

        //This is without any tab
        System.out.println("This is not tabbed");

        //This is with one Tab
        System.out.println("\tThis is tabbed once");

        //this is with two tab
        System.out.println("\t\tThis is tabbed twice");

        //Here it is tabbed without escape sequence
        System.out.println("     This is tabbed without escape sequence");




        //examples of new line
        System.out.println();
        System.out.println("1) Go to parking lot");
        System.out.println("2) Find the car");
        System.out.println("3) Start the car");


        System.out.println("\n1) Go to parking lot\n2) Find the car\n3) Start the car");

        //command+/
        //cntl+/
    }
}
