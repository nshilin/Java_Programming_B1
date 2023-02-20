package day05_variables;

public class School {

    public static void main (String [] args){

        int numberOfStudentsinGrade1 = 40;
        int numberOfStudentsinGrade2 = 30;
        int numberOfStudentsinGrade3 = 35;
        int numberOfStudentsinGrade4 = 50;
        int numberOfStudentsinGrade5 = 44;

        int totalNumberOfStudents = numberOfStudentsinGrade1 + numberOfStudentsinGrade2 + numberOfStudentsinGrade3 + numberOfStudentsinGrade4 + numberOfStudentsinGrade5;

        double numberOfDaysInYear = 100.5;
        double numberOfSnowDays = 5.5;
        double averageGpa = 3.5;

        System.out.println("Number of Students in Grade 1 = " + numberOfStudentsinGrade1);
        System.out.println("Number of Students in Grade 2 = " + numberOfStudentsinGrade2);
        System.out.println("Number of Students in Grade 3 = " + numberOfStudentsinGrade3);
        System.out.println("Number of Students in Grade 4 = " + numberOfStudentsinGrade4);
        System.out.println("Number of Students in Grade 5 = " + numberOfStudentsinGrade5);

        System.out.println("Total number of students: " + totalNumberOfStudents);

        System.out.println();

        System.out.println("Number of Days in year" + numberOfDaysInYear );
        System.out.println(2+5);

    }









    /*
    total number of students
    Task:
        class name: School
        declare and assign these variables
            number of students in grade 1
            number of students in grade 2
            number of students in grade 3
            number of students in grade 4
            number of students in grade 5
            - > total number of students in your school
            number of days in a year (have some half day = ~ 100.5)
            number of snow days in a year (double)
            average gpa in school (3.5) [ranges 1.0 - 4.0]
            print all of the variables with unique messages
     */
}
