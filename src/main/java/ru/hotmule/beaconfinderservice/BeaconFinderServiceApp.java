package ru.hotmule.beaconfinderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@Controller
@SpringBootApplication
public class BeaconFinderServiceApp {

  @RequestMapping("/test")
  @ResponseBody
  String home() {
    return "BeaconFinderService is running...";
  }

  public static void main(String[] args) {
    SpringApplication.run(BeaconFinderServiceApp.class, args);
  }
}