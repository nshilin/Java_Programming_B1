package day11_if_statements;

import java.util.Scanner;

/*
ask the user to enter a number based on the language they wanted to use.
    1 - English
    2 - Spanish
    3 - Turkish
    4 - Russian
    5 - French
    6 - Azerbaijan

based on the number they picked print a message:

 */
public class ChooseLanguage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number based on the language they wanted to use" + "\n\t1 - English\n\t2 - Spanish\n\t3 - Turkish\n\t4 - Russian\n\t5 - French\n\t6 - Azerbaijan");

        int languageNum = input.nextInt();
        String message;

        if(languageNum == 1){
            message = "Hello, thank you for the call";
        }else if (languageNum == 2){
            message = "Hola, grasias por la lamada";
        }else if (languageNum == 3){
            message = "Merhaba, aradiginiz icin tesekkurler";
        }else if (languageNum == 4){
            message = "Алло, спасибо за ваш звонок";
        }else if (languageNum == 5){
            message = "Merci, ......";
        }else if (languageNum == 6){
            message = "Tez de gorum. Konturum gurtardi";
        }else{
            message = "Invalid input";
        }

        System.out.println(message);

    }
}
