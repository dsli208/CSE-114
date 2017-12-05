/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalReview;

/**
 *
 * @author dsli
 */
public class Employee extends Person {

    private long salary;

    public Employee(String dob, long salary, String name) {
        super(name, dob);
        this.salary = salary;
    } //Constructor for taking in a salary as a String (ex "150,000")

    public Employee(String dob, String name, String s) { //we use s to differentiate the initial salary string from the long variable salary
        super(name, dob);
        String[] sa = s.split(","); //Splits the String by where commas are into an array of Strings
        if (sa.length == 1) {
            salary = Integer.parseInt(sa[0]);
        } else {
            salary = 0;
            for (int i = 0; i < sa.length; i++) {
                salary = salary * 1000 + Integer.parseInt(sa[i]);
            }
        }
    }

    @Override
    public String toString() {
        return "Employee: " + super.toString() + "($" + longNumberToString(salary) + ")";
    }

    public String longNumberToString(long l) {
        String s = "";
        if (l > 1000) {
            s = longNumberToString(salary / 1000) + ",";

            long rest = l % 1000;
            if (rest > 99) {
                return s + rest;
            } else if (rest > 9) {
                return s + "0" + rest;
            }
            return s + "00" + rest;
        }
        return "" + l;
    }
}

class TestEmployee {

    public static void main(String[] args) {
        Employee e1 = new Employee("12/12/1990", "John Doe", "150,000");
        System.out.println(e1);
    }
}
