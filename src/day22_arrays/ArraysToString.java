package day22_arrays;

public class ArraysToString {
    public static void main(String[] args) {
        String name = "apple";
        String [] str = name.split(""); // [a,p,p,l,e]
        char [] ch = name.toCharArray(); // [a,p,p,l,e]

        char [] ch2 = {'l', 'o', 'o', 'p'};
        String ch2ToStr = new String(ch2);
        System.out.println(ch2ToStr);
    }
}
