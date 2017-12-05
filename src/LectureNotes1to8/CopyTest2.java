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
public class CopyTest2 {
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 4, 5, 6, 7};
        int[] list2 = new int[7];
        System.arraycopy(list1, 0, list2, 0, 6);
        for (int i: list2)
            System.out.print(i + " ");
    }
}
