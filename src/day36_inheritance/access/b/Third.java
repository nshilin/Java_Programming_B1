package day36_inheritance.access.b;

import day36_inheritance.access.a.First;

public class Third {
    public static void main(String[] args) {
//        Third obj = new Third();
        //This class can access ONLY its OWN class instances
        First obj = new First();
        System.out.println(obj.one);
//        System.out.println(obj.two);
//        System.out.println(obj.three);
//        System.out.println(obj.four);

        //Line 11 is protected. Since there is no inheritance, it's accessible ONLY in the same package
        //Line 12 is default and it's accessible ONLY in the same package


    }
}
