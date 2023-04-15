package day30_b_custom_classes;

public class UsingAnimal {
    public static void main(String[] args) {
        Animal bird = new Animal();
        bird.population = 100000000;
        bird.species = "Bird";

        System.out.println(bird);
        System.out.println("-------------------");
    }
}
