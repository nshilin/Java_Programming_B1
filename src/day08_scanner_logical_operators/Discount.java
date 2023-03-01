package day08_scanner_logical_operators;

public class Discount {
    public static void main(String[] args) {

        boolean isItTheWeekend = true;
        boolean areYouATeacher = true;
        boolean areYouAPoliceOfficer = true;
        boolean areYouAFireFighter = true;

        boolean getsDiscount = isItTheWeekend && (areYouAFireFighter || areYouATeacher || areYouAPoliceOfficer);

        System.out.println("Do you get a discount? " + getsDiscount);
    }
}
/*
declare and assign
                is it the weekend
                are you a teacher
                are you a police officer
                are you a firefighter

             Do you get a discount?
                Must be a weekend day and you must be one of the given professions
﻿
 */