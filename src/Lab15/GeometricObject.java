/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab15;
import java.util.Date;
import Lab6.TimeZones;
/**
 *
 * @author dsli
 */
public abstract class GeometricObject {
    private String color = "white";
    private boolean filled = false;
    private Date dateCreated;
    protected GeometricObject() {
        dateCreated = new Date();
    }
    protected GeometricObject(String color, boolean filled) {
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
    public String toString() {
        return "Date created: " + dateCreated + "\nColor: " + color + "\nFilled? " + filled;
    }
    //Abstract methods below
    public abstract double getArea();
    public abstract double getPerimeter();
}
