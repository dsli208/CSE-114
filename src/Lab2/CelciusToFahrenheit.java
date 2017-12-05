/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

import java.util.Scanner;

/**
 *
 * @author dsli
 */
public class CelciusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a temperature in degrees Celcius: ");
        double degC = input.nextDouble();
        double degF = (1.8 * degC) + 32;
        System.out.println("The temperature in degF is " + degF + " degrees.");
    }
}
