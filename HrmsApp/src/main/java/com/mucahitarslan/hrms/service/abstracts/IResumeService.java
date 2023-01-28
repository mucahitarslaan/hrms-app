package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.entity.concretes.Resume;

import java.util.List;

public interface IResumeService {
    Resume add(Resume resume);

    List<Resume> getAll();
}
