package com.example.olympics.ticketing_system.controller;

import com.example.olympics.ticketing_system.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/events")
public class EventController {
    @Autowired
    private EventService eventService;
    // endpoints pour les opérations CRUD sur les événements
}
