package day35_inheritance.person;

public class Building {
    public static void main(String[] args) {

        Person person = new Person();
        person.name = "James Bond";
        person.age = 40;
        person.favoriteHobby = "spy";
        person.talk();
//      person.study(); //since this belongs to a child, a parent class object can NOT access it

        Student student = new Student();
        student.name = "Tom Jerry";
        student.age = 30;
        student.favoriteHobby = "cheat";
        student.talk();
        student.funLevel = 100;
        student.study();
    }
}
