package day33_b_encapsulation.access_modifiers;

public class AccessModifires {
    public int a; //public instance variable

    int b; //default instance variable

    private int c; //private instance variable

    static int y; //default static variable

    private static int z; //private static variable

    public static void main(String[] args) {
        AccessModifires obj = new AccessModifires();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        System.out.println(obj.c);
        System.out.println(obj.z);
        System.out.println(obj.y);

//System.out.println(AccessModifires.c); -> since c is an instance,
//we can't reach it by the calss name. We need an object to reach it
        System.out.println(AccessModifires.z);
        System.out.println(AccessModifires.y);
    }
}
