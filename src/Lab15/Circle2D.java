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
public class Circle2D extends GeometricObject {
    private double x; private double y;
    private double radius;
    public double getRadius() {
        return radius;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public Circle2D() {
        this(0, 0, 1);
    }
    public double getArea() {
        return (radius * radius * Math.PI);
    }
    public double getPerimeter() {
        return (2 * Math.PI * radius);
    }
    public boolean contains(double x, double y) {
        double distance = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
        return (distance <= radius);
    }
    public boolean overlaps(Circle2D c) {
        double distance = Math.sqrt(Math.pow(c.getX() - x, 2) + Math.pow(c.getY() - y, 2));
        return (distance <= radius + c.getRadius());
    }
    public boolean contains(Circle2D c) {
        double distance = Math.sqrt(Math.pow(c.getX() - x, 2) + Math.pow(c.getY() - y, 2));
        return (distance <= Math.abs(radius - c.getRadius()));
    }
}

class TestCircle2D {
    public static void main(String[] args) {
        Circle2D test = new Circle2D(0, 0, 1);
        System.out.println(test.contains(new Circle2D(0, 0, 0.5)));
    }
}