package day36_inheritance.access.b;

import day36_inheritance.access.a.First;

public class Forth extends First {
    public static void main(String[] args) {
//        Forth obj = new Forth();
        //This class can access ONLY its OWN class instances

        First obj = new First();
        System.out.println(obj.one);
//        System.out.println(obj.two);
//        System.out.println(obj.three);
//        System.out.println(obj.four);

        Forth obj2 = new Forth();
        System.out.println(obj.one);
        System.out.println(obj2.two);
//        System.out.println(obj.three);
//        System.out.println(obj.four);

        //Since there is INHERITANCE between FORTH class and FIRST class, the object of FORTH class inherits all the accessible fields and methods of its PARENT class. In this case, since
    }
}
