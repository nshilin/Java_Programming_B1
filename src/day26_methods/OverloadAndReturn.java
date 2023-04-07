package day26_methods;

public class OverloadAndReturn {
    public static void method () {
        System.out.println("Just printing by default");
    }


    //return type being different doesn't mean that they are overloaded
    //changing the return type doesn't mean we overloaded the method
//    public static int method () {
//        System.out.println("Just printing by default");
//        return 1;
//    }

    public static int method (int num) {
        System.out.println("Just printing by default");
        return 1;
    }

}
