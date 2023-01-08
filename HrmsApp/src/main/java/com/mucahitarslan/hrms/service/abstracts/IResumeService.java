package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.entity.concretes.Resume;

import java.util.List;

public interface IResumeService {
    DataResult<Resume> add(Resume resume);

    DataResult<List<Resume>> getAll();
}
