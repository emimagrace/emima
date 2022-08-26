package com.MyProject.MainPro.Model;


import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Date;

@Entity
@NoArgsConstructor
@Table(name="tbl_student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    private String firstname;
    private String lastname;
    private LocalDate birthday;
    @Column(columnDefinition= "Boolean default true")
    private byte is_active;
    @Column( columnDefinition = "Boolean default false")
    private byte is_deleted;

    public Student(Long id, String email, String firstname, String lastname, LocalDate birthday, byte is_active, byte is_deleted)
    {
        this.id = id;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
        this.is_active = is_active;
        this.is_deleted = is_deleted;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public byte getIsActive() {
        return is_active;
    }

    public void setIsActive(byte is_active) {
        this.is_active = is_active;
    }

    public byte getIsDeleted() {
        return is_deleted;
    }

    public void setIsDeleted(byte is_deleted) {
        this.is_deleted =is_deleted;
    }


}
