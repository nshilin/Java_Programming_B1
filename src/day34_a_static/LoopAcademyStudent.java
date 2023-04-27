package day34_a_static;

import java.util.Arrays;

public class LoopAcademyStudent {
    String name;
    int groupNum;

    //Have some data that is same for all students

    static int batchNum;
    static String [] instructors;
    static String schoolName;

    public LoopAcademyStudent (String name, int groupNum){
        this.name = name;
        this.groupNum = groupNum;
    }

    static {
        batchNum = 1;
        instructors = new String [] {"Nadir", "Feyruz", "Gina", "James", "Diana"};
        schoolName = "Loop Academy";
    }

    public static void printInfo(){
        System.out.println("School Name: " + schoolName);
        System.out.println("Batch Number: " + batchNum);
        System.out.println("Instructors" + Arrays.toString(instructors));
    }

    public String toString () {
        return "LoopAcademy Student: " + "\n\tName: " + name +
                "\n\tBatch #: " + batchNum +
                "\n\tGroup #: " + groupNum;
    }
}
