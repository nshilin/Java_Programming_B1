package day31_custom_class;

public class UsingCar {
    public static void main(String[] args) {
        Car carOne = new Car();
        Car carTwo = new Car();

        carOne.model = "Volvo";
        carOne.year = 2023;
        carOne.color = "Silver";
        carOne.fuelLevel = 80;

        System.out.println(carOne);
        System.out.println(carTwo);
    }
}
