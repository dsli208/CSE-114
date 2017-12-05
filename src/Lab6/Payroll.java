/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

import java.util.Scanner;

/**
 *
 * @author dsli
 */
public class Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the employee's name: ");
        String employeeName = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double hoursPerWeek = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double hourlyPayRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTaxWithholdingRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTaxWithholdingRate = input.nextDouble();
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Hours worked per week: " + hoursPerWeek);
        System.out.printf("Hourly pay: $%.2f\n", hourlyPayRate);
        double grossPay = (hoursPerWeek * hourlyPayRate);
        System.out.printf("Gross pay: $%.2f]n", grossPay);
        System.out.println("Tax deductions: ");
        double fedDeductions = grossPay * federalTaxWithholdingRate;
        double stateDeductions = grossPay * stateTaxWithholdingRate;
        double totalDeductions = fedDeductions + stateDeductions;
        System.out.printf("\tFederal tax deductions: $%.2f\n", fedDeductions);
        System.out.printf("\tState tax deductions: $%.2f\n", stateDeductions);
        System.out.printf("\tTotal tax deductions: $%.2f\n", totalDeductions);
        System.out.printf("Net pay (with deductions): $%.2f\n", (grossPay - totalDeductions));
    }
}
