package day17_loops;

public class DoWhileExample {
    public static void main(String[] args) {

        do{
            System.out.println("This will print at least 1 time");
        }while(false);

        int a = 0;
        do {
            System.out.println(a);
            a++;
        }while (a <= 10);


        int a1 = 0;
        do {
            System.out.println(a1);
            a1 = 10;
        }while (a1 !=10);
    }
}
