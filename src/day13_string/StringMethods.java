package day13_string;

public class StringMethods {
    public static void main(String[] args) {

        String name = "James";

        //how to compare 2 strings exactly ---> we use .equals();

        System.out.println(name.equals("James"));  //false

        System.out.println("cat".equals("dog")); //false

        System.out.println(name.equals("james")); //false

        // how to compare 2 strings ignoring case sensitivity

        System.out.println(name.equalsIgnoreCase("JAMES"));

    }
}
