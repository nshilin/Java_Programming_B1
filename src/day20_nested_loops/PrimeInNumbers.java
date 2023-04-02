package day20_nested_loops;
/*Given a number. Print out all the prime numbers from 2 to that number A prime number is a number that is only divisible by 1 and itself.

    Ex:
        Input:
            50
        Output:
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47*/
public class PrimeInNumbers {
    public static void main(String[] args) {

        int num = 50;

        for (int i = 2; i <= num; i++) {

            int count = 0; //putting the count inside of the outer loop will RESET it to 0 every iteration of the OUTER loop

            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(i + ", ");
            }
        }
    }
}


//            if(num % 1 == 0 && num % num == 0) => doesn't work because all numbers fit into this

