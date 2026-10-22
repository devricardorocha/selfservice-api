package com.devricardorocha.selfservice.api.msemployee.model.entities;

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
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Column(nullable = false)
    private Boolean principal;

}
