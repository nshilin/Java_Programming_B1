package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class JobTitle {
    public static void main(String[] args) {

        ArrayList <String> jobs = new ArrayList<>();

//        jobs.addAll(Arrays.asList("SDET", "Quality Engineer", "Automation Engineer", "Quality Assurance"));
        jobs.addAll(Arrays.asList("SDET", "QE", "AE", "QA", "PO", "SM", "PM"));
        System.out.println("Original: " + jobs);

        //this method removes all the given values from the list if they match
        ArrayList <String> job1 = new ArrayList<>(jobs); //Create a new arraylist  object by copying values from the jobs arraylist
        job1.removeAll(Arrays.asList("BA", "PO", "SM"));
        System.out.println(job1);

        //retainAll();
        ArrayList <String> job2 = new ArrayList<>(jobs);
        job2.retainAll(Arrays.asList("SDET", "QA", "AE", "QE"));
        System.out.println(job2);

        //containsAll();
        ArrayList <String> job3 = new ArrayList<>(jobs);
        boolean result1 = job3.containsAll(Arrays.asList("BA", "BA", "PO"));
        boolean result2 = job3.containsAll(Arrays.asList("QA", "PA", "POO"));
        System.out.println(result1);
        System.out.println(result2);

    }
}
