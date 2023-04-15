package day30_a_arraylist;
/*
A bad pair is whenever the first number in the pair is bigger then the second number. Remove any bad pairs for the ArrayList and return the ArrayList with no bad pairs

Note: The given ArrayList will always be an even number of elements, so each number always has one pair

@param nums - Given ArrayList of numbers
@return - ArrayList of numbers

{1,3,5,2,6,7}
{5, 2}
 */

import java.util.ArrayList;
import java.util.Arrays;

public class BadPairs {
    public static ArrayList<Integer> pairs(ArrayList<Integer> list) {
        ArrayList<Integer> goodPairs = new ArrayList<>();

        if (list.size() % 2 == 0) {
            for (int i = 0; i < list.size(); i += 2) {

                if (list.get(i) < list.get(i + 1)) {
                    goodPairs.add(list.get(i));
                    goodPairs.add(list.get(i + 1));
                }
            }
        }


        return goodPairs;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(3, 4, 6, 1, 1, 10, 8, 7));
        System.out.println(nums);
        System.out.println(pairs(nums));
    }
}
