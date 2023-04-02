package day12_switch_statement;


import java.util.Scanner;

/*
    Given a day number, find and print the day related to the number

    1- Monday
    2- Tuesday

    6- Saturday
    7- Sunday

    any other number: Not a day
 */
public class DaysInWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the day number");
        int dayNum = input.nextInt();

        switch(dayNum){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 6:
                System.out.println("Weekend");
                break;
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid data type");}

    }

}
