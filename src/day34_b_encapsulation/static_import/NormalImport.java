package day34_b_encapsulation.static_import;

import java.util.Arrays;

public class NormalImport {
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5};

        Arrays.sort(a); //since we have not done the static import, we can't call the method by the name only

        System.out.println(Arrays.toString(a));
    }
}
