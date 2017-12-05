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
public class UppercaseLetters {
    public static void main(String[] args) {
        System.out.println(getUpperCaseLetters("HeLlO"));
    }
    public static int getUpperCaseLetters(String s) {
        if (s.length() == 1) {
            if (Character.isUpperCase(s.charAt(0)))
                return 1;
            else
                return 0;
            
        }
        else {
            int z = 0;
            if (Character.isUpperCase(s.charAt(0)))
                z++;
            return z + getUpperCaseLetters(s.substring(1));
        }
    }
}
