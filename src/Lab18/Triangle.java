/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab18;

/**
 *
 * @author dsli
 */
public class Triangle {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side3 + side1 > side2)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
        else
            throw new IllegalTriangleException(side1, side2, side3);
    }
}

class IllegalTriangleException extends Exception {

    private double side1;
    private double side2;
    private double side3;

    public IllegalTriangleException(double side1, double side2, double side3) {
        super("Illegal combination: " + side1 + ", " + side2 + ", and " + side3);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public String toString() {
        return side1 + ", " + side2 + ", and " + side3;
    }
}

class TestTriangleWithExceptions {
    public static void main(String[] args) {
        try {
        Triangle t = new Triangle(1, 2, 3);
        }
        catch (IllegalTriangleException e) {
            System.out.println("Illegal triangle formed");
        }
    }
}