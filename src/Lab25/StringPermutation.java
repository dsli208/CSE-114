/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab25;

/**
 *
 * @author dsli
 */
public class StringPermutation {

    public static void getPermutations(String s) {
        getPermutations("", s);
    }

    public static void getPermutations(String s1, String s2) {
        if (s2.length() == 0) { //Base case
            System.out.println(s1);
        } else { //If the base case is not met, this is the recursive call:
            //A for loop is invoked, whereas for each position in s2, the method is recursively invoked, adding a certain character to s1, while removing that character from s2
            for (int i = 0; i < s2.length(); i++) {//
                getPermutations(s1 + s2.charAt(i), s2.substring(0, i) + s2.substring(i + 1));
            }
        }
    }
    
    public static void main(String[] args) {
        getPermutations("abc");
    }
}
