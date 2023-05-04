package day37_b_interface.creating;

public class Runner {
    public static void main(String[] args) {
        //Can't make an Object of Interface
//        Create obj = new Create();

        Book b1 = new Book();
        b1.read();
        b1.write();
    }
}
