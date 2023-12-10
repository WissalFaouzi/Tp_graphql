package com.example.demo2;

import com.example.demo2.enums.Genre;
import com.example.demo2.model.Centre;
import com.example.demo2.model.Etudiant;
import com.example.demo2.repository.CentreRepository;
import com.example.demo2.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
 public class TpGraphQlApplication implements CommandLineRunner{
    @Autowired
    EtudiantRepository etudiantRepository;
    @Autowired
    CentreRepository centreRepository;
    public static void main(String[] args) {
        SpringApplication.run(TpGraphQlApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {

        Centre c1 = Centre.builder()
                .nom("Centre A")
                .adresse("biranzan")
                .build();
        centreRepository.save(c1);

        Centre c2 = Centre.builder()
                .nom("Centre B")
                .adresse("roudani")
                .build();
        centreRepository.save(c2);


        Etudiant et1 = Etudiant.builder()
                .nom("Adnani")
                .prenom("Morad")
                .genre(Genre.HOMME)
                .centre(c2)
                .build();
        etudiantRepository.save(et1);

        Etudiant et2 = Etudiant.builder()
                .nom("bouazi")
                .prenom("farid")
                .genre(Genre.HOMME)
                .centre(c1)
                .build();
        etudiantRepository.save(et2);

        Etudiant et3 = Etudiant.builder()
                .nom("wissal")
                .prenom("wissal")
                .genre(Genre.FEMME)
                .centre(c2)
                .build();
        etudiantRepository.save(et3);


    }}

