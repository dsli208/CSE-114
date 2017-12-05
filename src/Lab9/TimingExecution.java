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
public class TimingExecution {

    public static void main(String[] args) {

        int[] randomIntegers = new int[100000];
        for (int i = 0; i < randomIntegers.length; i++) {
            randomIntegers[i] = (int) (Math.random() * 100000);
        }
        int key = (int) (Math.random() * 100000);
        int keyIndex = -1;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < randomIntegers.length; i++) {
            if (randomIntegers[i] == key) {
                keyIndex = i;
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        if (key == -1) {
            System.out.println("The key is " + key + ", but it is not found in the array.");
        } 
        else {
            System.out.println("The key is " + key + " and it is first found at index " + keyIndex + " in the array.");
        }
        System.out.println("The whole process took " + (endTime - startTime) + " milliseconds.");
    }
}
