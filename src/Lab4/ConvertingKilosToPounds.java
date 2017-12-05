/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

/**
 *
 * @author dsli
 */
public class ConvertingKilosToPounds {
    public static void main(String[] args) {
        System.out.printf("%10s%10s\n", "Kilograms", "Pounds");
        for (int i = 1; i < 200; i++) {
            double pounds = i * 2.2;
            System.out.printf("%10d%10.2f\n", i, pounds);
        }
    }
}
