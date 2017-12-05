/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab17;

import Lab15.Circle2D;
import Lab15.GeometricObject;

/**
 *
 * @author dsli
 */
public class SumGeometricObjects {
    public static double sumArea(GeometricObject[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++)
            sum += a[i].getArea();
        return sum;
    }
    public static void main(String[] args) {
        GeometricObject[] arr = new GeometricObject[10];
        for (int i = 0; i < 5; i++) {
            arr[i] = new Circle2D(0, 0, 1);
        }
        for (int i = 5; i < 10; i++) {
            arr[i] = new Rectangle(1, 1);
        }
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i].getArea());
    }
}
