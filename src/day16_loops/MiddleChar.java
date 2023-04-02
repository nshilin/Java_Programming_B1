package day16_loops;

public class MiddleChar {
    public static void main(String[] args) {

        String word = "California";

        boolean isEven = word.length()%2==0;

        if(word.length()%2==0){
            System.out.println(word.substring(word.length()/2-1,word.length()/2+1));
        }else if (word.length()%2!=0){
            System.out.println(word.charAt(word.length()/2));
        }

        //System.out.println(word.indexOf("k"));
    }
}
