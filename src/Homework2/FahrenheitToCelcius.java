/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homework2;
//David Li, 110328771
import java.util.Scanner;

/**
 *
 * @author dsli
 */
public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a temperature in degrees Fahrenheit: ");
        double degF = input.nextDouble();
        double degC = (degF - 32) * (5.0 / 9);
        System.out.println("The temperature is " + degC + " degrees Celcius.");
    }
}
