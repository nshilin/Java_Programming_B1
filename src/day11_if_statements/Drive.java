package day11_if_statements;
/*
declare a variable called speed
 */
public class Drive {
    public static void main(String[] args) {
        int speed = -10;

        if(speed>=90){
            System.out.println("Your speed limit is requiring jail");
        }else if (speed>=70 && speed<90){
            System.out.println("Your speed limit requires your driver license suspension");
        }else if (speed>=60 && speed<70){
            System.out.println("Your speed limit requires court");
        }else if (speed>=50 && speed<60){
            System.out.println("Your speed limit requires a ticket");
        }else if (speed>=35 && speed<=50){
            System.out.println("Going to slow or you are parked");
        }else{
            System.out.println("Not valid input");
        }


    }
}
