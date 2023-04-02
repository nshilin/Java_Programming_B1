package day16_loops;

public class MethodChaining {
    public static void main(String[] args) {

        String word = "   Java is a great language    ";
        System.out.println(word);

        word = word.trim();
        System.out.println(word);

        //word.substring(0,4);
        word = word.substring(0, word.indexOf(" "));
        System.out.println(word);

        System.out.println("_____________________________________");
        word = "   Java is a great language    ";
        System.out.println(word);

        String word2 = word.trim().substring(0, 4).toLowerCase().toUpperCase();
       // String word3 = contains("ja").word.trim().substring(0, 4).toLowerCase().toUpperCase(); ---> not valid since "contains" returns boolean
        //String word4 = word.indexOf(1) + "Hello"; //concatenation

        System.out.println(word);
    }
}
