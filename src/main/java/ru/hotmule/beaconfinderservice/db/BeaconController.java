package ru.hotmule.beaconfinderservice.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/beacons")
public class BeaconController {

  private BeaconRepository repository;

  @Autowired
  public BeaconController(BeaconRepository repository) {
    this.repository = repository;
  }

  @RequestMapping(value = "/{mac}", method = RequestMethod.GET)
  public ResponseEntity<Beacon> get(@PathVariable("mac") String mac) {
    Beacon beacon = repository.findOne(mac);
    if (null == beacon) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<>(beacon, HttpStatus.OK);
  }

  @RequestMapping(value = "/new", method = RequestMethod.POST)
  public ResponseEntity<Beacon> update(@RequestBody Beacon beacon) {
    repository.save(beacon);
    return get(beacon.getMac());
  }

  @RequestMapping
  public List<Beacon> all() {
    return repository.findAll();
  }
}
