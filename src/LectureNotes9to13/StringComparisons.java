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
public class StringComparisons {

    public static void main(String[] args) {
        String s1 = new String("Welcome");
        String s2 = "Welcome";
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        String s3 = "Java";
        s3 = "HTML";
        System.out.println(s3);
        if (s1.compareTo(s2) > 0)
            System.out.println("s1 is greater than s2");
        else if (s1.compareTo(s2) == 0)
            System.out.println("s1 is equal to s2");
        else
            System.out.println("s1 is less than s2");
        System.out.println(s2.compareTo(s3));
    }
}

class TestStringMethods {
    public static void main(String[] args) {
        String s1 = "   String String  ";
        String s2 = "Regex String";
        String s3 = "";
        System.out.println(s1.trim());
        System.out.println(s1.replace('S', 'T'));
        System.out.println(s1.replaceFirst("String", "Regex"));
        System.out.println(s1.replaceAll("String", s2));
        String[] stAr = s2.split(" ");
        for (int i = 0; i < stAr.length; i++) {
            System.out.println(stAr[i]);
        }
    }
}