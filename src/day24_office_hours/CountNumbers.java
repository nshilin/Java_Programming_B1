package day24_office_hours;

public class CountNumbers {

    public static void countNums (int num) {
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        countNums(5);
        countNums(19);
    }
}
