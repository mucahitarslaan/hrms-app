package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.core.utilities.results.SuccessDataResult;
import com.mucahitarslan.hrms.dataAccess.abstracts.ILanguageRepository;
import com.mucahitarslan.hrms.entity.concretes.Language;
import com.mucahitarslan.hrms.service.abstracts.ILanguageService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageService implements ILanguageService {
    private final ILanguageRepository languageRepository;

    public LanguageService(ILanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public DataResult<Language> add(Language language) {
        return new SuccessDataResult<>(languageRepository.save(language),"The language is saved successfully");
    }

    @Override
    public DataResult<List<Language>> getAll() {
        return new SuccessDataResult<>(languageRepository.findAll(),"The languages are listed");
    }
}
