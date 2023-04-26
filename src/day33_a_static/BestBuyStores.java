package day33_a_static;

public class BestBuyStores {
    public static void main(String[] args) {
        System.out.println(BestBuy.headQuarters);
        System.out.println(BestBuy.day);
        System.out.println(BestBuy.numOfComputer);

        BestBuy store1 = new BestBuy("Fairfax");
        System.out.println(store1.location);
        System.out.println(store1.numOfComputer);

        store1.numOfComputer -= 10;
        System.out.println(store1.numOfComputer);

        BestBuy store2 = new BestBuy("Chantilly");
        System.out.println(store2.numOfComputer);
    }
}
