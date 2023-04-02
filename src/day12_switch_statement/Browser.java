package day12_switch_statement;


import java.util.Scanner;

/*
Ask a user to enter Browser type (Single word)
chrome
edge
safari
opera
mozilla


Ask a user to enter URL

 */
public class Browser {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your browser");
        String browser = input.next();

        System.out.println("Enter URL: ");
        String url = input.next();

        switch(browser){
            case "Chrome":
            case "chrome":
            case "CHROME":
                System.out.println("Going into the " + url + " in browser");
                break;
            case "edge":
                System.out.println("Going into the " + url + " in " + browser + " browser");
                break;
            case "safari":
                System.out.println("Going into the " + url + " in " + browser + " browser");
                break;
            case "firefox":
                System.out.println("Going into the " + url + " in " + browser + " browser");
                break;
            default:
                System.out.println(browser + " is invalid browser type");


        }

    }
}