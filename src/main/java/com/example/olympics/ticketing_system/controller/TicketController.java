package com.example.olympics.ticketing_system.controller;

import com.example.olympics.ticketing_system.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {
    @Autowired
    private TicketService ticketService;
    // endpoints pour les opérations CRUD sur les billets
}
