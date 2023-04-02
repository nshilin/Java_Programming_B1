package day22_arrays;

import java.util.Arrays;

public class EqualsExample {
    public static void main(String[] args) {

        int [] a = {1,2,3,4};
        int [] b = {1,2,3,4};
        int [] c = a;

//        System.out.println(a == b); //Since they are two different pbejects we can't compare them like this

        System.out.println((a == c)); //Since array c points array a, the output will be TRUE
        System.out.println(Arrays.equals(a, b));

        boolean result = Arrays.equals(b,c);
        System.out.println(result);
    }
}
