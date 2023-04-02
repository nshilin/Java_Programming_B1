package day12_switch_statement;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the vending machine");
        System.out.println("Please select one of the following: \n\tDrinks\n\tSnacks\n\tGum");

        String selection = input.next();

        String msg = "";

        switch(selection) {
            case "Drinks":
                System.out.println("Your choice Drinks (click on 1,2,3): \n\t1) Water\n\t2) Soda\n\t3) Juice\n\tYour number");
                int drinkNumber = input.nextInt();

                if(drinkNumber == 1){
                    msg = "You have selected water";
                } else if (drinkNumber == 2){
                    msg = "You have selected soda";
                } else if (drinkNumber == 3) {
                    msg = "You have selected juice";
                }else{
                    msg = "Invalid input";
                }
                break;
            case "Snacks":
                System.out.println("Your choice Snacks (click on 1,2,3): \n\t1) Candies\n\t2) Pringles\n\t3) Chips\n\tYour number");
                int snackNumber = input.nextInt();

                if(snackNumber == 1){
                    msg = "You have selected candies";
                } else if (snackNumber == 2){
                    msg = "You have selected pringles";
                } else if (snackNumber == 3) {
                    msg = "You have selected chips";
                }else{
                    msg = "Invalid input";
                }
                break;
            case "Gum":
                System.out.println("Your choice Gum (click on 1,2,3): \n\t1) Love is\n\t2) Turbo\n\t3) Dirol\n\tYour number");
                int gumNumber = input.nextInt();

                if(gumNumber == 1){
                    msg = "You have selected Love is";
                } else if (gumNumber == 2){
                    msg = "You have selected Turbo";
                } else if (gumNumber == 3) {
                    msg = "You have selected Dirol";
                }else{
                    msg = "Invalid input";
                }
                break;
            default:
                msg = "Not valid selection";
        }
    }
}
