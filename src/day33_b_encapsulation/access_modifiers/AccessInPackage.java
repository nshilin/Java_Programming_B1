package day33_b_encapsulation.access_modifiers;

public class AccessInPackage {
    public static void main(String[] args) {
        AccessModifires obj = new AccessModifires();
        System.out.println(obj.a);
        System.out.println(obj.b);
        //System.out.println(obj.c); // Since it is a different class and private is not accessible outside of the class.

        // System.out.println(AccessModifiers.z); // Since it is a different class and private is not accessible outside of the class.
        System.out.println(AccessModifires.y);

    }
}
