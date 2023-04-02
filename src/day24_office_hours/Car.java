package day24_office_hours;

public class Car {

    public static void unlockCar () {
        System.out.println("Unlocking the car");
    }

    //Declare a method that prints out "Opening a door"

    public static void openDoor () {
        System.out.println("Opening a door");
    }

    public static void getInCar () {
        System.out.println("Getting in thr car");
        System.out.println("Closing a door");
    }

    //Declare a method that prints coouple statements for getting Ready

    public static void getReadyTwo () {
        System.out.println("Putting a seatbelt");
        System.out.println("checking mirrors");
        System.out.println("Put a music on");
        System.out.println("Put on a navigation");
    }

    public static void startCar () {
        System.out.println("Starting a car");
    }

    public static  void startToDrive () {
        unlockCar();
        openDoor();
        getInCar();
        getReadyTwo();
    }

    public static void main(String[] args) {
     startToDrive();
    }

}
