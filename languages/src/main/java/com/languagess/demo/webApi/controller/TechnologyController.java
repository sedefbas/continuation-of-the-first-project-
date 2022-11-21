package com.languagess.demo.webApi.controller;

import com.languagess.demo.businnes.abstracts.LanguageService;
import com.languagess.demo.businnes.abstracts.TechnologyService;
import com.languagess.demo.businnes.requests.language.DeleteLanguageRequests;
import com.languagess.demo.businnes.requests.language.NewLanguageRequests;
import com.languagess.demo.businnes.requests.language.UpdateLanguageRequests;
import com.languagess.demo.businnes.requests.technology.AddTechnologyRequests;
import com.languagess.demo.businnes.requests.technology.DeleteTechnologyRequests;
import com.languagess.demo.businnes.requests.technology.UpdateTechnologyRequests;
import com.languagess.demo.businnes.responses.technology.GetAllTechnoloyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/api/technologies")
public class TechnologyController {

    private TechnologyService technologyService;
    @Autowired
    public TechnologyController(TechnologyService technologyService) {
        this.technologyService = technologyService;
    }
    @GetMapping("/getAll")
     public List<GetAllTechnoloyResponse> getAll()
    { return technologyService.getAll(); }

   @PostMapping("/add")
   public void add(AddTechnologyRequests technology) {
          technologyService.add(technology);
    }
    @DeleteMapping("/deleteById")
   public void delete(DeleteTechnologyRequests id) {
       technologyService.delete(id);

    }

    @PutMapping("/update")
   public void update(UpdateTechnologyRequests technology)  {
       technologyService.update(technology);
    }
}











