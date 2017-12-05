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
public class BirthDate {
    private int year;
    private int month;
    private int day;
    
    public BirthDate(int newYear, int newMonth, int newDay) {
        year = newYear;
        month = newMonth;
        day = newDay;
    }
    
    public void setYear(int newYear) {
        year = newYear;
    }
    
    public int getYear() {
        return year;
    }
}
