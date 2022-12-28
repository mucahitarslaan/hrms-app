package com.mucahitarslan.hrms.dataAccess.abstracts;

import com.mucahitarslan.hrms.entity.concretes.Language;
import com.mucahitarslan.hrms.entity.concretes.LanguageLevel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILanguageLevelRepository extends JpaRepository<LanguageLevel,Long> {

}
