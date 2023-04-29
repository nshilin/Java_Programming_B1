package day36_inheritance.shapes;

public class Circle extends Shape{

    double radius;
    public Circle (double circle) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double are (){
        return radius * radius * Math.PI;
    }

    @Override
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
}
