/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab14;

/**
 *
 * @author dsli
 */
public class Polygon {
    
    public static void main(String[] args) {
        Polygon p = new Polygon();
        System.out.println(p.getPerimeter());
    }

    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    public Polygon() {
    }

    public Polygon(int n, double side) {
        this.n = n;
        this.side = side;
    }

    public Polygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public double getSide() {
        return side;
    }

    public int getN() {
        return n;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }
    
    public void setY(double y) {
        this.y = y;
    }
    
    public void setN(int n) {
        this.n = n;
    }
    
    public double getPerimeter() {
        return (side * n);
    }
    
    
}

class TestPolygon {
    public static void main(String[] args) {
        Polygon p = new Polygon(5, 9.5, 10, 5.43);
        System.out.println(p.getPerimeter());

    }
}

class TestPolygonAgain {
    public static void main(String[] args) {
        Polygon p = new Polygon(5, 5);
        System.out.println(p.getPerimeter());
    }
}