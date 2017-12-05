/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//David S. Li, 110328771
package Homework7;

/**
 *
 * @author dsli
 */
public class CheckingAccount extends Account {
    private double overdraw;
    public CheckingAccount(int id, double initialBalance, double overdraw) {
        super(id, initialBalance);
        this.overdraw = overdraw;
    }
    public CheckingAccount(int id, double initialBalance) {
        super(id, initialBalance);
    }
    public CheckingAccount() {}
    public void setOverdraw(double overdraw) {
        this.overdraw = overdraw;
    }
    public double getOverdraw() {
        return overdraw;
    }
    //The checking account withdraw method - as the checking account withdraw process includes a overdraw limit, the superclass method must be
    //overridden to allow for this special provision
    //-1 * overdraw --> the new withdraw limit for the checking account
    @Override
    public void withdraw(double money) {
        double newAmount = super.getBalance() - money;
        if (newAmount >= (-1 * overdraw))
            super.setBalance(newAmount);
    }
    @Override
    public String toString() {
        return "Checking " + super.toString() + "\nOverdraw Limit: " + getOverdraw();
    }
}
