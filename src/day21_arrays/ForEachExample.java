package day21_arrays;

public class ForEachExample {
    public static void main(String[] args){

        int [] nums = {30, 12, 159, 12};

        for (int i = 0; i < nums.length; i++) {
            System.out.println("With Traditional for loop: " + nums[i]);
        }

        System.out.println("------------------------------------");

        for (int each: nums) {
            System.out.println("With foreach loop: " + each);
        }

        System.out.println("------------------------------------");

        String [] words = {"java", "soft skills", "selenium", "sql", "api"};
        for (int i = 0; i < words.length; i++) {
            System.out.println("With Traditional for loop: " + words[i]);
        }

        for (String eachWord: words) {
            System.out.println("With foreach loop: " + eachWord);

            if(eachWord.equalsIgnoreCase("selenium")){
                System.out.println("With foreach loop: " + eachWord.substring(2,4));
            }
        }

//        String name = "Java";
//        char [] character = {'J', 'a', 'v', 'a'};
    }
}
