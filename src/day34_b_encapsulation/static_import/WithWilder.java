package day34_b_encapsulation.static_import;

import static java.util.Arrays.*;
import static my_util.ArrayUtil.*;

public class WithWilder {

    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5};
        sort(a);

//  System.out.println(toString(a)); //to String method is NOT static that's why we can't use it by itself

        minNumInArrWithSort(new int [] {4,5,6,7});

    }
}
