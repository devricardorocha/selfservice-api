package com.devricardorocha.selfservice.api.msuser.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "contact_phonenumbers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhoneNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 4)
    private String countryCode;

    @Column(nullable = false, length = 16)
    private String rawNumber;

    @Column(nullable = false, length = 32)
    private String displayNumber;

    @Column(nullable = false, length = 16)
    private String label;

    @Column(nullable = false)
    private Boolean principal;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    private User user;

}
