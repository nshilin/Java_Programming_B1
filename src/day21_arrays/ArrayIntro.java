package day21_arrays;

import java.util.Arrays;
import java.util.jar.JarOutputStream;

public class ArrayIntro {
    public static void main(String[] args) {
        String city1 = "Fairfax";
        String city2 = "New York";
        String city3 = "Alexandria";
        String city4 = "Bethesda";
        String city5 = "Reston";
        String city6 = "Gaithersburg";

        System.out.println("-------------------------------------");

        //String [] cities = {city1, city2, city3, city4, city5, city6};

//        String cities2 [] = {"Fairfax", "New York", "Alexandria", "Bethesda", "Reston", "Gaithersburg"}; //Pay attention to square bracket location. This is another way to declare.


        String [] cities = {"Fairfax", "New York", "Alexandria", "Bethesda", "Reston", "Gaithersburg"};  //6 elements

        //How to reach each element?

        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);
        System.out.println(cities[5]);

        //How can I print all elements in array?

        System.out.println("All cities: " + cities[0] + " " + cities[1] + " " + " ......");

        System.out.println("-------------------------------------");
        System.out.println();
        //System.out.println(cities); //This is NOT how we print all elements in array. This shows kind of memory location

//        Arrays.toString(parameter);

        System.out.println(Arrays.toString(cities));
        System.out.println(Arrays.toString(cities).substring(1, Arrays.toString(cities).length()-1));

        System.out.println("-------------------------------------");

        //How do we get the number of elements in the Array?
        System.out.println(cities.length); // number of words
        System.out.println(Arrays.toString(cities).length()); // number of characters


    }
}
