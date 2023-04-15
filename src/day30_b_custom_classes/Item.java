package day30_b_custom_classes;
/*have instance variables called name and price*/
public class Item {
    String name;
    double price;

    @Override
    public String toString() {
        return "name = '" + name + '\'' + "\nPrice = " + price;
    }
}
