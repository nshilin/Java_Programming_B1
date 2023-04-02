package day12_switch_statement;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        double numbOne = input.nextDouble();
        System.out.println("Select operator: \n\t+\n\n-\n\t*\n\t/\n\t% Enter");
        String operator = input.next();
        System.out.println("Enter 2nd number: ");
        double numbTwo = input.nextDouble();

        boolean isValidOperator = true;

        double result = 0;

        switch (operator) {
            case "+":
                result = numbOne + numbTwo;
                break;
            case "-":
                if (numbOne > numbTwo) {
                    result = numbOne - numbTwo;
                } else {
                    result = numbTwo - numbOne;
                }
                break;
            case "*":
                result = numbOne * numbTwo;
                break;
            case "/":
                if (numbTwo != 0) {
                    result = numbOne / numbTwo;
                } else {
                    System.out.println("Cannot divide by 0");
                }
                break;
            case "%":
                if (numbTwo != 0) {
                    result = numbOne % numbTwo;
                } else {
                    System.out.println("Cannot divide by 0");
                }
                break;
            default:
                System.out.println(operator + " is not valid fro this calculator");
                isValidOperator = false;
        }
        if (isValidOperator) {
            System.out.println(numbOne + " " + operator + " " + numbTwo + " = " + result);
        }

    }
}