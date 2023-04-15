package day30_b_custom_classes;
/*

Create a coffee class with these instance variables:
     price, size(oz), brand, types

     ex types: black, cappuccino, latte, mocchiato....

instance methods:

    - make a toString to print all the information of the coffee objects

    - drink(): print: drinking $type of coffee

    - refill(amount in oz): print refilling x oz
        add the number of oz to the total size

 */
public class Coffee {

    double price;
    String size;

    String brand;

    String type;

    @Override
    public String toString() {
        return "Price: " + price +
                "\nSize: " + size +
                "\nBrand: " + brand +
                "\nType: " + type;
    }

    public void drink() {
        System.out.println("Drinking " + type + " type of coffee");
    }

    /* refill(amount in oz):
    print refilling x oz
    add the number of oz to the total size*/

    public void refill (double amount){
        System.out.println("Refilling $" + amount + " worth coffee");
        System.out.println("After refill my total cost is $" + (price + amount));
    }

    public void totalCost (double price) {
        price += price; //java prioritizes the local variables over instance variables when they have same names
    }
}
