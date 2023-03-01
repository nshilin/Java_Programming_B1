package day06_an_arithmetic_operators;

public class BasicCalculators {
    public static void main(String[] args) {

        double num1 = 5;
        double num2 = 4;

        //double addition = 4 + 5; //hard coded
        double addition = num1 + num2; //dynamic
        double substraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        double reminder = num1 / num2;

        System.out.println(num1 + " + " + num2 + " = " + addition);
        //5.0 + 4.0 = 5.04.0
    }
}