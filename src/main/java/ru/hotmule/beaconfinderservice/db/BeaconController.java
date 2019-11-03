package ru.hotmule.beaconfinderservice.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.List;

import ru.hotmule.beaconfinderservice.db.models.Beacon;
import ru.hotmule.beaconfinderservice.db.models.BeaconSync;

@RestController
@RequestMapping("/beacons")
public class BeaconController {

  private BeaconRepository repository;

  @Autowired
  public BeaconController(BeaconRepository repository) {
    this.repository = repository;
  }

  @RequestMapping(value = "/new", method = RequestMethod.POST)
  public ResponseEntity<BeaconSync> update(@RequestBody Beacon beacon) {
    repository.save(beacon);

    Beacon savedBeacon = repository.findOne(beacon.getMac());

    if (null == savedBeacon)
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    BeaconSync sync = new BeaconSync();
    sync.setMac(savedBeacon.getMac());
    sync.setDate(Calendar.getInstance().getTime());

    return new ResponseEntity<>(sync, HttpStatus.OK);
  }

  @RequestMapping
  public List<Beacon> all() {
    return repository.findAll();
  }
}
