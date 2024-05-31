package com.example.olympics.ticketing_system.controller;

import com.example.olympics.ticketing_system.model.Event;
import com.example.olympics.ticketing_system.service.EventService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {
    @Autowired
    private EventService eventService;

    @Operation(summary = "Ajouter un nouvel événement")
    @PostMapping
    public Event addEvent(@RequestBody Event event) {
        return eventService.addEvent(event);
    }

    @Operation(summary = "Obtenir tous les événements")
    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @Operation(summary = "Obtenir un événement par ID")
    @GetMapping("/{id}")
    public Event getEventById(@Parameter(description = "ID de l'événement") @PathVariable Long id) {
        return eventService.getEventById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Événement non trouvé avec l'ID " + id));
    }

    @Operation(summary = "Mettre à jour un événement existant")
    @PutMapping("/{id}")
    public Event updateEvent(@Parameter(description = "ID de l'événement") @PathVariable Long id, @RequestBody Event event) {
        return eventService.updateEvent(id, event);
    }

    @Operation(summary = "Supprimer un événement")
    @DeleteMapping("/{id}")
    public void deleteEvent(@Parameter(description = "ID de l'événement") @PathVariable Long id) {
        eventService.deleteEvent(id);
    }
}
