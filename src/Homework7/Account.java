/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//David S. Li, 110328771
package Homework7;

import java.util.Date;

/**
 *
 * @author dsli
 */
public class Account {
    private int id = 0;
    private double balance = 1000;
    private double annualInterestRate = 4.50;
    private Date dateCreated;
    public Account() {
        this.dateCreated = new Date();
    }
    public Account(int id, double initialBalance) {
        this.id = id;
        this.balance = initialBalance;
        this.dateCreated = new Date();
    }
    public void setID(int id) {
        this.id = id;
    }
    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }
    public void setAnnualInterestRate(double newAnnualInterestRate) {
        this.annualInterestRate = newAnnualInterestRate;
    }
    public int getID() {return id;}
    public double getBalance() {return balance;}
    public double getAnnualInterestRate() {return annualInterestRate;}
    public Date getDateCreated() {return dateCreated;}
    public double getMonthlyInterestRate() {return annualInterestRate / 12;}
    public void withDraw(double money) {
        if (money <= balance)
            balance -= money;
    }
    public void deposit(double money) {
        balance += money;
    }
    
    public void withdraw(double money) {
        if (balance - money >= 0)
            balance -= money;
    }
    @Override
    public String toString() {
        return "Account: \nID #: " + id + "\nBalance: " + getBalance() + "\nAnnual Interest Rate: " + getAnnualInterestRate() + "\nDate created: " + getDateCreated();
    }
}

class TestAccount {
    public static void main(String[] args) {
        /*Account a = new CheckingAccount();
        a.withdraw(1050);
        ((CheckingAccount)a).setOverdraw(100);
        
        System.out.println(a.getBalance());
        a.withdraw(10);
        System.out.println(a.getBalance());
        System.out.println(a.getDateCreated());
        CheckingAccount b = new CheckingAccount();
        System.out.println(b.getDateCreated());*/
        Account a = new Account();
        System.out.println(a);
        Account b = new CheckingAccount(111, 1000, 500);
        System.out.println(b);
        SavingsAccount c = new SavingsAccount(222, 2000);
        System.out.println(c);
    }
}