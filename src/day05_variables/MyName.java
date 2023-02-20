package day05_variables;

public class MyName {
    public static void main(String[] args) {

        char letterOne = 'N';
        char letterTwo = 'a';
        char letterThree = 't';
        char letterFour = 'a';
        char letterFive = 'l';
        char letterSix = 'i';
        char letterSeven = 'e';

        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(letterThree);
        System.out.println(letterFour);
        System.out.println(letterFive);
        System.out.println(letterSix);
        System.out.println(letterSeven);

        System.out.println();

        System.out.println(letterOne + letterTwo + letterThree + letterFour + letterFive + letterSix + letterSeven);

        String name = "" + letterOne + letterTwo + letterThree + letterFour + letterFive + letterSix + letterSeven;
        System.out.println(name);
    }
}
