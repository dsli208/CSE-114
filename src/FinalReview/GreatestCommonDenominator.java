/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalReview;

/**
 *
 * @author dsli
 */
public class GreatestCommonDenominator {
    public static int findGCD(int m, int n) {
        int min = (m < n) ? m : n;
        for (int i = m; i > 1; i++) {
            if (m % i == 0 && n % i == 0)
                return i;
        }
        return 1;
    }
    public static int recFindGCD(int m, int n) {
        if (m % n == 0) return n;
        else return recFindGCD(n, m % n);
    }
}
