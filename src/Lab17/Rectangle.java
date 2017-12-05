/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab17;

import Lab15.GeometricObject;

/**
 *
 * @author dsli
 */
public class Rectangle extends GeometricObject {
    public Rectangle() {}
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    private double width = 1;
    private double length = 1;
    public double getArea() {
        return width * length;
    }
    public double getPerimeter() {
        return (2 * width) + (2 * length);
    }
}
