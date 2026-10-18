package com.devricardorocha.selfservice.api.msuser.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "contact_emails")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Email {

    @Id
    @Column(unique = true, nullable = false, length = 32)
    private String email;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = false)
    private Boolean principal;

}
