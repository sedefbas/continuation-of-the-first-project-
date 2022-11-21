package com.languagess.demo.businnes.responses.language;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetLanguageByIdResponse {
    private String languageName;
}
