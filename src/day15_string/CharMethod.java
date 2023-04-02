package day15_string;

public class CharMethod {
    public static void main(String[] args) {
        String word = "loop";  //4 characters
        //             0123

        System.out.println(word.length());

        // a method that returns a char on a given INDEX - .charAt(int);
        System.out.println(0);
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);

        //System.out.println(4);

        String longWord = "kjdfgdskjfbkdsjbvdofibfglrn";
        //                 0                        27
        System.out.println(longWord.length()); // 41

        int lastIndex = longWord.length()-1; //
        System.out.println(longWord.charAt(lastIndex));
    }
}
