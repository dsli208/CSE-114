/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab24;

/**
 *
 * @author dsli
 */
public class SumInteger {
    public static int sumInteger(int i) {
        if (i < 10)
            return i;
        else
            return (i % 10) + sumInteger(i / 10);
    }
    public static void main(String[] args) {
        System.out.println(sumInteger(23));
    }
}
