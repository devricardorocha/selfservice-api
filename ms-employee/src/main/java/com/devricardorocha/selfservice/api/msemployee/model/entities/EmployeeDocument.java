package com.devricardorocha.selfservice.api.msemployee.model.entities;

import com.devricardorocha.selfservice.api.msemployee.model.enumerators.DocumentType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "employee_documents")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDocument {

    @Id
    @Column(name = "employee_id")
    private UUID employeeId;

    @Column(nullable = false, length = 16)
    @Enumerated(EnumType.STRING)
    private DocumentType type;

    @Column(nullable = false, length = 16)
    private String rawNumber;

    @Column(nullable = false, length = 32)
    private String displayNumber;

    @MapsId
    @OneToOne(optional = false)
    @JoinColumn(name = "employee_id")
    private Employee employee;

}
