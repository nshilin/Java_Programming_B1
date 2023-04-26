package day31_custom_class;

public class UsingMarker {
    public static void main(String[] args) {
        Marker markOne = new Marker("Dry marker", "Sharpie", "Blue");
        System.out.println(markOne);

    /*
    //Before we were initializing the instance variables this way.
        markOne.type = "Dry Marker";
        markOne.brand = "Sharpie";
        markOne.color = "Blue;
     */
    }
}
