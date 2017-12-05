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
public class OccurencesOfChars {
    public static void main(String[] args) {
        String s = "Welcome Welcome Welcome";
        System.out.println(count(s.toCharArray(), 'e'));
    }
    public static int count(char[] ch, char c) {
        return count(ch, c, 0);
    }
    public static int count(char[] ch, char c, int high) {
        if (high == ch.length - 1) { //Base case, to be implemented when the end of the array is reached
            if (ch[high] == c)
                return 1;
            else
                return 0;
        }
        else { //recursive calls
            if (ch[high] == c)
                return 1 + count(ch, c, high + 1);
            else
                return count(ch, c, high + 1);
        }
    }
}
