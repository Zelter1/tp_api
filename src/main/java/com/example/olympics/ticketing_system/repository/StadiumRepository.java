package com.example.olympics.ticketing_system.repository;

import com.example.olympics.ticketing_system.model.Stadium;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StadiumRepository extends JpaRepository<Stadium, Long> {
}
