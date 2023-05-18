package day43_map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Countries {
    public static void main(String[] args) {
        //Create a map that holds data as a String and ArrayList of String as values

        Map <String, ArrayList<String>> countries = new HashMap<>();

        /*Add keys         Add Values
        * United States    Chicago, New York, Virginia, DC, LA
        * Turkey           Istanbul, Ankara, Izmir, Antalya
        * Canada           Quebec, Toronto, Vancouver
        * */
        countries.put("United States", new ArrayList(Arrays.asList("Chicago", "New-York", "Virginia", "DC", "LA")));
        countries.put("Turkey", new ArrayList<>(Arrays.asList("Istanbul", "Ankara", "Izmir", "Antalya")));

        ArrayList <String> citiesTurkey = new ArrayList<>(Arrays.asList("Istanbul", "Ankara", "Izmir", "Antalya"));
        countries.put("Turkey", citiesTurkey);

        countries.put("Canada", new ArrayList<>(Arrays.asList("Quebec", "Toronto", "Vancouver")));
        System.out.println(countries);

        System.out.println();
        //Print all the cities that start with V or I

        for (ArrayList<String> eachValue : countries.values()) {
            for (String eachCity : eachValue) {
                if(eachCity.startsWith("V") || eachCity.startsWith("I")){
                    System.out.println(eachCity);
                }
            }
        }
    }
}
