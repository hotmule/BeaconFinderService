package ru.hotmule.beaconfinderservice.db.models;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Beacon {

  @Id
  @NotEmpty
  private String mac;

  @NotEmpty
  private String uuid;

  private int major;

  private int minor;

  private int rssi;

  private double distance;

  public String getMac() {
    return mac;
  }

  public String getUuid() {
    return uuid;
  }

  public int getMajor() {
    return major;
  }

  public int getMinor() {
    return minor;
  }

  public int getRssi() {
    return rssi;
  }

  public double getDistance() {
    return distance;
  }
}
