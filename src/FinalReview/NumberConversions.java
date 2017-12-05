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
public class NumberConversions {
    public static String dec2Bin(int i) {
        String binary = "";
        while (i > 0) {
            binary = (i % 2) + binary;
            i /= 2;
        }
        return binary;
    }
    public static void main(String[] args) {
        System.out.println(dec2Bin(20));
        System.out.println(bin2Dec("10001"));
        System.out.println(dec2BinRec(20));
        System.out.println(bin2DecRec("10001"));
    }
    public static int bin2Dec(String binary) {
        int dec = 0;
        for (int i = 0, j = binary.length() - 1; i < binary.length() && j >= 0; i++, j--) {
            dec += (int)((binary.charAt(j) - 48) * (int)(Math.pow(2, i)));
        }
        return dec;
    }
    public static String dec2BinRec(int dec) {
        if (dec == 0)
            return "";
        return dec2BinRec(dec / 2) + (dec % 2);
    }
    public static int bin2DecRec(String bin) {
        return bin2DecRec(bin, 0, bin.length() - 1);
    }
    public static int bin2DecRec(String bin, int i, int j) {
        if (i == bin.length() || j < 0) {
            return 0;
        }
        return ((bin.charAt(j) - 48) * (int)(Math.pow(2, i)) + bin2DecRec(bin, i + 1, j - 1));
    }
}
