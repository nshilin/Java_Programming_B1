package day25_methods;

import my_util.ArrayUtil;

public class UsingArrayUtil {

    public static void main(String[] args) {
        int [] arr = new int [] {23,34,54,65};

        System.out.println(ArrayUtil.minNumInArr(arr));
        System.out.println(ArrayUtil.minNumInArr(new int [] {1,2,3,45}));

    }
}
