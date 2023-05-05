package day38_a_abstraction.interface_methods;

public interface Mac {

    String NAME = "Mac"; //By default public static final

    String OS = "IOS";
    void turnOn(); //By default public abstract

    //Q: How can we create a method with body/implementation in the Interface?
    //A:

    //First option is through static method

    public static void company() { //public is redundant - no need to add it
        System.out.println("Apple");
        System.out.println("HQ is in LA");
        System.out.println("New release is in November");
    }

    //Second option is through the default method
    public default void faceTime () { //the same is here - public is redundant - no need to add it
        System.out.println("Greeting in Facetime");
        System.out.println("Calling someone");
    }
}
