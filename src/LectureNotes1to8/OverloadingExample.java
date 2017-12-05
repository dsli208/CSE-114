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
public class OverloadingExample {
    public static void main(String[] args) {
        System.out.println(max(2.4, 4.5));
        System.out.println(max(2, 4));
    }
    public static double max(double d1, double d2) {
        return Math.max(d1, d2);
    }
    public static int max(int i1, int i2) {
        return Math.max(i1, i2);
    }
}
