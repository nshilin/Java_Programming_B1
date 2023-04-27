package day34_a_static;

public class School {
    public static void main(String[] args) {
        //create an object that has 2 parameter: name and group #

        LoopAcademyStudent student1 = new LoopAcademyStudent("Javid", 1);
        LoopAcademyStudent student2 = new LoopAcademyStudent("Natalie", 2);

        System.out.println("----------");
        LoopAcademyStudent.printInfo();
        System.out.println("----------");
        LoopAcademyStudent.printInfo();


        System.out.println("----------");
        System.out.println(student1);
        System.out.println(student2);

    }
}
