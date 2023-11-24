package com.codelounge.beans;

import java.util.Date;

public class WishMessageGenerator {

    private Date date1;
    WishMessageGenerator(){
        System.out.println("0-arg const called");
    }
    public void setDate(Date date) {
        System.out.println("Wish-Setter");
        this.date1 = date;

    }

    public String generateWM(String user) {
//get current hour of the day

        int hour = date1.getHours();//24 hrs format

        if (hour < 12)
            return "GM :" + user;
        else {
            return "GE:" + user;
        }

    }

}
