package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.dataAccess.abstracts.ICoverLetterRepository;
import com.mucahitarslan.hrms.entity.concretes.CoverLetter;
import com.mucahitarslan.hrms.service.abstracts.ICoverLetterService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoverLetterService implements ICoverLetterService {

    private final ICoverLetterRepository coverLetterRepository;

    public CoverLetterService(ICoverLetterRepository coverLetterRepository) {
        this.coverLetterRepository = coverLetterRepository;
    }

    @Override
    public List<CoverLetter> findAll() {
        return coverLetterRepository.findAll();
    }

    @Override
    public CoverLetter save(CoverLetter coverLetter){
        return coverLetterRepository.save(coverLetter);
    }

}
