/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

import java.util.Scanner;

/**
 *
 * @author dsli
 */
public class ApproximateSquareRoot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for n: ");
        long n = input.nextLong();
        double sqrt = sqrt(n);
        System.out.println("The approximation of the square root is " + sqrt);
    }
    public static double sqrt(long n) {
        double lastGuess = 0;
        double nextGuess = 1;
        do {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + (n / lastGuess)) / 2;
        } while ((Math.abs(nextGuess - lastGuess) >= 0.0001));
        return nextGuess;
    }
}
