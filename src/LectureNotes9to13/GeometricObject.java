/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LectureNotes9to13;

/**
 *
 * @author dsli
 */
public abstract class GeometricObject {
    public String toString() {
        return "This is a GeometricObject";
    }
    private String color;
    public GeometricObject(String color) {
        this.color = color;
    }
    abstract double getArea();
    public static void main(String[] args) {
        GeometricObject c1 = new Circle("Red", 2);
        Circle c2 = new Circle("Blue", 5);
        Rectangle r1 = new Rectangle("Green", 2, 5);
        GeometricObject r2 = new Rectangle("Purple", 5.5, 6);
    }
}

class Circle extends GeometricObject {
    private double radius;
    public Circle(String color, double radius) {
        //note color CANNOT be initialized, as it is a private color in the superclass, so use the "super" constructor
        super(color);
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return (Math.PI * radius * radius);
    }
    public String toString() {
        return "This is a cricle and it is a subclass of " + super.toString();
    }
}

class Rectangle extends GeometricObject {
    private double width, height;
    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        return (width * height);
    }
}

/*class RedCircle extends Circle {
    public String toString() {
        return "RedCircle " + super.toString();
    }
    public RedCircle(double radius) {
        
    }
}*/