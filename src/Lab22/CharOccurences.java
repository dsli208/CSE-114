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
public class CharOccurences {
    public static void main(String[] args) {
        
    }
    public static int count(char[] chars, char c) {
        int charCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c)
                charCount++;
        }
        return charCount;
    }
}
