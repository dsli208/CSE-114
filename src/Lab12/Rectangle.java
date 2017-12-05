/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab12;

/**
 *
 * @author dsli
 */
public class Rectangle {
    private double width = 1;
    private double height = 1;
    String color = "white";
    public Rectangle() {}
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return (2 * width) + (2 * height);
    }
}

class testRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("The area of rectangle r1 is " + r1.getArea() + " and the perimeter is " + r1.getPerimeter());
        Rectangle r2 = new Rectangle(4.5, 5.6);
        System.out.println("The area of rectangle r2 is " + r2.getArea() + " and the perimeter is " + r2.getPerimeter());
    }
}
