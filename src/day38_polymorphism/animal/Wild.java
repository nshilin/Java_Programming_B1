package day38_polymorphism.animal;

public class Wild {
    public static void main(String[] args) {

        //reference type is itself
        Lizard lz = new Lizard();
        lz.eat();
        lz.skinColor = "camo";
        lz.numOfClaws = 10;
        lz.name = "Lizzard";
        System.out.println(lz.skinColor);
        System.out.println(lz.numOfClaws);
        System.out.println(lz.name);


        System.out.println("-------------------");
        //Reference type ---> super class
        Reptile lz2 = new Lizard ();
        lz2.eat();
        lz2.name = "lizzard2";
        lz2.numOfClaws = 20;
//        lz2.skinColor = "blue";
        //Here we are limited to use the instance to the Reference Type
        //Reference Type does NOT have access to skinColor instance variable

        System.out.println("-------------------");
        Animal lz3 = new Lizard();
        lz3.eat();
        lz3.name = "lizzard3";
//        lz3.numOfClaws = 20;
//        lz2.skinColor = "blue";
        //Here we are limited to use the instance to the Reference Type
        //Reference Type does NOT have access to skinColor and numOfClaws instance variables

        /*
        * */


        //It will always run the OBJECT side
    }
}
