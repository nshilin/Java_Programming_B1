package day20_nested_loops;
/*Given a String, find and print the unique characters. A character is unique if it appears more than once in the String.
        Ex:
        AAABCCDEEF
        Output:
        BDF
        */
public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "AAABCCDEEF";

        for (int i = 0; i < str.length(); i++) { //or you can do i <= str.length()-1

            char outerLetter = str.charAt(i);

            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                char innerLetter = str.charAt(j);

                if (outerLetter == innerLetter) {
                    count++;
                }
            }

            if(count == 1) {
                System.out.print(outerLetter);
            }


//            if(!unique.contains("" + word.charAt(i)) && word.substring(i+1).contains("" + word.charAt(i))) {
//                unique += word.charAt(i);
        }
        
    }
}
