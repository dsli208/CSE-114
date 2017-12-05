/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LectureNotes9to13;

import java.util.Date;

/**
 *
 * @author dsli
 */
public class Person {
    private String name;
    private String dateOfBirth;
    public static Date parseDate(String d) {
        return new Date(Integer.parseInt(dateOfBirth.substring(0, 2)), Integer.parseInt(dateOfBirth.substring(3, 5)), Integer.parseInt(dateOfBirth.substring(5, 10)));
    }
}
