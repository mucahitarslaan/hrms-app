package com.mucahitarslan.hrms.entity.concretes;

import jakarta.persistence.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "users")
//@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Email(message = "please check your email")
    @NotNull(message = "email can not be empty")
    @NotBlank(message = "email can not be empty")
    @Column(unique = true)
    private String email;

    @NotNull(message = "password can not be empty")
    @NotBlank(message = "password can not be empty")
    private String password;


    @OneToMany(mappedBy = "user")
    private List<Address> addresses;

    @OneToMany(mappedBy = "user") // TODO:
    private List<Link> links;

    @OneToOne
    private UserActivation userActivation;

    public User() {
    }


    public User(long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
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
}
