package day26_methods;

/*create a method which accepts an int array and returns the sum of the elements*/
public class SumOfElements {
    //varargs --> variable arguments
    public static int sumOfElem(int[] arr) {
        int sum = 0;

        for (int each : arr) {
            sum += each;
        }
        return sum;
    }

    public static int sumOfElem2(int ... arr) {
        int sum = 0;

        for (int each : arr) {
            sum += each;
        }
        return sum;
    }

    public static int method(int num, int ... arr){
        System.out.println("Testing varargs");
        return 1;
    }

    public static int method(String str, int ... arr){
        System.out.println("Testing varargs");
        return 2;
    }


    public static void main(String[] args) {
        int [] arr = {12,34,23,12,65};
        int [] arr2 = new int[] {34,23,456,756};

        System.out.println(sumOfElem(arr));
        System.out.println(sumOfElem(arr2));
        System.out.println(sumOfElem(new int[] {12,34,56,786,78}));

        System.out.println(sumOfElem2(22,33,1));
        System.out.println(method(23,45,45,4));
    }
}
