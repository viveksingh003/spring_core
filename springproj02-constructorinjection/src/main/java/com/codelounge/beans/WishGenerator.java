package com.codelounge.beans;


import java.util.Date;


public class WishGenerator {

    Date date2 = null;

    WishGenerator() {
        System.out.println("O-arg constructor");
    }

    WishGenerator(Date date) {
        this.date = date
        ;

        System.out.println("1-arg constructor");
    }

    public void setDate(Date date) {
        System.out.println(
                "setter"
        );
        this.date = date;

    }

    private Date date;


    //private Month month;

    public void m1() {
        System.out.println(date);
    }


}
