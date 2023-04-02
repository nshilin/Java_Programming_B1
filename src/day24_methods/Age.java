package day24_methods;
/*
    make a method that accepts a number / year
    and calculates how old you are
 */
public class Age {
    public static void calculateAge(int birthYear){
        int currentYear = 2023;
        int yourAge = currentYear - birthYear;

        System.out.println("Method with ONE argument: You are " + yourAge + " old!");

        //Extra just to show how methods accept the parameters
        String name = "Nigar";
        int index = name.indexOf('N');
        String part = name.substring(1, 4);
        String part2 = name.substring(2);
    }

    public static void calculateAge (int bornYear, int currentYear){
        //int currentYear = 2023;
        int yourAge = currentYear - bornYear;
        System.out.println("Method with TWO: arguments: You are "+yourAge+" old!");
    }

    public static void main(String[] args) {
        calculateAge(1960);
        calculateAge(1960,2023);

    }
}
