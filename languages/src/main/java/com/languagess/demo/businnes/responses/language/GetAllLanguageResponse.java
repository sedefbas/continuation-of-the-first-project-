package com.languagess.demo.businnes.responses.language;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllLanguageResponse {
    private int languageId;
    private String languageName;
}
