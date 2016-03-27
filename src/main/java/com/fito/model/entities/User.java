package com.fito.model.entities;

import com.fito.security.Role;
import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Entity class for modeling a user, in the db 'users' table.
 */
@Entity
@Table(name = "users")
@Inheritance(strategy=InheritanceType.JOINED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "mail", nullable = false)
    @Email(message = "client.email.notEmail")
    private String mail;

    @Column(name = "password", nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(name = "lastLogin", nullable = true)
    private Timestamp lastLogin;

    @Column(name = "createdOn", nullable = true)
    private Timestamp createdOn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer userId) {
        this.id = userId;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Timestamp getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Timestamp lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }
}
