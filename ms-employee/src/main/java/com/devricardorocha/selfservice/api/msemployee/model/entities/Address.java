package com.devricardorocha.selfservice.api.msemployee.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "address")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 32)
    private String region;

    @Column(nullable = false, length = 32)
    private String city;

    @Column(length = 32)
    private String timezone;

    @Column(nullable = false, length = 8)
    private String zipCode;

    @Column(nullable = false, length = 128)
    private String line1;

    @Column(length = 256)
    private String line2;

    @OneToOne(optional = false)
    @JoinColumn(name = "employee_id")
    private Employee employee;

}
