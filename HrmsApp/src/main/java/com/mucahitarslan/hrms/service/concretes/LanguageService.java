package com.mucahitarslan.hrms.service.concretes;

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
    public Language add(Language language) {
        return languageRepository.save(language);
    }

    @Override
    public List<Language> getAll() {
        return languageRepository.findAll();
    }
}
