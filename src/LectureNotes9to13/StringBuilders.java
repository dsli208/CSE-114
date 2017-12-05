/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LectureNotes9to13;

/**
 *
 * @author dsli
 */
public class StringBuilders {
    
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder(5);
        s1.append("Brendan Zotto");
        s1.delete(0, 7);
        s1.append(50);
        System.out.println(s1);
        s1.delete(0, 1); s1.delete(5, s1.length());
        s1.insert(0, "Shahajahan ");
        System.out.println(s1);
        s1.delete(11, s1.length());
        s1.append(new char[]{'C', 'h', 'o', 'w', 'd', 'h', 'u', 'r', 'y'});
        System.out.println(s1);
        for (int i = s1.length() - 1; i >= 11; i--) {
            s1.deleteCharAt(i);
        }
        //Do not use the below code to delete successive characters, that would print Shahajahan hwhr
        /*for (int i = 11; i < s1.length(); i++) {
            s1.deleteCharAt(i);
        }*/
        System.out.println(s1);
        System.out.println(s1.reverse());
        s1.reverse();
        s1.replace(0, 10, "Jenry Martinez");
        System.out.println(s1);
        s1.insert(6, new char[] {'N', 'i', 'e', 't', 'o', ' '});
        System.out.println(s1);
    }
}
