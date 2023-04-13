package day28_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {
    public static void main(String[] args) {

        ArrayList <Integer> nums;

        Integer [] arr = {1, 2, 3}; //The reason we made this with Integer dataType because we will use array as part of ArrayList, and it works only with Object types

        System.out.println(Arrays.toString(arr));

        Arrays.asList();  //This method from Arrays class takes the array and makes it as ArrayList

        // Here we created an ArrayList with initial values directly.
        nums = new ArrayList<>(Arrays.asList(1, 4, 6, 7, 8, 8, 34));
        System.out.println(nums);

        ArrayList <Integer> list2 = new ArrayList<>(Arrays.asList(arr));
    }
}
