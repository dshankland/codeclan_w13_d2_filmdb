package com.codeclan.example.FilmDatabase.repositories;

import com.codeclan.example.FilmDatabase.models.Director;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DirectorRepository extends JpaRepository<Director, Long> {
}
