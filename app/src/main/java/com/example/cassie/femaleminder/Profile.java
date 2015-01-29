package com.example.cassie.femaleminder;

import java.util.Date;

/**
 * Created by Cassie on 1/22/2015.
 */
public class Profile {
    private Date[] period;
    private String name;
    private int periodLength;


    public Profile(Date[] period, String name, int periodLength) {
        this.period = period;
        this.name = name;
        this.periodLength = periodLength;
    }
}
