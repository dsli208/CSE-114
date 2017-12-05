/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab18;

import java.util.InputMismatchException;

/**
 *
 * @author dsli
 */
public class Calculator {
    public static void main(String[] args) throws NumberFormatException {
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        /*args = new String[3];
        args[0] = "2";
        args[1] = "+";
        args[2] = "20";*/
        System.out.println(args.length);
        if (args.length != 3) {
            System.out.println("Use: java Calculator n1 Operator n2");
            System.exit(0);
        }
        try {
            num1 = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException e1) {
            System.out.println(args[0] + " is not an integer");
        }
        try {
            num2 = Integer.parseInt(args[2]);
        }
        catch (NumberFormatException e2) {
            System.out.println(args[2] + " is not an integer");
        }
        switch (args[1].charAt(0)) {
            case '+': System.out.println("Result is " + (num1 + num2)); break;
            case '-': System.out.println("Result is " + (num1 - num2)); break;
            case '*': System.out.println("Result is " + (num1 * num2)); break;
            case '/': try {
                System.out.println("Result is " + (num1 / num2)); break;
            }
            catch (Exception e) {
                System.out.println("No division by 0 allowed");
            } break;
            default: System.out.println("You must put +, -, *, or / between numbers.");
        }
    }
}
