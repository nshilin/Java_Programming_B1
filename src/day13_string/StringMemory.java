package day13_string;

import java.util.Scanner;

public class StringMemory {
    public static void main(String[] args) {

        String vrOne = ""; //nothing
        String space = " "; //1 space
        String str1 = "Java"; //this is the way creating String by LITERALS
        String str2 = "Java";
        String str3 = "Java";
        String str4 = "Java";
        String str5 = "Java";

        System.out.println(str1 == str2);

        String str6 = "JavA";
        String str7 = "JavA";
        String str8 = "JavA";

        System.out.println(str6 == str8);

        String str9 = "JAvA";

        System.out.println(str8 == str9);

        System.out.println();

        System.out.println("--------------------------------");

        String str10 = new String ("Java");
        System.out.println(str10);

        String word1 = "loop";
        String word2 = "loop";

        String word3 = new String ("loop");
        String word4 = new String ("loop");
        String word5 = new String ("Loop");

        System.out.println(word3 == word4);

        System.out.println(word3.equals(word4)); //this method comes from String class
        System.out.println(word3.equals(word5));

        String a = "Loop camp"; // a new object in String pool
        String b = a; // an existing object in String pool
        String d = a + " is great!"; // "Loop camp is great!" - a new object in String pool

        a = "Loop CAMP";  //It is a brand NEW String object


    }
}
