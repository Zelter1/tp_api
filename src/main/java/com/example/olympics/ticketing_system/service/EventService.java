package com.example.olympics.ticketing_system.service;

import com.example.olympics.ticketing_system.repository.EventRepository;
import com.example.olympics.ticketing_system.repository.StadiumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private StadiumRepository stadiumRepository;
    // méthodes pour gérer les événements
}
