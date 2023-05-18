package day43_map;

import java.util.HashMap;
import java.util.Map;

public class Classroom {
    /*
    * */

    public static void main(String[] args) {

        //Create a Map
        Map<Integer, Student> map = new HashMap<>();

        //Add students and the numbers
        Student s1 = new Student("Javid", 3.90, 12);
        map.put(1, s1);

        map.put(2, new Student("Vlad", 3.90, 12));
        map.put(3, new Student("Nazakat", 3.99, 10));
        map.put(4, new Student("Gunel", 3.95, 11));
        map.put(5, new Student("Ilgar", 4.90, 13));

        System.out.println(map);
        System.out.println("---------------------");
        System.out.println(map.get(3));
        //How can I get ONLY the name of the 4th element?
        System.out.println(map.get(4).name);
        System.out.println(map.get(4).gp);
        System.out.println(map.get(4).id);

        //LOOPING Through MAP
        System.out.println("********LOOPING THROUGH MAP********");
        System.out.println(map.keySet());

        for (Integer eachKey : map.keySet()) {
            System.out.println("Rank: " + eachKey);
            System.out.println("Value: " + map.get(eachKey));
            System.out.println();
        }

        System.out.println("********LOOPING THROUGH MAP'S VALUES********");
        //print
        System.out.println(map.values());
        for (Student eachValue : map.values()) {
            if(eachValue.gp == 4.00)
            System.out.println(eachValue);
        }

        System.out.println("********LOOPING THROUGH MAP'S ENTRYSET********");
        for (Map.Entry<Integer, Student> eachEntry : map.entrySet()) {
            System.out.println("Rank: " + eachEntry.getKey());
            System.out.println("Value: " + eachEntry.getValue());
            System.out.println();
        }

        /*
    .put(key, value);  ---- > this method will add a key and value if the key does not exist in the map. If the key is already in the map, it will just update the value.
    .get(key);          --- > this method will return the value of the matching key, if there is no matching, it will return null
    .containsKey(key);  --- > this method will return boolean if the given key exist among the keys in the map
    .containsValue(value); - > this method will return boolean if the given value exist among the values in the map
    .remove(key);       --- > this method will remove the data (key & value), if the given key is among the keys in the map
    //-----------------------
    .keySet();         ---- > this method will return the set of the key in the map
    .values();         ---- > this method will return the list of values in the map
    .entrySet();       ---- > this method will return a single row map on each iteration
 */
    }
}
