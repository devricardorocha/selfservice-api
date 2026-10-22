package com.devricardorocha.selfservice.api.msemployee.model.entities;

import com.devricardorocha.selfservice.api.msemployee.model.enumerators.Gender;
import com.devricardorocha.selfservice.api.msemployee.model.enumerators.JobTitle;
import com.devricardorocha.selfservice.api.msemployee.model.enumerators.MaritalStatus;
import com.devricardorocha.selfservice.api.msemployee.model.validators.annotations.LegalAge;
import jakarta.persistence.*;
import jakarta.validation.constraints.FutureOrPresent;
import lombok.*;

import java.time.LocalDate;
import java.util.Collection;
import java.util.UUID;

@Entity
@Table(name = "employees")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Employee extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    public UUID id;

    @Column(unique = true, nullable = false, length = 128)
    private String externalId;

    @Column(unique = true, nullable = false, length = 8)
    public String code;

    @Column(unique = true, nullable = false, length = 32)
    private String email;

    @Column(nullable = false, length = 32)
    private String firstName;

    @Column(nullable = false, length = 64)
    private String lastName;

    @LegalAge
    @Column(nullable = false)
    private LocalDate birthDate;

    @Column(nullable = false, length = 16)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToOne(mappedBy = "employee", optional = false, cascade = CascadeType.ALL)
    private EmployeeDocument employeeDocument;

    @Column(nullable = false, length = 32)
    private String nationality;

    @Column(nullable = false, length = 16)
    @Enumerated(EnumType.STRING)
    private MaritalStatus maritalStatus;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Collection<Email> contactEmails;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Collection<PhoneNumber> contactPhoneNumbers;

    @OneToOne(mappedBy = "employee", optional = false, cascade = CascadeType.ALL)
    private Address address;

    @Column(length = 256)
    private String profilePhotoURL;

    @Column(nullable = false)
    @FutureOrPresent(message = "Hiring date must be today or after")
    private LocalDate hiringDate;

    @Column(length = 16)
    @Enumerated(EnumType.STRING)
    private JobTitle jobTitle;

    @ManyToOne
    private Employee manager;

    @OneToMany(mappedBy = "manager", fetch = FetchType.LAZY)
    private Collection<Employee> employees;

    @Column
    private Boolean active;
}


