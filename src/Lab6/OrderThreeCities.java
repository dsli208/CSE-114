/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

import java.util.Scanner;

/**
 *
 * @author dsli
 */
public class OrderThreeCities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three cities: ");
        String city1 = input.nextLine();
        String city2 = input.nextLine();
        String city3 = input.nextLine();
        if (city1.compareTo(city2) > 0) {
            String temp = city1;
            city1 = city2;
            city2 = temp;
        }
        if (city1.compareTo(city3) > 0) {
            String temp = city1;
            city1 = city3;
            city3 = temp;
        }
        if (city2.compareTo(city3) > 0) {
            String temp = city2;
            city2 = city3;
            city3 = temp;
        }
        System.out.println("In alphabetical order, the cities are " + city1 + ", " + city2 + ", and " + city3);
    }
}
