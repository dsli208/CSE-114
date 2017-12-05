/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab20;

import java.util.Date;

/**
 *
 * @author dsli
 */
public abstract class GeometricObject implements Comparable, Cloneable {

    /**
     *
     * @return
     */
    //Abstract methods
    public abstract double getArea();
    public abstract double getPerimeter();
    String color;
    boolean filled;
    @Override
    public int compareTo(Object o) {
        double a1 = this.getArea();
        double a2 = ((GeometricObject)o).getArea();
        if (a1 > a2)
            return 1;
        else if (a2 > a1)
            return -1;
        else
            return 0;
    }
    private Date dateCreated;
    public GeometricObject() {
        this("White", false);
        dateCreated = new Date();
    }
    public GeometricObject(String color, boolean filled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    @Override
    public String toString() {
        return "Date created: " + dateCreated + "\nColor: " + color + "\nFilled? " + filled;
    }
    public static GeometricObject max(GeometricObject g1, GeometricObject g2) {
        if (g1.compareTo(g2) > 0)
            return g1;
        else return g2;
    }
    @Override
    public GeometricObject clone() throws CloneNotSupportedException {
        return (GeometricObject)super.clone();
    }
}

class TestGeometricObjectProgram {
    public static void main(String[] args) throws CloneNotSupportedException {
        GeometricObject[] g = new GeometricObject[20];
        g[0] = new Circle(1);
        for (int i = 1; i < 10; i++) {
            //g[i] = new Circle(1);
            g[i] = g[0].clone();
        }
        for (int i = 10; i < 20; i++) {
            g[i] = new Rectangle(2, 4);
        }
        GeometricObject maxObject = g[0];
        for (int i = 0; i < g.length; i++) {
            maxObject = GeometricObject.max(g[i], maxObject);
        }
        System.out.println("The properties of the max object are: \n" + maxObject);
    }
}