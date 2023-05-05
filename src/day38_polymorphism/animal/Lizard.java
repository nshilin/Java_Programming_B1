package day38_polymorphism.animal;

public class Lizard extends Reptile{

    String skinColor;

    @Override
    public void eat() {
        System.out.println("LIZARD is eating");
    }
}
