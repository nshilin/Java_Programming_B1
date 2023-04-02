package day16_loops;

public class IndexOfExample {
    public static void main(String[] args) {
        String str = "banana";
        //

        System.out.println(str.length());
        //String firstChar = str.charAt(0); ---> will complain because String != char

        String firstChar = "" + str.charAt(0); // because after string it concatenates

        firstChar = str.substring(0,1); //reassign
        System.out.println(firstChar);

        String lastChar = "" + str.charAt(str.length()-1);
        System.out.println(lastChar);

        System.out.println(str.lastIndexOf('n'));
    }
}
