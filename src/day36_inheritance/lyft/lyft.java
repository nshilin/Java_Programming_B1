package day36_inheritance.lyft;

public class lyft {
    String driver;

    public lyft (String driver) {
        this.driver = driver;
    }

    public double calculateRate (int miles) {
        return miles + 9.75;
    }
}
