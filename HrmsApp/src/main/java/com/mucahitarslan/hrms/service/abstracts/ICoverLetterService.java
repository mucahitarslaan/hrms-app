package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.entity.concretes.CoverLetter;

import java.util.List;

public interface ICoverLetterService {
    List<CoverLetter> findAll();

    CoverLetter save(CoverLetter coverLetter);
}
