package day44_map;
  /*
    It is an object representation of sequence of characters
    StringBuilder is mutable and CAN be modified
    It is not synchronized - NOT thread safe
    We can ONLY create object of StringBuilder by the "new" keyword
    It is coming from java.lang package
    * */

import java.sql.SQLOutput;

public class StringBuilderPractice {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.reverse();
        System.out.println(stringBuilder);

        stringBuilder.append(2);
        System.out.println(stringBuilder);

        stringBuilder.append("olleh");
        System.out.println(stringBuilder);

        stringBuilder.delete(0, 5);
        System.out.println(stringBuilder);

        stringBuilder.insert(1, "TEST");
        System.out.println(stringBuilder);

    }

}
