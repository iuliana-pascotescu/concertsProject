package com.example.demo.repository;

import com.example.demo.domain.Concert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryConcerts extends JpaRepository<Concert, Integer> {}
