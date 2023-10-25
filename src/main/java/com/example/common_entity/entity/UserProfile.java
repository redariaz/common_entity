package com.example.common_entity.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@Table("LTS_USER")
@Data
public class UserProfile extends BaseEntity<String> {

    @Id
    @Column(value = "ID")
    private Integer id;

    @Column(value = "TITLE")
    private String title;

    @Column("FIRST_NAME")
    private String firstName;

    @Column("LAST_NAME")
    private String lastName;

    @Column("EMP_CODE")
    private String empCode;

    @Column("USERNAME")
    private String username;

    @Column("IS_ENABLED")
    private boolean isEnabled;

    @Column("JOINING_DATE")
    private LocalDate joiningDate;

    @Column(value = "GENDER")
    private String gender;

    @Column(value = "DOB")
    private LocalDate dob;

    @Column(value = "MARITAL_STATUS")
    private String maritalStatus;
}
