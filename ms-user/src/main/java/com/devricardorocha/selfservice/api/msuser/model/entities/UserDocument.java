package com.devricardorocha.selfservice.api.msuser.model.entities;

import com.devricardorocha.selfservice.api.msuser.model.enumerators.DocumentType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "user_documents")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDocument {

    @Id
    @Column(name = "user_id")
    private UUID userId;

    @Column(nullable = false, length = 16)
    @Enumerated(EnumType.STRING)
    private DocumentType type;

    @Column(nullable = false, length = 16)
    private String rawNumber;

    @Column(nullable = false, length = 32)
    private String displayNumber;

    @OneToOne(optional = false)
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;

}
