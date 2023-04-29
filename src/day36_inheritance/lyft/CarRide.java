package day36_inheritance.lyft;

public class CarRide {
    public static void main(String[] args) {
        lyft obj1 = new lyft("Feyruz");
        System.out.println(obj1.calculateRate(50));

        lyftXL obj2 = new lyftXL("Nadir");
        System.out.println(obj2.calculateRate(50));
    }
}
