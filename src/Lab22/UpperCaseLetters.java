/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab22;

/**
 *
 * @author dsli
 */
public class UpperCaseLetters {
    public static int getUpperCases(String s) {
        int upperCaseCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i)))
                upperCaseCount++;
        }
        return upperCaseCount;
    }
}
