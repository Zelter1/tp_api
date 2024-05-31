package com.example.olympics.ticketing_system.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.olympics.ticketing_system.model.Stadium;
import com.example.olympics.ticketing_system.service.StadiumService;

@RestController
@RequestMapping("/api/stadiums")
public class StadiumController {
    @Autowired
    private StadiumService stadiumService;

    @PostMapping("/add")
    public ResponseEntity<Stadium> addStadium(@RequestBody Stadium stadium) {
        return ResponseEntity.ok(stadiumService.addStadium(stadium));
    }

    @GetMapping
    public ResponseEntity<List<Stadium>> getAllStadiums() {
        return ResponseEntity.ok(stadiumService.getAllStadiums());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Stadium> getStadiumById(@PathVariable Long id) {
        Optional<Stadium> stadium = stadiumService.getStadiumById(id);
        return stadium.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Stadium> updateStadium(@PathVariable Long id, @RequestBody Stadium stadiumDetails) {
        Stadium updatedStadium = stadiumService.updateStadium(id, stadiumDetails);
        return updatedStadium != null ? ResponseEntity.ok(updatedStadium) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStadium(@PathVariable Long id) {
        stadiumService.deleteStadium(id);
        return ResponseEntity.noContent().build();
    }
}
