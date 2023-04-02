package day23_multidimensional_arrays;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int [] num = {4, 10, 15, 40, 20, 30, 200};
        System.out.println(Arrays.binarySearch(num, 4));
        System.out.println(Arrays.binarySearch(num, 10));
        System.out.println(Arrays.binarySearch(num, 200));
        System.out.println(Arrays.binarySearch(num, 15)); //In order to use this method, the array should be sorted
    }
}
