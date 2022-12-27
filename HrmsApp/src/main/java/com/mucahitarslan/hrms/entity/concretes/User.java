package com.mucahitarslan.hrms.entity.concretes;

import jakarta.persistence.*;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
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

    @NotNull(message = "address can not be empty")
    @NotBlank(message = "address can not be empty")
    private String address;

    @OneToMany(mappedBy = "user") // TODO:
    private List<Link> links;

}
