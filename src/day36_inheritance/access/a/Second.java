package day36_inheritance.access.a;
//Different class but SAME package
public class Second {
    public static void main(String[] args) {
        First obj = new First();
        System.out.println(obj.one);
        System.out.println(obj.two);
        System.out.println(obj.three);
//        System.out.println(obj.four); //Since this variable is private, it's only accessible in the class level. If we want to access it, we need to use setters and getters
    }
}
