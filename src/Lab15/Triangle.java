/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab15;
/**
 *
 * @author dsli
 */
public class Triangle extends GeometricObject {
    double side1 = 1, side2 = 2, side3 = 3;
    public Triangle() {}
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s  - side1) * (s - side2) * (s - side3));
    }
    
    public double getPerimeter() {
        return (side1 + side2 + side3);
    }
    @Override
    public String toString() {
        return "The triangle has an area of " + getArea() + " and a perimeter of " + getPerimeter() + ".  The color is " + super.getColor() + " and the triangle is " + ((super.isFilled() == true) ? "" : "not ") + "filled.";
    }
}

class TestTriangle {
    public static void main(String[] args) {
        Triangle t = new Triangle(1, 1.5, 1);
        t.setColor("yellow");
        t.setFilled(true);
        System.out.println(t);
    }
}