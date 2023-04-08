package day27_wrapper_arraylist;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList <Integer> numbers = new ArrayList<>(); //if Array List is empty by default it can hold 10
        System.out.println(numbers);

        System.out.println(numbers);
        numbers.add(10);
        System.out.println(numbers);

        numbers.add(-200);
        System.out.println(numbers);

        numbers.add(34);
        numbers.add(400);
        System.out.println(numbers);

        System.out.println(numbers.size());

        //to get the 1st index from Array List

        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));
        System.out.println(numbers.get(3));
//        System.out.println(numbers.get(4)); //Runtime exception --> IndexOutOfBoundsException

        /*
        * size();
        * get(int i)
        * add(dataType)*/

        numbers.add(34); //ArrayList allows the duplicate values
        System.out.println(numbers);  //ArrayList reserves the insertion order

        numbers.add(1,-77);
        System.out.println(numbers);
    }
}
