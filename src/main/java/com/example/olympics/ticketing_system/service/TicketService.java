package com.example.olympics.ticketing_system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.olympics.ticketing_system.model.Ticket;
import com.example.olympics.ticketing_system.repository.TicketRepository;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public Ticket addTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    public Optional<Ticket> getTicketById(Long id) {
        return ticketRepository.findById(id);
    }

    public Ticket updateTicket(Long id, Ticket ticket) {
        if (ticketRepository.existsById(id)) {
            ticket.setId(id);
            return ticketRepository.save(ticket);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Ticket introuvable id : " + id);
        }
    }

    public void deleteTicket(Long id) {
        if (ticketRepository.existsById(id)) {
            ticketRepository.deleteById(id);
        } else {
            try {
       throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Ticket not found with id " + id);
            } catch (ResponseStatusException ex) {
                // Handle the exception or rethrow as an unchecked exception
                throw ex;
            }
        }
    }
}