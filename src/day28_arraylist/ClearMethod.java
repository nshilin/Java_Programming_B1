package day28_arraylist;

import java.util.ArrayList;

public class ClearMethod {
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>();

        nums.add(100);
        nums.add(200);
        nums.add(700);
        nums.add(500);
        System.out.println(nums);
        System.out.println(nums.size());  //4

        System.out.println(nums.isEmpty()); //This checks if the ArrayList is empty or notand returns boolean value

        System.out.println("Now clearing the Arraylist");
        nums.clear();
        System.out.println(nums);
        System.out.println(nums.size());

        System.out.println(nums.isEmpty());  //true

        //nums.clear(); method doesn't return anything. It's return type is VOID
    }
}
