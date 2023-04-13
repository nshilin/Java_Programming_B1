package day28_arraylist;

import java.util.ArrayList;

public class RemoveByObject {

    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);

        nums.remove(0);  //this will remove the index = indexes are always an int primitive data type
        System.out.println(nums);

//        nums.remove(500); // this is trying to reach the index 500

        Integer elem = 500;
        nums.remove(elem);
        System.out.println(nums);

        nums.remove((Integer)800);
        System.out.println(nums);

        nums.add(900);
        System.out.println(nums);

        nums.remove(Integer.valueOf(900)); //This is not the preferable way to do
        System.out.println(nums);
    }
}
