package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.dataAccess.abstracts.ILanguageLevelRepository;
import com.mucahitarslan.hrms.entity.concretes.LanguageLevel;
import com.mucahitarslan.hrms.service.abstracts.ILanguageLevelService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageLevelService implements ILanguageLevelService {
    private final ILanguageLevelRepository languageLevelRepository;

    public LanguageLevelService(ILanguageLevelRepository languageLevelRepository) {
        this.languageLevelRepository = languageLevelRepository;
    }

    @Override
    public LanguageLevel add(LanguageLevel languageLevel) {
        return languageLevelRepository.save(languageLevel);
    }

    @Override
    public List<LanguageLevel> getAll() {
        return languageLevelRepository.findAll();
    }
}
