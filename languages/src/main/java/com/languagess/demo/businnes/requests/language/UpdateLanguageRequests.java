package com.languagess.demo.businnes.requests.language;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UpdateLanguageRequests {
    private int languageId;
    private String languageName;

}
