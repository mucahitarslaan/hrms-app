package com.mucahitarslan.hrms.entity.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_titles")
public class JobTitle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "title_id",nullable = false)
    private long id;

    @Column(name = "title_name",nullable = false)
    private String titleName;
}
