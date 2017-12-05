//David Li, 110328771
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homework6;

/**
 *
 * @author dsli
 */
public class MyPoint {
    private double x = 0;
    private double y = 0;
    public MyPoint() {}
    public MyPoint(double x, double y) {
        this.x = x; this.y = y;
    }
    public double getX() {return x;}
    public double getY() {return y;}
    public double distance(MyPoint m) {
        return Math.sqrt(Math.pow(m.getX() - x, 2) + Math.pow(m.getY() - y, 2));
    }
    public double distance(double x2, double y2) {
        return Math.sqrt(Math.pow(x - x2, 2) + Math.pow(y - y2, 2));
    }
}

class TestPoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        System.out.println("The coordinates of the point p1 are (" + p1.getX() + ", " + p1.getY() + ")");
        MyPoint p2 = new MyPoint(10, 30.5);
        System.out.println("The coordinates of the point p1 are (" + p2.getX() + ", " + p2.getY() + ")");
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance(10, 30.5));
    }
}
