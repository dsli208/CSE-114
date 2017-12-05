/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalReview;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author dsli
 */
public class Person {
    private String name;
    private Calendar dob;
    public Person(String name, String dob) {
        this.name = name;
        this.dob = new GregorianCalendar(Integer.parseInt(dob.substring(6, 10)), Integer.parseInt(dob.substring(0, 2)), Integer.parseInt(dob.substring(3, 5))); //Study GregorianCalendar class
    }
    @Override
    public String toString() {
        return name + " " + dob.get(Calendar.MONTH) + "/" + dob.get(Calendar.DAY_OF_MONTH) + "/" + dob.get(Calendar.YEAR);
    }
    public int getAge() {
        Calendar today = new GregorianCalendar();
        //The below statement returns true if today's date is greater than the person's birthdate or if this month is greater than the person's birth-month, making him older
        if ((today.get(Calendar.MONTH) == dob.get(Calendar.MONTH) && today.get(Calendar.DAY_OF_MONTH) >= dob.get(Calendar.DAY_OF_MONTH)) || (today.get(Calendar.MONTH) > dob.get(Calendar.MONTH)))
            return today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        //otherwise, this statement executes, since the person is one year less likely to pass away
        return today.get(Calendar.YEAR) - dob.get(Calendar.YEAR) - 1;
    }
    
}
