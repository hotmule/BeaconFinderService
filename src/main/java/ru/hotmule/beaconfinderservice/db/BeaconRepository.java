package ru.hotmule.beaconfinderservice.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.hotmule.beaconfinderservice.db.models.Beacon;

@Repository
public interface BeaconRepository extends JpaRepository<Beacon, String> { }