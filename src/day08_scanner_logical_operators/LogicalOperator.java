package day08_scanner_logical_operators;

public class LogicalOperator {
    public static void main (String []args){

        int num = 20;

        System.out.println(num > 5); // true
        System.out.println(num <5);  //false

        System.out.println(num > 5 && num > 10);  //false
                           //false && true - if the 1st is false, Java doesn't check the 2nd
        int y = 9;
        int i = 5;

        System.out.println(y < 9 && i++ > 2);

        System.out.println(i);

        int x = 20;
        int w = 30;
        System.out.println(x < 5 || w++ > 20); //true
        System.out.println(w); //31

        w = 30;
        System.out.println(x > 5 || w++ > 20);
                           //true  //not executed
        System.out.println(w); //30 - if one part is true, Java doesn't execute the 2nd part that's why w = 30

        boolean isCorrect = false;
        System.out.println(isCorrect);

        System.out.println(false);

        System.out.println(!false);  //true
        System.out.println(!isCorrect); //true
    }
}
