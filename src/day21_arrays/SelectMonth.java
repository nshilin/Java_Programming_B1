package day21_arrays;

import java.util.Scanner;

/*Ask the user the month number they want, print the month name
*
* 1 --> January
*
* 12 --> December
*
* Assume onlu valid numbers are given, but as a challenge you can handle invalid numbers*/
public class SelectMonth {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter which month number you want: ");
        int monthNum = input.nextInt();

        String [] allMonths = {"January", "February", "March", "April", "May", "July", "August", "September", "October", "November"};
        System.out.println("The number you enetred represents thsi month: " + allMonths[monthNum -1]);
    }
}
