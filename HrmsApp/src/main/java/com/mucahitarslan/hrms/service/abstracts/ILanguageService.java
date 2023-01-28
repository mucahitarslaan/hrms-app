package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.entity.concretes.Language;

import java.util.List;

public interface ILanguageService {
    Language add(Language language);

    List<Language> getAll();
}
