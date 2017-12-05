/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter18;

import java.util.Scanner;

/**
 *
 * @author dsli
 */
public class Quiz18 {
    public long ackermann(int m, long n) {
        if (m == 0)
            return n + 1;
        else if (n == 0)
            return ackermann(m - 1, 1);
        else
            return ackermann(m - 1, ackermann(m, n - 1));
    }
    public int mcCarthy(int n) {
        if (n > 100)
            return n - 10;
        else
            return mcCarthy(mcCarthy(n + 11));
    }
}

class Driver18 {
    public static void main(String[] args) {
        int m = -1, n = -1;
        Scanner input = new Scanner(System.in);
        while (m < 0 || n < 0) {
            m = input.nextInt();
            n = input.nextInt();
        }
        Quiz18 q = new Quiz18();
        System.out.println(q.ackermann(m, (long)n));
        System.out.println(q.mcCarthy(10));
    }
}