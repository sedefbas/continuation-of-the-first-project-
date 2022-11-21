package com.languagess.demo.businnes.concretes;
import com.languagess.demo.businnes.abstracts.LanguageService;
import com.languagess.demo.businnes.requests.language.DeleteLanguageRequests;
import com.languagess.demo.businnes.requests.language.NewLanguageRequests;
import com.languagess.demo.businnes.requests.language.UpdateLanguageRequests;
import com.languagess.demo.businnes.responses.language.GetAllLanguageResponse;
import com.languagess.demo.businnes.responses.language.GetLanguageByIdResponse;
import com.languagess.demo.dataAccess.abstracts.LanguageRepository;
import com.languagess.demo.entity.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class LanguageManager implements LanguageService {

    private LanguageRepository languageRepository;

    @Autowired
    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<GetAllLanguageResponse> getAll() {
        List<GetAllLanguageResponse> getAllLanguageResponses = new ArrayList<GetAllLanguageResponse>();
        List<Language> languages = languageRepository.findAll();
        for (Language l : languages)
        { GetAllLanguageResponse item = new GetAllLanguageResponse();
            item.setLanguageId(l.getLanguageId());
            item.setLanguageName((l.getLanguageName()));
            getAllLanguageResponses.add(item);
        }
        return getAllLanguageResponses;
    }




    @Override
    public GetLanguageByIdResponse getById(int id) {
       GetLanguageByIdResponse getByIdResponse = new GetLanguageByIdResponse();
       Optional<Language> languages = Optional.of(languageRepository.findById(id).get());


        return getByIdResponse;
    }

    @Override
    public void add(NewLanguageRequests newLanguageRequests) {
        Language language = new Language();
        language.setLanguageName(newLanguageRequests.getLanguageName());

        if (language.getLanguageName().isEmpty()) {
            try {
                throw new Exception("Programming language name cannot be empty.");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        for (Language programmingLanguage : languageRepository.findAll()) {
            if (programmingLanguage.getLanguageName().equals(language.getLanguageName())) {
                try {
                    throw new Exception("This programming language is already exists.");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }

        for (Language programmingLanguage : languageRepository.findAll()) {
            if (programmingLanguage.getLanguageId() == language.getLanguageId()) {
                try {
                    throw new Exception("Enter a different id. This id is already exists.");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }

        this.languageRepository.save(language);
    }





    @Override
    public void update(UpdateLanguageRequests updateLanguageRequests) {
        Language language = new Language();
        language.setLanguageName(updateLanguageRequests.getLanguageName());
        language.setLanguageId(updateLanguageRequests.getLanguageId());
        this.languageRepository.save(language);

    }

    @Override
    public void delete(DeleteLanguageRequests deleteLanguageRequests) {
        Language language = new Language();
        language.setLanguageId(deleteLanguageRequests.getLanguageId());
        this.languageRepository.delete(language);

    }
}
