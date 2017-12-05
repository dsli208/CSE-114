/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab20;

/**
 *
 * @author dsli
 */
public class Circle extends GeometricObject {
    private double radius = 1;
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Circle() {
        
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString() {
        return super.toString() + "\nRadius: " + getRadius() + "\nPerimeter: " + getPerimeter() + "\nArea: " + getArea();
    }
}
