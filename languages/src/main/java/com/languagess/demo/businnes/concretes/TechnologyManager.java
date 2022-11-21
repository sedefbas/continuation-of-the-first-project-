package com.languagess.demo.businnes.concretes;

import com.languagess.demo.businnes.abstracts.TechnologyService;
import com.languagess.demo.businnes.requests.technology.AddTechnologyRequests;
import com.languagess.demo.businnes.requests.technology.DeleteTechnologyRequests;
import com.languagess.demo.businnes.requests.technology.UpdateTechnologyRequests;
import com.languagess.demo.businnes.responses.technology.GetAllTechnoloyResponse;
import com.languagess.demo.dataAccess.abstracts.LanguageRepository;
import com.languagess.demo.dataAccess.abstracts.TechnologyRepository;
import com.languagess.demo.entity.concretes.Language;
import com.languagess.demo.entity.concretes.Technology;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TechnologyManager implements TechnologyService {
    private LanguageRepository languageRepository;
    private TechnologyRepository technologyRepository;

    public TechnologyManager(LanguageRepository languageRepository, TechnologyRepository technologyRepository) {
        this.languageRepository = languageRepository;
        this.technologyRepository = technologyRepository;
    }


    @Override
    public List<GetAllTechnoloyResponse> getAll() {
       List<GetAllTechnoloyResponse > getAllTechnoloyResponse = new ArrayList<GetAllTechnoloyResponse>();
       List<Technology> technologies = technologyRepository.findAll();
       for (Technology t : technologies)
       {   GetAllTechnoloyResponse itemResponse = new GetAllTechnoloyResponse();
           itemResponse.setLanguageId(t.getLanguage().getLanguageId());
           itemResponse.setLanguageName((t.getLanguage().getLanguageName()));
           itemResponse.setTechnologyId(t.getTechnologyId());
           itemResponse.setTechnologyName(t.getTechnologyName());
           getAllTechnoloyResponse.add(itemResponse);

       }
       return getAllTechnoloyResponse;
    }

    @Override
    public void add(AddTechnologyRequests addTechnologyRequests) {
        Language language = new Language();
        Technology technology = new Technology();

       technology.setTechnologyName(addTechnologyRequests.getTechnologyName());

       var languageObject = languageRepository.findById(addTechnologyRequests.getLanguageId()).get();
       language.setLanguageName(languageObject.getLanguageName());
       language.setLanguageId(languageObject.getLanguageId());

       technology.setLanguage(languageObject);
       this.technologyRepository.save(technology);
    }

    @Override
    public void delete(DeleteTechnologyRequests deleteTechnologyRequests) {
        Technology technology = new Technology();
        technology.setTechnologyId(deleteTechnologyRequests.getTechnologyId());
        this.technologyRepository.delete(technology);

    }

    @Override
    public void update(UpdateTechnologyRequests updateTechnologyRequests) {
         Language language = languageRepository.findById(updateTechnologyRequests.getTechnologyId()).get();
         Technology technology = technologyRepository.findById(updateTechnologyRequests.getLanguageId()).get();
         technology.setTechnologyName(updateTechnologyRequests.getTechnologyName());
         technology.setLanguage(language);
    }
}
