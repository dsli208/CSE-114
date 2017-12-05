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
public class CopyTest {
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3};
        int[] list2 = {4, 5, 6};
        int[] list3 = copy(list2);
        list2 = list1;
        System.out.println(list1[0]);
        System.out.println(list2[0]);
        list2[0] = 7;
        System.out.println(list1[0]);
        System.out.println(list2[0]);
        System.out.println(list3[0]);
    }
    public static int[] copy(int[] x) {
        int[] y = new int[x.length];
        for (int i = 0; i < x.length; i++)
            y[i] = x[i];
        return y;
    }
}
