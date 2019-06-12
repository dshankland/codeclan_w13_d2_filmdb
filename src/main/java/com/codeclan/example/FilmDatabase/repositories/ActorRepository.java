package com.codeclan.example.FilmDatabase.repositories;

import com.codeclan.example.FilmDatabase.models.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Long> {
}
