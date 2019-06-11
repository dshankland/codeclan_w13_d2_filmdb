package com.codeclan.example.FilmDatabase.models;

import net.bytebuddy.dynamic.loading.ClassInjector;

public class Film {

    private Long id;
    private String title;
    private Director director;
    private FilmGenre genre;

    public Film(String title, Director director, FilmGenre genre) {
        this.title = title;
        this.director = director;
        this.genre = genre;
    }

    public Film() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public FilmGenre getGenre() {
        return genre;
    }

    public void setGenre(FilmGenre genre) {
        this.genre = genre;
    }
}
