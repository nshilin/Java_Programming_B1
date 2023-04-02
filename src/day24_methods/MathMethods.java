package day24_methods;
/*
        add
        subtraction
        multiplication
        division
     */
public class MathMethods {

    public static void add (int num1, int num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    public static void minus (double num1, double num2){
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    public static  void divide (double num1, double num2){
        if (num2 == 0){
            System.out.println("We can't divide by 0");
        } else {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }
    }

    public static void main(String[] args) {
        add(34,495);
        add(453, 4534);

        minus(34.5, 44.2);
        minus(30, 15);

        divide(20, 0);
    }
}
