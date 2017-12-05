/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LectureNotes9to13;

import java.util.ArrayList;

/**
 *
 * @author dsli
 */
public class Count {
    public static int count(String s, String sub) {
        int count = 0;
        int i = 0;
        while (s.indexOf(sub, i) > 0) {
            count++;
            i = s.indexOf(sub) + sub.length();
        }
        return count;
    }
    public static String[] split(String s, String d) {
        ArrayList<String> l = new ArrayList<String>();
        int pos = 0;
        while (s.indexOf(d) > 0) {
            l.add(s.substring(0, s.indexOf(d)));
            pos = s.indexOf(d, pos) + 1;
        }
        l.add(s.substring(pos, s.indexOf(d)));
        //copy the elements from the ArrayList to an array of Strings
        String[] result = new String[l.size()];
        for (int i = 0; i < l.size(); i++) {
            result[i] = l.get(i);
        }
        return result;
    }
    public static int indexOf(char[] s, char[] sub) {
        for (int i = 0; i < s.length; i++) {
            boolean matches = true;
            for (int j = 0; j < sub.length; j++) {
                if (s[i + j] != sub[j])
                    matches = false;
            }
            if (matches)
                return i;
        }
        return -1;
    }
    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        return count;
    }
    public static int[] countDigits(String s) {
        int[] counts = new int[10];
        for (int i = 0; i <= 9; i++) {
            counts[i] = count(s, (char)(i + '0'));
        }
        return counts;
    }
}
