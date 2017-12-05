/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LectureNotes9to13;

import java.util.Scanner;

/**
 *
 * @author dsli
 */
public class ExceptionNote1 {
    public static int quotient(int number1, int number2) throws Exception {
        if (number2 == 0)
            throw new ArithmeticException("What?");
        return number1 / number2;
    }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt(); int num2 = input.nextInt();
        System.out.println(quotient(num1, num2));
    }
}
