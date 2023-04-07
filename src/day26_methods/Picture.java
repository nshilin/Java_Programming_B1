package day26_methods;

public class Picture {

    //
    public static void main(String[] args) {


    }

    public static void draw (){  //non-parameterized method
        System.out.println("Trying to draw");
    }

    public static void draw (String color){ //it's a parameterized method - overloaded method

        System.out.println("Drawing with the " + color);
    }

    public static void draw (String color, String color2){
        System.out.println("Drawing with two different colors: " + color + " and " + color2);
    }

    public static void draw (int size) {
        System.out.println("Drawing in this size: " + size);
    }

    public static void draw (String str, int size) {
        System.out.println("Just drawing");
    }

    //We can't overload with the different PARAMETER NAME. IT has to be diferent dataType or different amount of parameters

//    public static void draw (int length) {
//        System.out.println("Drawing in this size: " + length);
//    }


    }
