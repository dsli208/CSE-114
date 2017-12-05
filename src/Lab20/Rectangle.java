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
public class Rectangle extends GeometricObject {
    private double length;
    private double width;
    public Rectangle() {
        this(1, 1);
    }
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    @Override
    public double getArea() {
        return length * width;
    }
    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }
    @Override
    public String toString() {
        return super.toString() + "\nLength: " + getLength() + "\nWidth: " + getWidth() + "\nPerimeter: " + getPerimeter() + "\nArea: " + getArea();
    }
}
