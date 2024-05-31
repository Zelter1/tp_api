package com.example.olympics.ticketing_system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.olympics.ticketing_system.model.Event;
import com.example.olympics.ticketing_system.repository.EventRepository;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public Event addEvent(Event event) {
        return eventRepository.save(event);
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Optional<Event> getEventById(Long id) {
        return eventRepository.findById(id);
    }

    public Event updateEvent(Long id, Event event) {
        if (eventRepository.existsById(id)) {
            event.setId(id); // assuming Event has a setId method
            return eventRepository.save(event);
        } else {
            throw new RuntimeException("Event not found with id " + id);
        }
    }

    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }
}
