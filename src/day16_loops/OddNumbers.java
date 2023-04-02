package day16_loops;

public class OddNumbers {
    public static void main(String[] args) {

        //print numbers from 2 to 100 which are odd numbers

        int num = 2;

        while(num <= 100){

            if (num % 2 == 0){
                System.out.println(num);
            }
            num++;
        }

    }

}
