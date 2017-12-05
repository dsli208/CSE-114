/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab21;

import java.util.Scanner;

/**
 *
 * @author dsli
 */
public class HexFormatException extends NumberFormatException {

    private char c;

    //Constructor
    public HexFormatException(char c) {
        super("Invalid character for hex String: " + c);
        this.c = c;
    }

    //Get the invalid char
    public char getInvalidChar() {
        return c;
    }
}

class HexFormatExceptionDriver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex String: ");
        String hexString = input.next();
        int decNum = hexToDecimal(hexString);
        System.out.println(decNum);
    }

    public static int hexToDecimal(String s) throws HexFormatException {
        int sum = 0;
        for (int i = s.length() - 1, j = 0; i >= 0; i--, j++) {
            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'F'))
                sum += (s.charAt(i) - 55) * (int)(Math.pow(16, j));
            else if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
                sum += (s.charAt(i) - 48) * (int)(Math.pow(16, j));
            else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'f')
                sum += (s.charAt(i) - 87) * (int)(Math.pow(16, j));
            else
                throw new HexFormatException(s.charAt(i));
        }
        return sum;
    }
}
