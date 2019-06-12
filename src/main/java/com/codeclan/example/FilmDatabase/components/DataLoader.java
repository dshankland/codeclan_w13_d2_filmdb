package com.codeclan.example.FilmDatabase.components;

import com.codeclan.example.FilmDatabase.models.Actor;
import com.codeclan.example.FilmDatabase.models.Director;
import com.codeclan.example.FilmDatabase.models.Film;
import com.codeclan.example.FilmDatabase.models.FilmGenre;
import com.codeclan.example.FilmDatabase.repositories.ActorRepository;
import com.codeclan.example.FilmDatabase.repositories.DirectorRepository;
import com.codeclan.example.FilmDatabase.repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FilmRepository filmRepository;

    @Autowired
    DirectorRepository directorRepository;

    @Autowired
    ActorRepository actorRepository;

    public DataLoader() {

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Director ssdirector = new Director("Stephen Spielberg");
        directorRepository.save(ssdirector);

		Film slfilm = new Film("Schindler's List", ssdirector, FilmGenre.DRAMA);
		filmRepository.save(slfilm);

		Film jpfilm = new Film("Jurassic Park", ssdirector, FilmGenre.SCIFI);
        filmRepository.save(jpfilm);

        ssdirector.addFilm(slfilm);
		ssdirector.addFilm(jpfilm);
		directorRepository.save(ssdirector);

        Actor jgactor = new Actor("Jeff Goldblum", 300000);
        jpfilm.addActor(jgactor);
        actorRepository.save(jgactor);

        Actor lnactor = new Actor("Liam Neeson", 500000);
        slfilm.addActor(lnactor);
        actorRepository.save(lnactor);

        Actor bkactor = new Actor("Ben Kingsley", 200000);
        slfilm.addActor(bkactor);
        actorRepository.save(bkactor);

        Actor snactor = new Actor("Sam Neill", 400000);
        jpfilm.addActor(snactor);
        actorRepository.save(snactor);

    }
}
