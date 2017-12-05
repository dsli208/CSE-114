/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homework7;
//David S. Li, 110328771

import java.util.Scanner;

/**
 *
 * @author dsli
 */
public class Complex extends Number implements java.lang.Cloneable, java.lang.Comparable {
    private double a = 0;
    private double b = 0;
    public Complex() {}
    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public Complex(double a) {
        this.a = a;
    }
    public Complex add(Complex c) {
        return new Complex(a + c.a, b + c.b);
    }
    public Complex subtract(Complex c) {
        return new Complex(a - c.a, b - c.b);
    }
    public Complex multiply(Complex c) {
        return new Complex((a * c.a) - (b * c.b), (b * c.a) - (a * c.b));
    }
    public Complex divide(Complex c) {
        return new Complex((((a * c.a) + (b * c.b)) / ((Math.pow(c.a, 2) + Math.pow(c.b, 2)))), ((b * c.a) - (a * c.b)) / ((Math.pow(c.a, 2) + Math.pow(c.b, 2))));
    }
    //get real part
    public double getRealPart() {
        return a;
    }
    public double getImaginaryPart() {
        return b;
    }
    @Override
    public String toString() {
        if (b == 0) {
            return a + "";
        }
        return a + " + " + b + "i";
    }
    
    //Abstract "Number" class methods that need to be implemented
    @Override
    public double doubleValue(){
        return a;
    }
    
    @Override
    public long longValue() {
        return (long)a;
    }
    
    @Override
    public float floatValue() {
        return (float)a;
    }
    
    @Override
    public int intValue() {
        return (int)a;
    }
    
    //CompareTo method - note: this compares complex objects based on their real parts
    @Override
    public int compareTo(Object o) {
        if (a < ((Complex)o).a)
            return 1;
        else if (a > ((Complex)o).a)
            return -1;
        else return 0;
    }
    
    @Override
    public Complex clone() throws CloneNotSupportedException {
        Complex complexClone = (Complex)super.clone();
        return complexClone;
    }
}

class TestComplex {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers a and b to form the first Complex number: ");
        double a1 = input.nextDouble();
        double b1 = input.nextDouble();
        System.out.print("Now enter two more numbers a and b to form the second Complex number: ");
        double a2 = input.nextDouble(); double b2 = input.nextDouble();
        Complex c1 = new Complex(a1, b1);
        Complex c2 = new Complex(a2, b2);
        System.out.println("The first complex number is " + c1 + ".  It has a real part of " + c1.getRealPart() + " and an imaginary part of " + c1.getImaginaryPart());
        System.out.println("The second complex number is " + c2 + ".  It has a real part of " + c2.getRealPart() + " and an imaginary part of  " + c2.getImaginaryPart());
        System.out.println("The sum of the numbers is " + c1.add(c2));
        System.out.println("The difference between the numbers is " + c1.subtract(c2));
        System.out.println("The product of the two numbers is " + c1.multiply(c2));
        System.out.println("And finally, the quotient of the two numbers is " + c1.divide(c2));
        System.out.println("Which complex number is bigger?");
        //Also implementing compareTo() and clone()
        if (c1.compareTo(c2) == 1)
            System.out.println("c1 is bigger than c2");
        else if (c1.compareTo(c2) == -1)
            System.out.println("c1 is smaller than c2");
        else
            System.out.println("The two numbers are equal");
        System.out.println(c1.clone());
    }
}