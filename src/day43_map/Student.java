package day43_map;

public class Student {
    String name;
    double gp;
    int id;

    public Student(String name, double gp,  int id){
        this.name = name;
        this.gp = gp;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student: " +
                "\nname: " + name +
                "\ngp:" + gp +
                "\nid: " + id;
    }
}
