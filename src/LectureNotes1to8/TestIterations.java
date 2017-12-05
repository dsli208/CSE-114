package LectureNotes1to8;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dsli
 */
public class TestIterations {
    public static void main(String[] args) {
        for (int i = 0 ; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        int k = 0;
        do {
            System.out.println(k + " ");
            k++;
            
        } while (k < 10);
        System.out.println();
        int[] a = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int elem:a) {
            System.out.print(elem + " ");
        }
    }
}
