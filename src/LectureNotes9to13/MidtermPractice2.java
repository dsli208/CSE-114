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
public class MidtermPractice2 {
    public static void main(String[] args) {
        A1 b1 = new B1();
        b1.m(1);
        ((B1)b1).m(1.0); //Note that the object above, while it is a B1 object, is associated only with the A1 data type - to access the method with a double parameter, you MUST cast it down to a B1 object
    }
}

class A1 {
    public void m(int x) {
        System.out.println("breakpoint 1");
    }
}

class B1 extends A1 {
    public void m(double x) {
        System.out.println("breakpoint 2");
    }
}