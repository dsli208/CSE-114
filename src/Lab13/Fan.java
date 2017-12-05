/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab13;

/**
 *
 * @author dsli
 */
public class Fan {

    private boolean on = false;
    private int speed = 1;
    private double radius = 5;
    private String color = "Blue";

    public Fan() {
    }

    public boolean isOn() {
        return on;
    }

    public void setPower() {
        on = (on == false) ? true : false;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 1 && speed <= 3) {
            this.speed = speed;
        }
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "Fan is " + ((on == true) ? "on. " + "The speed is " + speed + " and the radius is " + radius + "." : "off.") + " The color is " + color;
    }
}

class TestFan {

    public static void main(String[] args) {
        //Create the first Fan object
        Fan f1 = new Fan();
        f1.setPower();
        f1.setRadius(10);
        f1.setSpeed(3);
        f1.setColor("Yellow");
        System.out.println(f1.toString());
        //Now create the second Fan object
        Fan f2 = new Fan();
        f2.setSpeed(2);
        f2.setRadius(5);
        f2.setColor("Blue");
        System.out.println(f2.toString());
    }
}
