package ru.hotmule.beaconfinderservice.db.models;

import java.util.Date;

public class BeaconSync {

    private String mac;

    private Date date;

    public void setMac(String mac) {
        this.mac = mac;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
