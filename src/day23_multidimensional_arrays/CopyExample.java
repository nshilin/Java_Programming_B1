package day23_multidimensional_arrays;

import day22_arrays.ArraysToString;

import java.util.Arrays;

public class CopyExample {
    public static void main(String[] args) {
      int [] a = {1, 2, 3, 4};
      int [] b = a;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        System.out.println("------------------------------");
        a[0] = 100;
        b[1] = 200;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        System.out.println("------------------------------");
        int [] c = Arrays.copyOf(a, a.length); //it's a new Array
        System.out.println(Arrays.toString(c));

        System.out.println("------------------------------");
        c[0] = -300;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(c));

        System.out.println("------------------------------");
        int [] d = Arrays.copyOf(a,a.length + 2);
        System.out.println(Arrays.toString(d));
        d[a.length-1] = -900;
        System.out.println(Arrays.toString(d));
     }
}
