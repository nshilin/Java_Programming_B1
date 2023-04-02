package day10_a_if_statements;

/*
        Declare and assign a number (day)

            1 - Monday
            2 - Tuesday
            ..
            6 - Saturday
            7 - Sunday

            Ex: 2
                Tuesday
 */
public class DaysOfWeek {
    public static void main(String[] args) {

        int day = 4;

        if(day == 1 ){
            System.out.println("It's Monday");
        } else if (day == 2) {
            System.out.println("It's Tuesday");
        }else if (day == 3){
            System.out.println("It's Wednesday");
        } else if (day == 4) {
            System.out.println("It's Thursday");
        } else if (day == 5) {
            System.out.println("It's Friday");
        } else if (day == 6) {
            System.out.println("It's Saturday");
        } else if (day == 7){
            System.out.println("It's Sunday");
        }else{
            System.out.println("Invalid number of day");
        }

    }

}






