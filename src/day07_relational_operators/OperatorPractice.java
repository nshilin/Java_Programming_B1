package day07_relational_operators;

public class OperatorPractice {
    public static void main(String[] args) {
        int i = 5;
        //      |6     5     6    5
        int y = -i++ + --i + i++ / i--;
        //  y = -5   +   5 + 5   / 6
        //  y = -5   +   5 + 0

        System.out.println(i);
        System.out.println(y);

    }
}
