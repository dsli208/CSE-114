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
public class MidtermPractice1 {

    public static void main(String[] args) {
        A b = new B();
        System.out.println(b.m());
    }
}

class A {

    public String m() {
        return "a";
    }
}

class B extends A {

    public String m() {
        return super.m() + "b";
    }
}
