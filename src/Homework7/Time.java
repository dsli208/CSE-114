/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homework7;
//David S. Li, 110328771

import java.util.Calendar;

/**
 *
 * @author dsli
 */
public class Time {
    private int hour;
    private int minute;
    private int second;
    public Time() {
        Calendar cal = Calendar.getInstance();
        hour = cal.get(Calendar.HOUR_OF_DAY);
        minute = cal.get(Calendar.MINUTE);
        second = cal.get(Calendar.SECOND);
    }
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public Time (long elapseTime) {
        long totalSeconds = elapseTime / 1000;
        this.second = (int)(totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        this.minute = (int)(totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        this.hour = (int)(totalHours % 24);
    }
    public int getHour() {return hour;}
    public int getMinute() {return minute;}
    public int getSecond() {return second;}
    
    public void setTime(long elapseTime) {
        long totalSeconds = elapseTime / 1000;
        this.second = (int)(totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        this.minute = (int)(totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        this.hour = (int)(totalHours % 24);
    }
    //toString
    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}

class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time();
        System.out.println(t1);
        Time t2 = new Time(555550000);
        System.out.println(t2);
    }
}