package day15_string;

public class MovefirstWord2 {
    public static void main(String[] args) {

        String str = "One Two";
        String firstPart = str.substring(0, str.indexOf(" "));
        String secondPart = str.substring(str.indexOf(" ") + 1);

        System.out.println(secondPart + " " + firstPart);

    }
}
