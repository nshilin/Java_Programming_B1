package day18_loops;

public class BranchingExample {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {

            if (i == 5) {
                System.out.println(i + " ");
                break;
            }
        }

       /*System.out.println("------------------------------");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " ");
                break; //prints just 0
        }*/

        System.out.println("------------------------------");
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i + " ");
        }  //skips 5

        System.out.println("------------------------------");
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.println(i + " ");
        }

        for (int i = 0; i <= 100; i++) {
            if (i == 10) {
                break;
            }
            System.out.println(i + " ");
        }
    }
}
