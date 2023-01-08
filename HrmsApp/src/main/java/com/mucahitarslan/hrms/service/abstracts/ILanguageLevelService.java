package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.core.utilities.results.SuccessDataResult;
import com.mucahitarslan.hrms.dataAccess.abstracts.IJobTitleRepository;
import com.mucahitarslan.hrms.dataAccess.abstracts.ILanguageLevelRepository;
import com.mucahitarslan.hrms.entity.concretes.JobTitle;
import com.mucahitarslan.hrms.entity.concretes.LanguageLevel;

import java.util.List;

public interface ILanguageLevelService {

    DataResult<LanguageLevel> add(LanguageLevel languageLevel);

    DataResult<List<LanguageLevel>> getAll();
}
