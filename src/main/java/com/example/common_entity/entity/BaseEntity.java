package com.example.common_entity.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.relational.core.mapping.Column;

import java.time.LocalDateTime;

@SuppressWarnings("hiding")
@Data
public abstract class BaseEntity<String> {

    @CreatedBy
    @Column(value = "CREATED_BY")
    protected String createdBy;

    @CreatedDate
    @Column(value = "CREATED_DATE")
    protected LocalDateTime createdDate;

    @LastModifiedBy
    @Column(value = "UPDATED_BY")
    protected String updatedBy;

    @LastModifiedDate
    @Column(value = "UPDATED_DATE")
    protected LocalDateTime updatedDate;
}
