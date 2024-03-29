package day32_custom_classes;

public class Food {
    //name, quantity, unit price, total price
    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

    /*
            - constructor
    - create a constructor that creates a Food object with the name
    - create a constructor that creates a Food object with the name and quantity
    - create a constructor that creates a Food object with the name, quantity, and unit price
        -> call calculatePrice() method here
*/

    public Food(String name){
        this.name = name;
    }

    public Food(String name, int quantity){
        this(name);
        this.quantity = quantity;
    }
    public Food(String name, int quantity, double unitPrice){
        this(name, quantity);
        this.unitPrice = unitPrice;
        calculatePrice();
    }
    /*
- method:
    - calculatePrice(): multiple the quantity by unit price and assign the value to the total price
    - toString()
        print all the Food information
*/

    public void calculatePrice(){
        totalPrice = quantity * unitPrice;
    }

    @Override
    public String toString() {
        return "Item: " +
                "\nname: " + name +
                "\nquantity: " + quantity +
                "\nunitPrice: $" + unitPrice +
                "\ntotalPrice: $" + totalPrice;

    }
}
