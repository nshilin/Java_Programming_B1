package day18_loops;

public class Pallindrome {
    public static void main(String[] args) {
        String word = "abcba";  //length(); --> 5
        String reverse = "";

        for (int i = word.length() -1; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        if(word.equals(reverse)){
            System.out.println("It is a pallindrome word");
        }else{
            System.out.println("It is not a pallindrome word");
        }

        //System.out.println(word.equals(reverse) ? "Pallindrome" : "not pallindrome"; //with ternary
    }
}
