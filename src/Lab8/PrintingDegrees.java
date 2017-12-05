/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

/**
 *
 * @author dsli
 */
public class PrintingDegrees {
    public static void main(String[] args) {
        int first = 0;
        int finalDegree = 360;
        
        System.out.printf("%10s%10s%10s\n", "Degrees", "sin", "cos");
        for (int i = 0; i <= 360; i += 10) {
            System.out.printf("%10d%10.4f%10.4f\n", i, Math.sin(Math.toRadians(i)), Math.cos(Math.toRadians(i)));
        }
    }
}
