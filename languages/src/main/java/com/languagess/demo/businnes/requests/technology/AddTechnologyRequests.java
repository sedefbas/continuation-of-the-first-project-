package com.languagess.demo.businnes.requests.technology;

import lombok.*;
import org.springframework.stereotype.Service;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddTechnologyRequests {
    private String technologyName;
    private int languageId;
}
