package com.example.demo.controller;

import com.example.demo.service.ServiceConcerts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerConcerts {

  private static final Logger LOG = LoggerFactory.getLogger(ControllerConcerts.class);
  private final ServiceConcerts serviceConcerts;

  public ControllerConcerts(ServiceConcerts serviceConcerts) {
    this.serviceConcerts = serviceConcerts;
  }

  @GetMapping("/concerts")
  public ResponseEntity<?> getAllConcerts() {
    LOG.info("getAllConcert - method entered");
    // serviceConcerts.addConcert(new Concert());
    return ResponseEntity.ok(serviceConcerts.getAllConcerts());
  }

  @RequestMapping(
      value = "/delete/{id}",
      produces = "application/json",
      method = {RequestMethod.DELETE})
  public ResponseEntity<?> deleteConcert(@PathVariable Integer id) {
    LOG.info("deleteConcert id={} - method entered", id);
    serviceConcerts.deleteConcertById(id);
    LOG.info("deleteConcert id={} - method finished", id);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
