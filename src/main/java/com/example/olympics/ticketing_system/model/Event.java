package com.example.olympics.ticketing_system.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDateTime date;
    @ManyToOne
    private Stadium stadium;
    private boolean openForRegistration;
    // getters and setters
}
