package day37_a_abstraction.car;

public class Rivian extends ElectricCar{
    //this starts by the voice control
    @Override
    public void charging(){
        System.out.println("Tesla charging by bluetooth");
    }

    @Override
    public void start(){
        System.out.println("Started by the voice control");
    }

}
