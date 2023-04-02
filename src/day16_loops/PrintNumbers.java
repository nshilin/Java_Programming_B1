package day16_loops;

public class PrintNumbers {
    public static void main(String[] args) {

        int n = 2;

//        while (n <= 100) {
//            System.out.println(n);
//            n++;
//        }

        //print even numbers from 2 to 100
//        while(n <= 100 && n%2 == 0){  //2 <= 100 && true, then2 , then 3 and it false
//            System.out.println(n);
//            n++;
//        }

//        while (n <= 100) {
//            if (n % 2 == 0)
//                System.out.println("n = " + n);
//            n++;
//        }

        while (n <= 100){
            System.out.println(n);
            n +=2;
        }

        System.out.println("-----------------------------------");

        n=2;
        while (n <= 100) {
            if (n % 2 == 0){
                System.out.println(n);
            }
            n++;
        }
    }
}
