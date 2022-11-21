package com.languagess.demo.webApi.controller;
import com.languagess.demo.businnes.abstracts.LanguageService;
import com.languagess.demo.businnes.requests.language.DeleteLanguageRequests;
import com.languagess.demo.businnes.requests.language.NewLanguageRequests;
import com.languagess.demo.businnes.requests.language.UpdateLanguageRequests;
import com.languagess.demo.businnes.responses.language.GetAllLanguageResponse;
import com.languagess.demo.businnes.responses.language.GetLanguageByIdResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
    private LanguageService languageService;
    @Autowired
    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }
    @GetMapping("/getAll")
    public List<GetAllLanguageResponse> getAll() {
        return languageService.getAll();

    }
    @GetMapping("/getById")
    public GetLanguageByIdResponse getById(int id)
    { return languageService.getById(id);}

    @PostMapping("/add")
    public void add(NewLanguageRequests newLanguageRequests)
    {  languageService.add(newLanguageRequests);
    }
    @DeleteMapping("/delete")
    public void delete(DeleteLanguageRequests deleteLanguageRequests)
    {  languageService.delete(deleteLanguageRequests);
    }
    @PutMapping("/update")
    public void update(UpdateLanguageRequests updateLanguageRequests)
    {  languageService.update(updateLanguageRequests); }

}
