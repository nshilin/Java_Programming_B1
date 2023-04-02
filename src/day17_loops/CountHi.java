package day17_loops;

public class CountHi {
    public static void main(String[] args) {

        String sentence = "aaaaahiaaaahiaaaahiaaaahi";
                int countOfHi = 0;

        for (int i = 0; i < sentence.length(); i++) {
                            // b==h                        a==1
            if(sentence.charAt(i) == 'h' && sentence.charAt(i+1)=='i');{
                countOfHi++;
            }
        }
        System.out.println("This is the amount of hi you have: " + countOfHi);
    }
}
