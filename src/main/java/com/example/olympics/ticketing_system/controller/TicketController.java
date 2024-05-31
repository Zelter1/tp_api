package com.example.olympics.ticketing_system.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import com.example.olympics.ticketing_system.model.Ticket;
import com.example.olympics.ticketing_system.service.TicketService;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {
    @Autowired
    private TicketService ticketService;

    @Operation(summary = "Ajouter un ticket")
    @PostMapping("/add")
    public Ticket addTicket(@RequestBody Ticket ticket) {
        return ticketService.addTicket(ticket);
    }

    @Operation(summary = "Obtenir tous les tickets")
    @GetMapping
    public List<Ticket> getAllTickets() {
        return ticketService.getAllTickets();
    }

    @Operation(summary = "Obtenir un ticket par son ID")
    @GetMapping("/{id}")
    public Ticket getTicketById(@PathVariable Long id) {
        Optional<Ticket> ticketOptional = ticketService.getTicketById(id);
        return ticketOptional.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Ticket not found with id " + id));
    }

    @Operation(summary = "Mettre à jour un ticket")
    @PutMapping("/{id}")
    public Ticket updateTicket(@PathVariable Long id, @RequestBody Ticket ticket) {
        return ticketService.updateTicket(id, ticket);
    }

    @Operation(summary = "Supprimer un ticket")
    @DeleteMapping("/{id}")
    public void deleteTicket(@PathVariable Long id) {
        ticketService.deleteTicket(id);
    }
}
