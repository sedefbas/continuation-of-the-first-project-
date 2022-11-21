package com.languagess.demo.entity.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Table(name = "languages")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "language_id")
    private int languageId;

    @Column(name = "language_name")
    private  String languageName;

    @OneToMany(mappedBy = "language")
    private List<Technology> technologies;

}
