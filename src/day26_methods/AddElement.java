package day26_methods;

import java.util.Arrays;

public class AddElement {

    //create a method that accepts int array and an int value
    //Then adds that value at the end of array

    public static void main(String[] args) {
        int [] arr = {23, 4, 6, 6};

        add(arr, 67);
    }

    public static int [] add(int [] arr, int num) {
        int [] newArr = Arrays.copyOf(arr, arr.length+1);
        newArr[newArr.length-1] = num;


        return newArr;
    }

    /**
     *
     * This method accepts String array and the String word
     * And returns the new array with the word added at the end
     */
    public static String [] add (String [] arr, String word) {

        String [] newArr = Arrays.copyOf(arr, arr.length+1);
        newArr[newArr.length-1] = word;

        return newArr;

    }


    //This is another way wuth for loop
//    public static int [] add(int [] arr, int num) {
//        int [] newArr = new int[arr.length+1];
//
//        for(int i = 0; i < newArr.length; i++){
//            newArr[i] = arr[i];
//        }
//        newArr[newArr.length-1] = num;
//
//        return newArr;
//    }

}
