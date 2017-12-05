/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LectureNotes1to8;

/**
 *
 * @author dsli
 */
public class CallByValueExample {
    public static void main(String[] args) {
        double d = 10;
        d = m(d);
        System.out.println(d);
    }
    public static double m(double d) {
        d = 20;
        return d;
    }
}
