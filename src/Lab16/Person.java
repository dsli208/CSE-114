/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab16;

/**
 *
 * @author dsli
 */
public class Person {
    private String name;
    private String address;
    private long phoneNumber;
    private String email;
    public Person(String name, String address, long phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    @Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nPhone number: " + phoneNumber + "\nEmail address: " + email;
    }
}
class Student extends Person {
    private final int classStatus;
    public Student(String name, String address, long phoneNumber, String email, int classStatus) {
        super(name, address, phoneNumber, email);
        this.classStatus = classStatus;
    }
    @Override
    public String toString() {
        return super.toString() + "\nClass status: " + classStatus;
    }
}
class Employee extends Person {
    private String office;
    private long salary;
    private java.util.Date dateHired;
    public Employee(String name, String address, long phoneNumber, String email, String office, long salary) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = new java.util.Date();
    }
    @Override
    public String toString() {
        return super.toString() + "\nOffice: " + office + "\nSalary: " + salary + "\nDate hired: " + dateHired;
    }
}
class Faculty extends Employee {
    private String officeHours;
    private int rank;
    public Faculty(String name, String address, long phoneNumber, String email, String office, long salary, String officeHours, int rank) {
        super(name, address, phoneNumber, email, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    @Override
    public String toString() {
        return super.toString() + "\nOffice hours: " + officeHours + "\nRank: " + rank;
    }
}
class Staff extends Employee {
    String title;
    public Staff(String name, String address, long phoneNumber, String email, String office, long salary, String title) {
        super(name, address, phoneNumber, email, office, salary);
        this.title = title;
    }
    @Override
    public String toString() {
        return super.toString() + "\nTitle: " + title;
    }
}

class TestPerson {
    public static void main(String[] args) {
        Staff s = new Staff("Paul Fodor", "1 Main Street", 999999999, "paul.fodor@stonybrook.edu", "Stony Brook University", 500000, "Professor");
        System.out.println(s.toString());
        Person student = new Student("David Li", "1333 Indiana Avenue", 252281238, "david.li@stonybrook.edu", 3);
        System.out.println(student.toString());
    }
}