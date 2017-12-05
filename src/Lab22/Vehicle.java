/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab22;

/**
 *
 * @author dsli
 */
public abstract class Vehicle implements Cloneable, Comparable{
    private int maxCapacity;
    public void start() {
        System.out.println("Starting");
    }
    public void stop() {
        System.out.println("Stopping");
    }
    public void setMaxCapacity(int newCapacity) {
        maxCapacity = newCapacity;
    }
    @Override
    public int compareTo(Object o) {
        if (o instanceof Vehicle) {
            if (this.maxCapacity > ((Vehicle)o).maxCapacity)
                return 1;
            else if (this.maxCapacity < ((Vehicle)o).maxCapacity)
                return -1;
        }
        return 0;
    }
    public int getMaxCapacity() {
        return maxCapacity;
    }
    @Override
    public Vehicle clone() throws CloneNotSupportedException {
        return (Vehicle)super.clone();
    }
}

class Boat extends Vehicle implements Cloneable, Comparable {
    public void floatOnWater() {
        System.out.println("Floating on water");
    }
}

class Car extends Vehicle implements Cloneable, Comparable {
    public void honk() {
        System.out.println("Honk honk!");
    }
}

class Plane extends Vehicle implements Cloneable, Comparable {
    
}

class Driver {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.setMaxCapacity(5);
        System.out.println(v.getMaxCapacity());
        ((Car)v).honk();
        Vehicle v2 = new Boat();
        v2.start();
        
    }
}