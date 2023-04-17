package com.carloshpb.onlinestoreserver.domain.models;

import org.hibernate.validator.constraints.UUID;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "users_credentials")
public class UserCredentials {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank
    @Email(message = "Email should be valid")
    @Column(name = "email", nullable = false)
    private String email;
}
