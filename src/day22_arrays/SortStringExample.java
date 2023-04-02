package day22_arrays;

import java.util.Arrays;

public class SortStringExample {
    public static void main(String[] args) {

        String [] str = {"java", "loop", "while", "Softskills", "HELLO", "bye", "$", "54", "54TEst"}; //if you have mix of different characters - characters go first, than numbers, uppercases, lowercases
        System.out.println(Arrays.toString(str));

        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
    }
}
