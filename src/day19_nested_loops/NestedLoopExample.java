package day19_nested_loops;

public class NestedLoopExample {
    public static void main(String[] args) {
//        System.out.println("Hello Loop Academy");

//        for (int i = 1; i < 5; i++) {
//            System.out.println("Hello Loop Academy");
//        }
//
//        System.out.println("--------------------------------");

        for (int i = 1; i <= 2; i++) {   //Outer Loop

            System.out.println("This is the " + i + " iteration");
            for (int j = 0; j < 5; j++) {  //Inner Loop
                System.out.println("Hello Loop Academy");
            }
        }
    }
}
