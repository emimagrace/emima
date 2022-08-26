package com.MyProject.MainPro.Model;

import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;

@Entity
@NoArgsConstructor
@Table(name="tbl_user")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    private String password;
    private String firstname;
    private String lastname;
    @Column(columnDefinition= "Boolean default true")
    private byte is_active;
    @Column( columnDefinition = "Boolean default false")
    private byte is_deleted;

    public User(Long id, String email, String password, String firstname, String lastname, byte is_active, byte is_deleted) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public byte getIs_active() {
        return is_active;
    }

    public void setIs_active(byte is_active) {
        this.is_active = is_active;
    }

    public byte getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(byte is_deleted) {
        this.is_deleted = is_deleted;
    }
}
