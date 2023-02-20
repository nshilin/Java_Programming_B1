package day05_variables;

public class RecapVariables {

    public static void main (String [] args){
        // Declare the values
        byte numberOfCoffeeCups;
        double totalPriceOfCoffee;
        int totalStudentInClass;

       // System.out.println(numberOfCoffeeCups);
        // System.out.println(totalPriceOfCoffee);
        //System.out.println(totalStudentInClass);

        //Assign the values
        numberOfCoffeeCups = 2;
        totalPriceOfCoffee = 12.21;
        totalStudentInClass = 543;

        System.out.println(numberOfCoffeeCups);
        System.out.println(totalPriceOfCoffee);
        System.out.println(totalStudentInClass);

        //2 * 543
        System.out.println(numberOfCoffeeCups + " * " + totalStudentInClass);

        //Declare and assign
        double temperature = 20.6;
        int javaDays = 5;

        System.out.println("This is my temperature " + temperature);
        System.out.println("It is day" + javaDays + " in java class");

    }
}
