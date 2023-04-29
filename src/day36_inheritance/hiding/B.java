package day36_inheritance.hiding;

public class B extends A{

    @Override
    public void instanceMethod () {
        staticMethod();
    }

//    @Override - we CANNOT override static method. The one below is just a new static method that belongs to the CHILD class. If the CHILD class name is used to call this method, the one is the Parent class will be hided.

    public static void staticMethod() {
        System.out.println("Static method from CHILD class");
        //        instanceMethod(); //static accepts only static
    }
}
