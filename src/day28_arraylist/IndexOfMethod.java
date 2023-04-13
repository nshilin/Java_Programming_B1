package day28_arraylist;

import java.util.ArrayList;

public class IndexOfMethod {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Bye");
        list.add("Universe");
        System.out.println(list);

        System.out.println(list.indexOf("World")); //this method will return the index of the element at the first match in the ArrayList

        System.out.println(list.indexOf("Universe"));

        System.out.println(list.lastIndexOf("Universe")); //This method will return the index of the element at the first match

        System.out.println("---------------------------------");
        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(100); // index 0
        nums.add(100);
        nums.add(400);
        nums.add(100);
        nums.add(700);
        nums.add(100);  // index 5

        System.out.println(nums.indexOf(100));
        System.out.println(nums.lastIndexOf(100));


        nums.set(nums.indexOf(400),600);
        System.out.println(nums);

        int index = nums.indexOf(400); // If you try to get the element which does not exist in the ArrayList, it will return -1
        System.out.println(index);



    }
}
