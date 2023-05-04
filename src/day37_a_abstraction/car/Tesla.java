package day37_a_abstraction.car;

public class Tesla extends ElectricCar{

    //starts by the card

    @Override
    public void charging(){
        System.out.println("Tesla charging by plugin");
    }

    @Override
    public void start(){
        System.out.println("Started by the card");
    }
}
