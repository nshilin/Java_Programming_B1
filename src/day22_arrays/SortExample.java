package day22_arrays;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {

        int [] nums = {2, 3, 8, 1, 7, -4};

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("Min: " + nums[0]);
        System.out.println("Max: " + nums[nums.length-1]);
    }
}
