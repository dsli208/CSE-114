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
public class SavingsAccount extends Account {
    public SavingsAccount() {}
    public SavingsAccount(int id, double initialBalance) {
        super(id, initialBalance);
    }
    @Override
    public String toString() {
        return "Savings " + super.toString();
    }
}
