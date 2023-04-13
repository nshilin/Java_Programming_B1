package day28_arraylist;

import java.util.ArrayList;

public class AddAndRemove {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Computer");
        list.add("Laptop");
        list.add("Screen");
        list.add("Keyboard");
        list.add("Mouse");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        String removed = list.remove(0); //removes th 1st element and returns the removed element. Since dataType of the removed element is String, we can assign it to a String variable.
        System.out.println(removed);
        System.out.println(list);

        list.remove("Mouse");
        System.out.println(list);

        boolean isRemoved = list.remove("Keyboard");
        System.out.println(isRemoved);
        System.out.println(list);

        list.add("Screen");
        list.add("Screen");
        list.add("Screen");
        list.add("Cable");
        list.add("Screen");
        System.out.println(list);
        list.remove("Screen");
        System.out.println(list);
    }
}
