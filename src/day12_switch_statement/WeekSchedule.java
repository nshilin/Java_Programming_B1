package day12_switch_statement;

import java.util.Scanner;

public class WeekSchedule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day of the week: ");
        String dayOfWeek = input.next();

        String message = "";

        switch (dayOfWeek) {
            case "Monday":
            case "Mon":
            case "MONDAY":
            case "Friday":
            case "Fri":
            case "FRIDAY":
                message = "We do not have a class";
                break;
            case "Wednesday":
            case "Thursday":
            case "WEDNESDAY":
                message = "We have Java class at 7 pm";
                break;
            case "Saturday":
                message = "We have Java class at 9:30 am";
                break;
            case "Sunday":
                message = "We have Soft Skill class at 9:30 am";
                break;
            default:
                message = "Sunday is not valid";
        }
    }
}