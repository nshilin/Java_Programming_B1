package day15_string;

public class MergeString {
    public static void main(String[] args) {

        String a = "abc";
        String b = "xyz";

        String mergeOne = a + b;
        System.out.println(mergeOne);

        String mergeTwo = "" + a.charAt(0) + a.charAt(1);
        System.out.println(mergeTwo);

        mergeTwo += a.charAt(2);
        mergeTwo += a.charAt(0);
        mergeTwo += a.charAt(1);
        mergeTwo += a.charAt(2);
        System.out.println(mergeTwo);
    }
}
