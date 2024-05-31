package com.example.olympics.ticketing_system.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.olympics.ticketing_system.model.Stadium;
import com.example.olympics.ticketing_system.service.StadiumService;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api/stadiums")
public class StadiumController {
    @Autowired
    private StadiumService stadiumService;

    @Operation(summary = "Ajouter un stade")
    @PostMapping("/add")
    public ResponseEntity<Stadium> addStadium(@RequestBody Stadium stadium) {
        return ResponseEntity.ok(stadiumService.addStadium(stadium));
    }

    @Operation(summary = "Obtenir tous les stades")
    @GetMapping
    public ResponseEntity<List<Stadium>> getAllStadiums() {
        return ResponseEntity.ok(stadiumService.getAllStadiums());
    }

    @Operation(summary = "Obtenir un stade par ID")
    @GetMapping("/{id}")
    public ResponseEntity<Stadium> getStadiumById(@PathVariable Long id) {
        Optional<Stadium> stadium = stadiumService.getStadiumById(id);
        return stadium.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @Operation(summary = "Mettre à jour un stade")
    @PutMapping("/{id}")
    public ResponseEntity<Stadium> updateStadium(@PathVariable Long id, @RequestBody Stadium stadiumDetails) {
        Stadium updatedStadium = stadiumService.updateStadium(id, stadiumDetails);
        return updatedStadium != null ? ResponseEntity.ok(updatedStadium) : ResponseEntity.notFound().build();
    }

    @Operation(summary = "Supprimer un stade")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStadium(@PathVariable Long id) {
        stadiumService.deleteStadium(id);
        return ResponseEntity.noContent().build();
    }
}
