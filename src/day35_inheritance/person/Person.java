package day35_inheritance.person;
//Super class -- Parent class --
public class Person {
    String name;
    int age;
    String favoriteHobby;

    //instance methods/actions can inherit

    public void talk () {
        System.out.println(name + " is talking");
    }
}
