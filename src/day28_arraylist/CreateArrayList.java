package day28_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateArrayList {
    public static void main(String[] args) {

        ArrayList <String> listOne = new ArrayList<>();
        listOne.add("Tom");
        listOne.add("Jerry");
        System.out.println(listOne);

        //We can copy one arrayList to another one

        ArrayList <String> listTwo = new ArrayList<>(listOne);
        listTwo = listOne; //here we did not create a new ArrayList. We are just referring to the same as listOne

        ArrayList <String> listThree = new ArrayList<>(Arrays.asList("Name1", "Name2", "Name3"));
        System.out.println(listThree);
//        ArrayList <String> listFour = new ArrayList<>("Name1", "Name2"); --> not valid
    }
}
