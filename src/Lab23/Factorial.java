/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab23;

/**
 *
 * @author dsli
 */
public class Factorial {
    public static int getFactorial(int i) {
        if (i == 0)
            return 1;
        else
            return i * getFactorial(i - 1);
    }
    public static void main(String[] args) {
        System.out.println(getFactorial(5));
        System.out.println(getFactorial(4));
        System.out.println(getFactorial(3));
        System.out.println(getFactorial(2));
        System.out.println(getFactorial(6));
    }
}
