package ru.hotmule.beaconfinderservice.db.models;

import java.util.Date;

public class BeaconSync {

    private String mac;

    private Date date;

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
