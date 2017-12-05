/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

import java.util.Scanner;

/**
 *
 * @author dsli
 */
public class ConvertMilliseconds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter milliseconds: ");
        long s = input.nextLong();
        String time = convertMillis(s);
        System.out.println(time);
    }
    
    public static String convertMillis(long millis) {
        long totalSeconds = millis / 1000;
        long second = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long minute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        return totalHours + ":" + minute + ":" + second;
    }
}
