package com.example.olympics.ticketing_system.service;

import com.example.olympics.ticketing_system.repository.EventRepository;
import com.example.olympics.ticketing_system.repository.TicketRepository;
import com.example.olympics.ticketing_system.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;
    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private UserRepository userRepository;
    // méthodes pour gérer les billets
}
