/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author dsli
 */
public class ProcessScores {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("src/Lab19/Scores");
        Scanner reader = new Scanner(f);
        int total = 0;
        int count = 0;
        while (reader.hasNext()) {
            total += reader.nextInt();
            count++;
        }
        double average = ((double)total) / count;
        System.out.println("The total is " + total + " and the average is " + average);
    }
}
