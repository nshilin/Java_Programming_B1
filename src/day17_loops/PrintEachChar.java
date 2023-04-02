package day17_loops;

public class PrintEachChar {
    public static void main(String[] args) {
        String str = "java is great language";
        //            0123

        for (int i = 0; i < str.length()-1; i++) {
            System.out.println(str.charAt(i));
        }
    }
}
