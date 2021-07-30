package com.example.demo.controller;

import com.example.demo.service.ServiceConcerts;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerConcerts {

  private final ServiceConcerts serviceConcerts;

  public ControllerConcerts(ServiceConcerts serviceConcerts) {
    this.serviceConcerts = serviceConcerts;
  }

  @GetMapping("/concerts")
  public ResponseEntity<?> getAllConcerts() {
    return ResponseEntity.ok(serviceConcerts.getAllConcerts());
  }

  @RequestMapping(
      value = "/delete/{id}",
      produces = "application/json",
      method = {RequestMethod.DELETE, RequestMethod.GET})
  public ResponseEntity<?> deleteConcert(@PathVariable Integer id) {
    serviceConcerts.deleteConcertById(id);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
