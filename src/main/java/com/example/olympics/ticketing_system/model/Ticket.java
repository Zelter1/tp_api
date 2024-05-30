package com.example.olympics.ticketing_system.model;

import jakarta.persistence.*;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Event event;
    @ManyToOne
    private User user;
    private int quantity;
    private boolean refunded;
    // getters and setters
}
