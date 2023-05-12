package day41_collection;

//import java.util.HashSet;
//import java.util.LinkedHashSet;
//import java.util.Set;
import java.util.*;

public class SetObjects {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();
        set1.add(null);
        set1.add("hello");
        set1.add("$5.0");
        set1.add("400");
        set1.add("hello"); //doesn't allow duplicates
        set1.add("%");
        System.out.println(set1);

        Set<String> set2 = new LinkedHashSet<>();
        set2.add(null);
        set2.add("hello");
        set2.add("$5.0");
        set2.add("400");
        set2.add("hello"); //doesn't allow duplicates
        set2.add("%");
        System.out.println(set2);

        Set<String> set3 = new TreeSet<>();
       // set3.add(null);   // does NOT allow the null value
        set3.add("hello");
        set3.add("$5.0");
        set3.add("400");
        set3.add("hello"); //doesn't allow duplicates
        set3.add("400");   //doesn't allow duplicates
        set3.add("%");
        System.out.println(set3);

        Set<Integer> set4 = new TreeSet<>();
        set4.add(5);
        set4.add(1);
        set4.add(-2);
        set4.add(0);
        set4.add(50);
        System.out.println(set4);
        //you can convert the unsorted arraylist it to TreeSet, which will sort it
    }
}
