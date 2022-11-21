package com.languagess.demo.businnes.responses.technology;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetAllTechnoloyResponse {
    private int technologyId;
    private String technologyName;
    private int languageId;
    private String languageName;
}
