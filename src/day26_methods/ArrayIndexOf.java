package day26_methods;

import java.util.Arrays;

public class ArrayIndexOf {
    public static void main(String[] args) {

        String str = "loop";
        int index = str.indexOf("l");

        int[] arr = {3, 1, 546, 34, 23};
        int num = 546;

        System.out.println(indexOf(arr,num));
    }

    public static int indexOf(int[] arr, int num) {

        int locationOfElement = 0;
        for (int each : arr) {

            if (each == num) {
                return locationOfElement;
            } else {
                locationOfElement++;
            }
        }
        return -1;
    }

    //The same with fori
    public static int indexOf(String[] arr, String word) {

        int locationOfElement = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(word)) {
                return i;
            }
        }
        return -1;
    }
}
