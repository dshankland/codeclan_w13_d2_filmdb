package com.codeclan.example.FilmDatabase.models;

import java.util.ArrayList;
import java.util.List;

public class Director {

    private Long id;
    private String name;
    private List<Film> films;

    public Director(String name) {
        this.name = name;
        this.films = new ArrayList<>();
    }

    public Director() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public void addFilm(Film film) {
        this.films.add(film);
    }
}
