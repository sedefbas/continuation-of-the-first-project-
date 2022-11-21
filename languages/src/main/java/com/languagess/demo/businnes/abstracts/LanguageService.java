package com.languagess.demo.businnes.abstracts;

import com.languagess.demo.businnes.requests.language.DeleteLanguageRequests;
import com.languagess.demo.businnes.requests.language.NewLanguageRequests;
import com.languagess.demo.businnes.requests.language.UpdateLanguageRequests;
import com.languagess.demo.businnes.responses.language.GetAllLanguageResponse;
import com.languagess.demo.businnes.responses.language.GetLanguageByIdResponse;

import java.util.List;

public  interface LanguageService {
    List<GetAllLanguageResponse> getAll();
    GetLanguageByIdResponse getById(int id);
    void add(NewLanguageRequests newLanguageRequests);
    void update(UpdateLanguageRequests updateLanguageRequests);
    void delete(DeleteLanguageRequests deleteLanguageRequests);



}
//getALl method, getById, delete , update , add