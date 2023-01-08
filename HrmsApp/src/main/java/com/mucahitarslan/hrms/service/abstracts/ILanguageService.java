package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.entity.concretes.Language;

import java.util.List;

public interface ILanguageService {
    DataResult<Language> add(Language language);

    DataResult<List<Language>> getAll();
}
