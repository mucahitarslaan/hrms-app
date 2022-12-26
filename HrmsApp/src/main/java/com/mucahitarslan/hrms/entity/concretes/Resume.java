package com.mucahitarslan.hrms.entity.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(mappedBy = "resume")
    private Staff staff;
    @OneToOne
    private CoverLetter coverLetter;

    @OneToMany(mappedBy = "resume")
    private List<Education> educations;

    @OneToMany(mappedBy = "resume")
    private List<Experience> experiences;

    @OneToMany(mappedBy = "resume")
    private List<Language> languages;

    @OneToMany(mappedBy = "resume")
    private List<Link> links;

    @OneToMany(mappedBy = "resume")
    private List<Skill> skills;
}
