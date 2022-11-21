package com.languagess.demo.businnes.abstracts;

import com.languagess.demo.businnes.requests.technology.AddTechnologyRequests;
import com.languagess.demo.businnes.requests.technology.DeleteTechnologyRequests;
import com.languagess.demo.businnes.requests.technology.UpdateTechnologyRequests;
import com.languagess.demo.businnes.responses.technology.GetAllTechnoloyResponse;

import java.util.List;

public interface TechnologyService {
    List<GetAllTechnoloyResponse> getAll();

    void add(AddTechnologyRequests addTechnologyRequests);
    void delete(DeleteTechnologyRequests deleteTechnologyRequests);
    void update(UpdateTechnologyRequests updateTechnologyRequests);
}
