package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

//make a method that accepts ArrayList and prints the list
public class ArrayListWithMethods {

    public static String getList (ArrayList <String> list){
        /*LIST:
        * apple
        * banana
        * */
        String finalList = "LIST: ";

        for (String each : list) {
            finalList += "\n\t" + each;
        }
        return finalList;
    }

//make a method that accepts the number and prints the day of the wekk

    public static String printDayOfWeek (int numDay){
        ArrayList <String> daysOfWeek = new ArrayList<>(Arrays.asList(
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"));

        if (numDay >= 1 && numDay <= 7) {
            return (daysOfWeek.get(numDay - 1));
        } else {
            return (numDay + " is not in the range of 1-7");
        }
    }


    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>(Arrays.asList("apple", "bread", "water", "butter"));
        System.out.println(getList(list));
    }
}
