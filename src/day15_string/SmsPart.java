package day15_string;
/*Given a String in the following format:
   “Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}
   Separate these parts and print them separately: Sender: actualSender
   Number: actualNumber Message: actualMessage”
    */
public class SmsPart {
    public static void main(String[] args) {
        String msg = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}";

        int sendStart = msg.indexOf("<")+1;
        int sendEnd = msg.lastIndexOf(">");
        String name = msg.substring(sendStart, sendEnd);

        System.out.println(name);

        int numStart = msg.indexOf("[")+1;
        int numEnd = msg.lastIndexOf("]");
        String number = msg.substring(numStart, numEnd);
        System.out.println(number);

        int msgStart = msg.indexOf("{")+1;
        int msgEnd = msg.lastIndexOf("}");
        String message = msg.substring(msgStart, msgEnd);
        System.out.println(message);



        int num = 8;
        int c, g;
        if(num>=3){
            c=num/10;
            num%=10;
            g=num/3;
            System.out.println("we have candies: "+c+"\n we have gumballs: "+g);
        }else{
            System.out.println("not enough coins");
        }
    }
}

