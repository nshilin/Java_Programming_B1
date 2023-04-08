package day27_wrapper_arraylist;

import java.util.ArrayList;

public class RemoveExample {
    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>();
        list.add("Water");
        list.add("Banana");
        list.add("Apple");
        list.add("Grape");
        System.out.println(list); //[Water, Banana, Apple, Grape]
                                 //    0       1      2      3
        System.out.println("I have total " + list.size() + " elements on my list");

//list.remove(0); //Returns the element if the boolean result is true. And it is true if the element is removed

        System.out.println(list.remove(0)); //this will remove the element and if it is removed it also prints out the removed element.
        System.out.println(list);

        String removedElem = list.remove(list.size()-1);
        System.out.println(removedElem);
        System.out.println(list);

        boolean isRemoved = list.remove("Banana"); //If that element exists in list, it will remove and return the boolean result
        System.out.println(isRemoved);
        System.out.println(list);

        boolean isRemoved2 = list.remove("Water");
        System.out.println(isRemoved2);
        System.out.println(list);

        /*
        remove(withIndex);
        -It checks if the index is in the Arrayllist range, if true - it removes that element on that index and returns the removed element

        removed(withElement)
        -It checks:
            -if the given element exists in the ArrayList, if true, it removes that element and returns TRUE
            -if the given element DOESN'T exist in the ArrayList, if false, it DOES NOT remove that element and returns FALSE
         */
    }
}
