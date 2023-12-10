package com.example.demo2.DTO;

import com.example.demo2.enums.Genre;

public record EtudiantDTO(
        String nom,
        String prenom,
        Genre genre,
        Long centreId
                        ) {}

