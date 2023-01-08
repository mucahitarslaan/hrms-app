package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.core.utilities.results.SuccessDataResult;
import com.mucahitarslan.hrms.dataAccess.abstracts.IResumeRepository;
import com.mucahitarslan.hrms.entity.concretes.Resume;
import com.mucahitarslan.hrms.service.abstracts.IResumeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeService implements IResumeService {
    private final IResumeRepository resumeRepository;

    public ResumeService(IResumeRepository resumeRepository) {
        this.resumeRepository = resumeRepository;
    }

    @Override
    public DataResult<Resume> add(Resume resume) {
        return new SuccessDataResult<>(resumeRepository.save(resume),"The resume is saved successfully");
    }

    @Override
    public DataResult<List<Resume>> getAll() {
        return new SuccessDataResult<>(resumeRepository.findAll(),"The resumes are listed");
    }
}
