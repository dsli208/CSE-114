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
public class ExceptionEx1 {
    public static void main(String[] args) {
        
        try {
            m2();
        }
        //Can use try-catch to handle exception yourself, or throw it to a superclass (or to JVM if this is the main method)
        catch(Exception e) {
            System.out.println("Cannot divide by 0");
        }
    }
    public static int m1(int i1, int i2) throws Exception {
        if (i2 == 0)
            throw new Exception();
        return i1 / i2;
    }
    
    public static void m2() throws Exception {
        //NOTE: If you put the throw statement AND a try-catch, the try-catch will be invoked first
        //The method will do whatever it can to handle an exception itself BEFORE throwing it to a superclass or the JVM
        try {
            System.out.println(m1(1, 0));
        }
        catch (Exception ex) {
            System.out.println("Exception caught");
        }
    }
}
