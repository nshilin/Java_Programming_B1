package day17_loops;

import java.util.Scanner;

public class AtmLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to ATM");
        int userInputPin;
        int validPin = 1788;
        int attempt = 1;

        do{
            System.out.println("Enter a pin: ");
            userInputPin = input.nextInt();
            attempt++;
        }
        while(attempt <=3 && validPin != userInputPin);

        if(validPin == userInputPin){
            System.out.println("You are logged in");
        }else{
            System.out.println("You are locked out. Please contact customer service");
        }
    }
}
