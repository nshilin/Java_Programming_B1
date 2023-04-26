package day31_custom_class;

public class ThisKeyword {
    //this and this() - 2 different things
    int a = 100;

    public ThisKeyword(int a) {
        a = 400;
        this.a = 700;
    }
}
