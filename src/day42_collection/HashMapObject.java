package day42_collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapObject {
    public static void main(String[] args) {

        //key - value
        Map <Integer, String> map = new HashMap();

        //put(k, v); ---> these methods put the data into map, but if there is a key that is already existing in the map, it will UPDATE the value of that key
        map.put(1, "one");
        map.put(1, "one");
        map.put(1, "one");
        map.put(1, "two");

        System.out.println(map);

        System.out.println("*******************");
        Map <Integer, String> map2 = new HashMap();
        map2.put(1, "one");
        map2.put(5, "five");
        map2.put(10, "ten");
        map2.put(4, "four");
        map2.put(40, "four");
        map2.put(30, "four");
        System.out.println(map2);

        System.out.println("*******************");
        //read the key/value
        System.out.println(map2.get(5)); //argument in the get method which is 5 is NOT the index, it's a key
        System.out.println(map2.get(2)); //if you try to get the key, which does not exist, it will return 'null'

        String value = map2.get(4); //Since it returns a String, I can assign it to a String variable
        System.out.println(value);

        map2.remove(1); //the argument in the remove() method is key, if there is matching one, it will remove whole ENTRY SET(key-value)
        System.out.println(map2);

        System.out.println("*******************");
        System.out.println(map2.containsKey(1)); //it checks if the given KEY exists in MAP
        System.out.println(map2.containsKey(4)); //it checks if the given KEY exists in MAP

        System.out.println("*******************");
        System.out.println(map2.containsValue("five")); //it checks if the given VALUE exists in MAP
        System.out.println(map2.containsValue("six"));

        System.out.println("*******************");
        map2.put(null, null); //The HasMap can have a null as key and as value
        System.out.println(map2);

        map2.put(null, "java");
        System.out.println(map2);

        map2.put(6, null);
        System.out.println(map2);

        map2.put(7, null);
        System.out.println(map2); //We can have duplicate values

        map2.put(8, "Bye");
        map2.put(9, "Bye");
        System.out.println(map2);

    }
}
