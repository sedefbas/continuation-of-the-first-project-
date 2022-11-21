package com.languagess.demo.dataAccess.abstracts;

import com.languagess.demo.entity.concretes.Technology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnologyRepository extends JpaRepository<Technology,Integer> {

}
