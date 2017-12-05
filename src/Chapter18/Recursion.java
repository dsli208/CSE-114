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
public class Recursion {
    public static long factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial (n - 1);
    }
    public static int count(char[] chars, char ch) {
        return count(chars, ch , 0);
    }
    public static int count(char[] chars, char ch, int high) {
        if (high == chars.length)
            return 0;
        else if (ch == chars[high])
            return 1 + count(chars, ch, high + 1);
        return count(chars, ch, high + 1);
    }
    public static int upperCaseLetters(String s) {
        return upperCaseLetters(s, 0);
    }
    public static int upperCaseLetters(String s, int high) {
        if (high == s.length())
            return 0;
        else if (Character.isUpperCase(s.charAt(high)))
            return 1 + upperCaseLetters(s, high + 1);
        return upperCaseLetters(s, high + 1);
    }
    public static int sumDigits(int n) {
        if (n < 10)
            return n;
        return (n % 10) + sumDigits(n / 10);
    }
    public static int reverse(int n) {
        return reverse(n, 0);
    }
    public static int reverse(int n, int partReverse) {
        if (n == 0)
            return partReverse;
        return reverse(n / 10, partReverse * 10 + n % 10);
    }
    public static void main(String[] args) {
        System.out.println(reverse(123456));
        displayPermutation("abc");
    }
    //reverse, but with a SINGLE METHOD
    public static int singleReverse(int n) {
        int count = 0;
        int m = n;
        while (m > 0) {
            count++;
            m /= 10;
        }
        return ((int)Math.pow(singleReverse(n % 10), count));
    }
    public static void displayPermutation(String s) {
        displayPermutation("", s);
    }
    public static void displayPermutation(String s1, String s2) {
        if (s2.length() == 0)
            System.out.println(s1);
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            displayPermutation(s1 + c, s2.substring(0, i) + s2.substring(i + 1));
        }
    }
}