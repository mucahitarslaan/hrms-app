package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.core.utilities.results.SuccessDataResult;
import com.mucahitarslan.hrms.dataAccess.abstracts.ICoverLetterRepository;
import com.mucahitarslan.hrms.entity.concretes.Address;
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
    public DataResult<List<CoverLetter>> findAll() {
        return new SuccessDataResult<>(coverLetterRepository.findAll(),"All cover letters are listed");
    }

    @Override
    public DataResult<CoverLetter> save(CoverLetter coverLetter){
        return new SuccessDataResult<>(coverLetterRepository.save(coverLetter),"The cover letter is saved");
    }

}
