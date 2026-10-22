package com.devricardorocha.selfservice.api.msemployee.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AuditableEntity implements Serializable {

    @Version
    @Column(nullable = false, length = 8)
    protected Integer version;

    @CreatedDate
    @Column(nullable = false)
    protected LocalDateTime createdAt;

    @CreatedBy
    @Column(nullable = false, length = 8)
    protected String createdBy;

    @LastModifiedDate
    @Column(nullable = false)
    protected LocalDateTime lastModifiedAt;

    @LastModifiedBy
    @Column(nullable = false, length = 8)
    protected String lastModifiedBy;

}
