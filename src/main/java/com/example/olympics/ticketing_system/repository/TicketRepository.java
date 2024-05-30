package com.example.olympics.ticketing_system.repository;

import com.example.olympics.ticketing_system.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
