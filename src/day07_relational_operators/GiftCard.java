package day07_relational_operators;

import java.sql.SQLOutput;

public class GiftCard {

    /*
    declare and assign a gift card with 300;
    buy 2 items
    buy item1 for $50
    buy item2 for $100

    print out the remaining
     */
    public static void main (String [] args){

        double giftCard = 300;
        String item1 = "Dior";
        String item2 = "Chanel";
        System.out.println("I have $" + giftCard + " worth of gift card.");

        //giftCard = giftCard - 50;
        giftCard -= 50;
        System.out.println("After buying " + item1 + ", I have left " + giftCard + "" + " amount on a gift card");

        giftCard -= 100;

        System.out.println("After buying " + item2 + ", I have left " + giftCard + "" + " amount on a gift card");

        //multiply gift card balance by 2.

        giftCard *= 2;
        System.out.println("Now I have a new balance of $" + giftCard);



    }

}
