/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homework5;
//David Li 110328771
import java.util.Scanner;

/**
 *
 * @author dsli
 */
public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        switch (year % 12) {
            case 0: System.out.println(year + " is the year of the monkey."); break;
            case 1: System.out.println(year + " is the year of the rooster."); break;
            case 2: System.out.println(year + " is the year of the dog."); break;
            case 3: System.out.println(year + " is the year of the pig."); break;
            case 4: System.out.println(year + " is the year of the rat."); break;
            case 5: System.out.println(year + " is the year of the ox."); break;
            case 6: System.out.println(year + " is the year of the tiger."); break;
            case 7: System.out.println(year + " is the year of the rabbit."); break;
            case 8: System.out.println(year + " is the year of the dragon."); break;
            case 9: System.out.println(year + " is the year of the snake."); break;
            case 10: System.out.println(year + " is the year of the horse."); break;
            case 11: System.out.println(year + " is the year of the sheep."); break;
        }
    }
}
