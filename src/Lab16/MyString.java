/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab16;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author dsli
 */
public class MyString {
    private char[] chars;
    public MyString(char[] chars) {
        this.chars = chars;
    }
    public String toString() {
        String s = "";
        for (int i = 0; i < chars.length; i++) {
            s = s + chars[i] + "";
        }
        return s;
        //return Arrays.toString(chars);
    }
    public char charAt(int index) {
        return chars[index];
    }
    public int length() {
        return chars.length;
    }
    public MyString substring(int begin, int end) {
        char[] newChars = new char[end - begin];
        System.arraycopy(chars, begin, newChars, 0, end - begin);
        return new MyString(newChars);
    }
    public MyString toLowerCase() {
        char[] lowerCaseChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z')
                lowerCaseChars[i] = (char)(chars[i] + 32);
            else
                lowerCaseChars[i] = chars[i];
        }
        return new MyString(lowerCaseChars);
    }
    public boolean equals(MyString s) {
        return (toString().equals(s.toString()));
    }
    public static MyString valueOf(int i) {
        String s = i + "";
        return new MyString(s.toCharArray());
    }
    public MyString[] split(String s) {
        String testString = new String(chars);
        ArrayList<MyString> arr = new ArrayList<MyString>();
        //MyString[] arr = new MyString[0];
        int i = 0;
        boolean traversed = false;
        while (traversed == false) {
            if (testString.indexOf(s) == -1) {
                traversed = true; 
                arr.add(new MyString(testString.toCharArray()));
            }
            else {
                arr.add(new MyString(testString.substring(i, testString.indexOf(s)).toCharArray()));
                /*MyString[] temp = new MyString[arr.length + 1];
                System.arraycopy(arr, 0, temp, 0, arr.length);*/
                /* = temp;
                arr[i] = new MyString(testString.substring(0, testString.indexOf(s)).toCharArray());*/
                testString = testString.substring(testString.indexOf(s) + s.length());
            }
        }
        MyString[] finalArray = new MyString[arr.size()];
        for (int j = 0; j < arr.size(); j++) {
            finalArray[j] = arr.get(j);
        }
        return finalArray;
    }
}

class TestMyString {
    public static void main(String[] args) {
        MyString m = new MyString(new char[] {'A', 'B', 'C', 'D', 'E', 'F'});
        System.out.println(m);
        System.out.println(m.charAt(2));
        System.out.println(m.length());
        System.out.println(m.substring(2, 4));
        System.out.println(m.toLowerCase());
        System.out.println(m.equals(new MyString(new char[]{'A', 'B', 'C', 'D', 'E', 'F'})));
        MyString m2 = new MyString(new char[] {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'});
        MyString[] marr = m2.split("o");
        for (int i = 0; i < marr.length; i++) {
            System.out.println(marr[i].toString());
        }
    }
}