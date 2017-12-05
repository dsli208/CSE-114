/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homework5;
//David Li 110328771
/**
 *
 * @author dsli
 */
public class PrimeNumbers {
    public static void main(String[] args) {
        int primeCount = 0;
        int x = 2;
        while (primeCount < 1000) {
            if (isPrime(x) == true) {
                System.out.print(x + " ");
                primeCount++;
                if (primeCount % 10 == 0)
                System.out.println();
            }
            x++;
        }
    }
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
