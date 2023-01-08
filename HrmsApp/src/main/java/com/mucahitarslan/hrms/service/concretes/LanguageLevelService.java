package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.core.utilities.results.SuccessDataResult;
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
    public DataResult<LanguageLevel> add(LanguageLevel languageLevel) {
        return new SuccessDataResult<>(languageLevelRepository.save(languageLevel),"The language level is saved successfully");
    }

    @Override
    public DataResult<List<LanguageLevel>> getAll() {
        return new SuccessDataResult<>(languageLevelRepository.findAll(),"The language levels are listed");
    }
}
