package com.languagess.demo.businnes.requests.technology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateTechnologyRequests {
    private int technologyId;
    private String technologyName;
    private int languageId;
}
