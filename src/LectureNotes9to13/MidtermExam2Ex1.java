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
public class MidtermExam2Ex1 {
    public static boolean isValid(String s) {
        int digitCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)))
                digitCount++;
            else if (Character.isLetter(s.charAt(i)))
                continue;
            else
                return false;
        }
        if (s.length() < 8 || digitCount < 2)
            return false;
        return true;
    }
    public static boolean isAlsoValid(String s) {
        //Here we need at least one special character to return true, as well as at least one uppercase and one lowercase and one digit
        boolean containsSpecial = false;
        boolean containsUppercase = false;
        boolean containsLowercase = false;
        boolean containsDigit = false;
        for (char c: s.toCharArray()) {
            if (c == '!' || c == '#')
                containsSpecial = true;
            else if (Character.isUpperCase(c))
                containsUppercase = true;
            //or you could write s.matches(".*[A-Z].*")
            else if (Character.isLowerCase(c))
                containsLowercase = true;
            //or you could write s.matches(".*[A-Z].*")
            else if (Character.isDigit(c))
                containsDigit = true;
            else if (Character.isLetter(c))
                continue;
        }
        if (containsSpecial == false || containsUppercase == false || containsLowercase == false || containsDigit == false)
            return false;
        return true;
    }
}
