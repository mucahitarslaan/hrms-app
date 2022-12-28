package com.mucahitarslan.hrms.entity.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String district;
    private String neighborhood; // Mahalle
    private String road; // Cadde
    private String apartmentBuilding;
    private int floor;
    private int apartmentNumber;

    @ManyToOne
    private Provience provience;

    @ManyToOne
    private User user;

}
