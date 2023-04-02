package day17_loops;

import java.util.Scanner;

public class MinAndMax2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = 0;
        int min = 9999999;

        int count = 1;

        while (count <= 5) {
            System.out.println("Enter a number ");
            int num = input.nextInt();

            if(max < num ){
                max = num;
            }

            if (min > num){
                min = num;
            }

            count++;
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
