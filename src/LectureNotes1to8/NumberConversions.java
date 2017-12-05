/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LectureNotes1to8;

/**
 *
 * @author dsli
 */
public class NumberConversions {
    public static void main(String[] args) {
        System.out.println(hex2Dec("AB"));
        System.out.println(decToBinary(123));
    }
    public static int hex2Dec(String hex) {
        int n = 0, p = 0;
        for (int i = hex.length() - 1; i >= 0; i--, p++) {
            char c = hex.charAt(i);
            if (c >= '0' && c <= '9')
                n += (int)Math.pow(16, (c - '0'));
            else
                n += (Character.toUpperCase(c) - 'A' + 10) * (int)Math.pow(16, p);
        }
        return n;
    }
    public static String decToBinary(int i) {
        String sum = "";
        while (i > 0) {
            sum = (i % 2) + sum;
            i /= 2;
        }
        return sum + "";
    }
    
    public static String decToHex(int i) {
        String h = "";
        while (i > 0) {
            h = (i % 16) + h;
            i /= 2;
        }
        return h;
    }
    
    public static int bintoDec(String b) {
        int n = 0, p = 0;
        for (int i = b.length() - 1; i >= 0; i--) {
            if (b.charAt(i) >= '0' && b.charAt(i) <= '9')
                n += (b.charAt(i) - '0');
            else if (b.charAt(i) >= 'A' && b.charAt(i) <= 'F')
                n += (b.charAt(i) - 'A' + 10);
        }
        return n;
    }
}
