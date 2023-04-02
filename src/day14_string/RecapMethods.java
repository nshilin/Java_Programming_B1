package day14_string;

public class RecapMethods {
    public static void main(String[] args) {

        String str = "loop";  //we made a String object by LITERALS
        String str2 = new String ("loop"); //we made a String object by new keyword

        System.out.println("Compare with == " + (str == str2));  //false
        System.out.println("Compare with .equals()" + str.equals(str2)); //true


        System.out.println("Compare with == " + str.equals("LooP"));  //false
        System.out.println("Compare with .equalsIgnoreCase()" + str.equalsIgnoreCase("LooP")); //true

        String word1 = "loop academy";
        System.out.println("To upper case: " + word1); //
        String word2 = "LOOP ACADEMY";
        System.out.println("To lower case: " + word2); //


    }
}
