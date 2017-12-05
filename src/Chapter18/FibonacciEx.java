/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter18;

/**
 *
 * @author dsli
 */
public class FibonacciEx {
    public static long[] f;
    public static long fib(int index) {
        if (index == 0)
            return 0;
        else if (index == 1) {
            f[1] = 1;
            return 1;
        }
        else if (f[index] != 0)
            return f[index];
        else
            f[index] = fib(index - 1) + fib(index - 2);
        return f[index];
    }
}
