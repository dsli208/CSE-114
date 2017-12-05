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
public class ReverseInteger {
    public static String reverse(int i) {
        if (i < 10)
            return i + "";
        return (i % 10) + (reverse(i / 10));
    }
    public static void main(String[] args) {
        System.out.println(reverse(12345));
    }
}
