/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

/**
 *
 * @author dsli
 */
public class TwoPackages {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the weight and price for package 1: ");
        double weight1 = input.nextDouble(); double price1 = input.nextDouble();
        System.out.print("Enter the weight and price for package 2: ");
        double weight2 = input.nextDouble(); double price2 = input.nextDouble();
        System.out.println(((price1 / weight1) < (price2 / weight2)) ? "Package 1 has a better price per pound." : "Package 2 has a better price for pound.");
    }
}
