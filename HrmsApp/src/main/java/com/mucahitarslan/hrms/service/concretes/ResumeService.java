package com.mucahitarslan.hrms.service.concretes;

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
    public Resume add(Resume resume) {
        return resumeRepository.save(resume);
    }

    @Override
    public List<Resume> getAll() {
        return resumeRepository.findAll();
    }
}
