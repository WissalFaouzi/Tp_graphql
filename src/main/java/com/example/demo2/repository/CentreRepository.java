package com.example.demo2.repository;

import com.example.demo2.model.Centre;
import com.example.demo2.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource(path="centres")
public interface CentreRepository extends JpaRepository<Centre,Long> {
    List<Centre> findCentreByNom(@Param("c")String nom);

}