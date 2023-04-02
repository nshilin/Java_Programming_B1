package day22_arrays;

import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {
        String days = "monday tuesday wednesday thursday friday saturday sunday";

//        String [] dayArr = days.split(",");
//        System.out.println(Arrays.toString(dayArr));
//
//        String [] dayArr1 = days.split(", ");
//        System.out.println(Arrays.toString(dayArr1));

        String [] dayArr1 = days.split("wednesday");
        System.out.println(dayArr1.length);
        System.out.println(Arrays.toString(dayArr1));

        String month = "jan-feb-mar-apr-may-jun-jul-aug-sep-oct-nov-dec";
        String [] monthArr = month.split("-");
        for (String eachMonth: monthArr) {
            System.out.println(eachMonth.substring(0, 1).toUpperCase() + eachMonth.substring(1).toLowerCase());
        }
    }
}
