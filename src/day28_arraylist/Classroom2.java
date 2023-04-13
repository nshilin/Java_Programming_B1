package day28_arraylist;

import java.util.ArrayList;

public class Classroom2 {
    public static void main(String[] args) {
        ArrayList <String> group = new ArrayList<>();
        System.out.println(group);
        group.add("Gunel");
        System.out.println(group);
        group.add(0, "Natallia");
        System.out.println(group); //Natallia Gunel

        group.add("Vlad");
        group.add(0,"Khosgadam");
        System.out.println(group);

    }
}
