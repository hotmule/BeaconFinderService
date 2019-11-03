package ru.hotmule.beaconfinderservice.db.models;

import java.time.LocalDateTime;

public class BeaconSync {

    private String mac;

    private LocalDateTime date;

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
