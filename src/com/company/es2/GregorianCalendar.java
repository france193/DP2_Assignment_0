package com.company.es2;

import java.util.Comparator;

/**
 * Created by FLDeviOS on 15/10/2016.
 */

//Object for my time_instant (basic time element)
public class GregorianCalendar implements Comparable<GregorianCalendar> {

    //attributes of my object
    private Integer day;
    private Integer month;
    private Integer year;
    private Integer hour;
    private Integer minute;
    private Integer second;

    //complete constructor
    public GregorianCalendar(Integer second, Integer minute, Integer hour, Integer day, Integer month, Integer year) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //Getter & Setter for any attributes of the object
    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }

    public Integer getMinute() {
        return minute;
    }

    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "GregorianCalendar{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }

    @Override
    public int compareTo(GregorianCalendar o) {
        if (this.getYear() > o.getYear()) {
            return 1;
        } else if (this.getYear().equals(o.getYear())) {
            if (this.getMonth() > o.getMonth()) {
                return 1;
            } else if (this.getMonth().equals(o.getMonth())) {
                if (this.getDay() > o.getDay()) {
                    return 1;
                } else if (this.getDay().equals(o.getDay())) {
                    if (this.getHour() > o.getHour()) {
                        return 1;
                    } else if (this.getHour().equals(o.getHour())) {
                        if (this.getMinute() > o.getMinute()) {
                            return 1;
                        } else if (this.getMinute().equals(o.getMinute())) {
                            if (this.getSecond() > o.getSecond()) {
                                return 1;
                            } else if (this.getSecond().equals(o.getSecond())) {
                                return 0;
                            } else {
                                return -1;
                            }
                        } else {
                            return -1;
                        }
                    } else {
                        return -1;
                    }
                } else {
                    return -1;
                }
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }

    /*
    private int singleCompare (int x1, int x2) {
        if (x1 > x2) {
            return 1;
        } else if () {
            return 0;
        } else {
            return -1;
        }
    }
    */

}
