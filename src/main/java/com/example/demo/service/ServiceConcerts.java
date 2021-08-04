package com.example.demo.service;

import com.example.demo.domain.Concert;
import com.example.demo.repository.RepositoryConcerts;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ServiceConcerts {
  private final RepositoryConcerts repositoryConcerts;

  public ServiceConcerts(RepositoryConcerts repositoryConcerts) {
    this.repositoryConcerts = repositoryConcerts;
  }

  public List<Concert> getAllConcerts() {
    return this.repositoryConcerts.findAll();
  }

  public void deleteConcertById(int id) {
    this.repositoryConcerts.deleteById(id);
  }

  @Transactional
  public void addConcert(Concert concert) {this.repositoryConcerts.save(concert);}
}
