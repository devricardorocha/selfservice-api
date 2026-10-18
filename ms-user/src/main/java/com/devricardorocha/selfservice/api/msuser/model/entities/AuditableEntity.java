package com.devricardorocha.selfservice.api.msuser.model.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
public abstract class AuditableEntity implements Serializable {

    @Version
    @Column(nullable = false, length = 8)
    protected Integer version;

    @Column(nullable = false)
    protected LocalDateTime createdAt;

    @Column(nullable = false, length = 8)
    protected String createdBy;

    @Column(nullable = false)
    protected LocalDateTime updatedAt;

    @Column(nullable = false, length = 8)
    protected String updatedBy;

    @PrePersist
    void onCreate() {
        final LocalDateTime now = LocalDateTime.now();
        this.createdAt = now;
        this.updatedAt = now;
    }

    @PreUpdate
    void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }

}
