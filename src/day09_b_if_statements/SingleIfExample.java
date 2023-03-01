package day09_b_if_statements;

public class SingleIfExample {
    public static void main(String[] args) {
        //If condition is true, print out "Today is java day"

        if (true) {
            System.out.println("Today is java day");
        }

        //System.out.println("Today is java day");

        //max number of days in Feb is 28

        int maxNumberOfDay = 28;

        if (maxNumberOfDay == 28) {
            System.out.println("This month is February");
        }

        int quizResut = 50;
        int passRate = 40;
        if (quizResut >= passRate) {
            System.out.println("Passed the exam");
        }

        if (quizResut < passRate) {
            System.out.println("Failing the exam");
        }

        //if year is equal or bigger than 2020: AND less than or equal to 2022 ---> it is true

        int year = 2021;
        boolean isCovidYears = year >= 2020 && year <= 2022;

        if(isCovidYears){
            System.out.println("It was Covid a covid year");
        }





    }
}