package day36_inheritance.final_example;

public class UseFinalExample {
    public static void main(String[] args) {
        System.out.println(FinalExample.PLANET);
//        FinalExample.PLANET = "Mars"; can't do it because it's a constant and can't be changed

        FinalExample obj1 = new FinalExample(20);
        System.out.println(obj1.a);
        System.out.println(obj1.b);

//        obj1.a = 30; since those var are final, we can't change the values
//        obj1.b = 40;

        System.out.println("-----------------------");
        FinalExample obj2 = new FinalExample(20);
        System.out.println(obj2.a);
        System.out.println(obj2.b);
    }
}
