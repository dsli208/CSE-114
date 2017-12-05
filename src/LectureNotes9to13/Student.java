/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LectureNotes9to13;

/**
 *
 * @author dsli
 */
public class Student {
    private int id;
    private BirthDate birthDate;
    public Student(int ssn, int year, int month, int day) {
        id = ssn;
        birthDate = new BirthDate(year, month, day);
    }
    public int getID() {
        return id;
    }
    public BirthDate getBirthDate() {
        return birthDate;
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student s = new Student(101221234, 1997, 2, 20);
        System.out.println("ID is " + s.getID() + " and the birth year is " + s.getBirthDate().getYear());
    }
}