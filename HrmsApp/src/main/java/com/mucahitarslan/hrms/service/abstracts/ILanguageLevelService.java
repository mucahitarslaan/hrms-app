package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.entity.concretes.LanguageLevel;

import java.util.List;

public interface ILanguageLevelService {

    LanguageLevel add(LanguageLevel languageLevel);

    List<LanguageLevel> getAll();
}
