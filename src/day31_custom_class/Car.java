package day31_custom_class;
/*create instance variables:
        model, year, color, fuel level (percent number)

        create instance methods:

        - toString(): [return String]
        returns all the information of the Car objects

        - drive(): [void]
        prints: driving $model
        subtract 5 from the fuel amount

        - fillTank(): [void]
        prints: filling tank
        fuel level will be maxed at 100

        - isLow() [boolean]
        create a method that will check if the gas level is low.
        return true is the gas level is below 25
        otherwise return false*/
public class Car {
    String model;
    int year;
    String color;
    double fuelLevel;

    @Override
    public String toString() {
        return "Car: " +
                "\nmodel:" + model +
                "\nyear: " + year +
                "\ncolor: " + color +
                "\nfuelLevel: " + fuelLevel;
    }
}
