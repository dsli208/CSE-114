/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

import java.util.Scanner;

/**
 *
 * @author dsli
 */
public class SortingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int n1 = input.nextInt(); int n2 = input.nextInt(); int n3 = input.nextInt();
        
        if (n1 > n3) {
            int temp = n1;
            n1 = n3;
            n3 = temp;
        }
        if (n1 > n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        if (n2 > n3) {
            int temp = n2;
            n2 = n3;
            n3 = temp;
        }
        
        
        System.out.println("The numbers are " + n1 + ", " + n2 + ", and " + n3);
    }
}
