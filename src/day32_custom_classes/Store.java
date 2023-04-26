package day32_custom_classes;

import java.util.Arrays;
import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {
          /*
  Create a separate class to create and test the Food objects

  try making an array of Food objects
  find all the Food objects that start with 'a'
  find all the Food objects that have a total price over 20
*/
        Food food1 = new Food("Apple");
        Food food2 = new Food("Grape", 4);
        Food food3 = new Food("Banana", 10, 2.99);

        //If we want to add it to the array
        Food[] foodArr = {food1, food2, food3};

        ArrayList<Food> foodList = new ArrayList<>();
        foodList.addAll(Arrays.asList(foodArr));
        for (int i = 0; i < foodList.size(); i++) {
            if ((foodList.get(i).name.charAt(0) + "").equalsIgnoreCase("A")) {
                System.out.println(foodList.get(i));
            }
        }
    }
}
