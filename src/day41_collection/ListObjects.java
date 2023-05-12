package day41_collection;

import java.util.ArrayList;
import java.util.List;

public class ListObjects {
    public static void main(String[] args) {


        //ArrayList <String> list1 = new ArrayList<>(); //reference is itself
        List <String> list1 = new ArrayList<>(); //reference is interface
                                                //reference side is list interface but object side is ArrayList class
        list1.add("a"); //0
        list1.add("b"); //1
        list1.add("c"); //2
        list1.add("d");
        list1.add(null);
        list1.add("a"); //ArrayList accepts duplicates
        System.out.println(list1);
        System.out.println(list1.get(2));


        List <String> list2 = new ArrayList<>(); //reference is interface
        //reference side is list interface but the object side is LinkedList class
        list2.add("a"); //0
        list2.add("b"); //1
        list2.add("c"); //2
        list2.add("d");
        list2.add(null);
        list2.add("a"); //ArrayList accepts duplicates
        System.out.println(list2);
        System.out.println(list2.get(2));


    }
}
