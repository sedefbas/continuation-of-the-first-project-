package com.languagess.demo.dataAccess.abstracts;

import com.languagess.demo.entity.concretes.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language,Integer> {
}
