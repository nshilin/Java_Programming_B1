package day35_inheritance.book;
//Runner class
public class Library {
    public static void main(String[] args) {
        Book book = new Book();
        //can reach 6 instance variables from its own class

        EBook ebook = new EBook();
        //can reach 6 instance variables from the SUPER class and 2 instance variables from its own class and 1 instance method from its own class

        ebook.size = 20;
        ebook.pages = 1035;
        ebook.title = "Soft Skills";
        ebook.author = "Nadir";
        ebook.read();

        AudioBook abook = new AudioBook();
        abook.duration = 2.4;
        abook.narrator = "Morgan Freeman";
        abook.title = "Java";
        abook.author = "James Gosling";
        abook.listen();
    }
}
