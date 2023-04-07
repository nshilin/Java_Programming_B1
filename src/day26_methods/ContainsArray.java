package day26_methods;
/*
Contains

create a method that will accept an int array and an int number. Check and return if the given number is in the array.
 */
public class ContainsArray {

    public static boolean containArr (int [] arr, int num) { // [2,3,6,8,9,10], 4

        for (int each : arr) {
            if (each == num){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,66,81};
        int num = 5;

        System.out.println(containArr(arr,num));
        System.out.println(containArr(new int[]{1,2,3}, 3));
    }
}
