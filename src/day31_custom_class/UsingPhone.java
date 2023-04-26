package day31_custom_class;

public class UsingPhone {
    public static void main(String[] args) {
        Phone phone1 = new Phone("Iphone");
        System.out.println(phone1);

        Phone phone2 = new Phone("Iphone", "Apple");
        System.out.println(phone2);

        Phone phone3 = new Phone("Iphone", "Apple", 256,16.4);
        System.out.println(phone3);
    }
}
