package com.mucahitarslan.hrms.entity.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
@AllArgsConstructor
@Valid
@Data
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
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

}
