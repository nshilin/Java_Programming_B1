package day09_b_if_statements;

import java.util.Scanner;

/*
    boolean variable isHungry
    if the person is hungry,print: You are hungry, so I will get some food for you
    if the person is not hungry, print: Great, then practice java
 */
public class CheckHunger {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ruslan, are you hungry(true or false):");
        boolean isHungry = input.nextBoolean();

        if(isHungry) {
            System.out.println("Let's go to Texas DeBrazil");
        }else{
            System.out.println("I can not stay without eating anything. Give me something at least");
        }
        }



    }

