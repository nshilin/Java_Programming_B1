package day20_nested_loops;

import java.util.Scanner;

/* similar to fizzbuzz

    number
        % 3 --> fin
        % 5 --> ra
        both --> finra
        neither --> number

    repeated up to some number

Ask a user to enter a number

check all the number up to the number user gave us to see which is fin which ra or which finra*/
public class FinRaInRange {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userNum = input.nextInt();
        //1, 2, 3, 4, 5

        for (int i = 1; i <= userNum; i++) {

            String str = "";
            if (i % 3 == 0) {
                str += "FIN";    //FIN
            }

            if (i % 5 == 0) {
                str += "RA";     //RA
            }

            if (str.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(str + " ");
            }

            System.out.println(str.isEmpty() ? i : str );
        }
    }
}

