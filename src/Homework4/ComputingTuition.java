/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homework4;
//David Li 110328771
/**
 *
 * @author dsli
 */
public class ComputingTuition {
    public static void main(String[] args) {
        double initialTuition = 10000;
        double total4YearsTuition = 0;
        for (int i = 0; i < 14; i++) {
            initialTuition *= 1.05;
            if (i < 10)
                continue;
            total4YearsTuition += initialTuition;
        }
        System.out.printf("The total cost of 4 years worth of college is $%.2f\n", total4YearsTuition);
    }
}
