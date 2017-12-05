/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9;

/**
 *
 * @author dsli
 */
public class BubbleSort {

    public static void main(String[] args) {
        double[] testArray = {6.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5};
        boolean inOrder = false;
        do {
            boolean changed = false;
            for (int i = 0; i < testArray.length - 1; i++) {
                if (testArray[i] > testArray[i + 1]) {
                    changed = true;
                    double temp = testArray[i];
                    testArray[i] = testArray[i + 1];
                    testArray[i + 1] = temp;
                }
            }
            if (changed == false)
                inOrder = true;
        }while (inOrder == false);
        for (double d: testArray)
            System.out.print(d + " ");
        System.out.println();
    }
}
