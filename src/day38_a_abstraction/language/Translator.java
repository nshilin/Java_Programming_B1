package day38_a_abstraction.language;

public class Translator {
    public static void main(String[] args) {
        //Language lng = new Language();
        //We can't do this because abstract class canNOT be instantiated

        Turkish tr = new Turkish();
        tr.hi();
        tr.bye();

        System.out.println("------------");

        Spanish sp = new Spanish();
        sp.hi();
        sp.bye();
    }
}
