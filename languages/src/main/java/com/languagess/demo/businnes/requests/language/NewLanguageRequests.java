package com.languagess.demo.businnes.requests.language;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewLanguageRequests {
    private String languageName;
    private int languageId;
}
