package com.codeclan.example.FilmDatabase.models;

import java.util.ArrayList;
import java.util.List;

public class Actor {

    private Long id;
    private String name;
    private int salary;
    private List<Film> films;

    public Actor(String name, int salary) {
        this.name = name;
        this.salary = salary;
        this.films = new ArrayList<>();
    }

    public Actor() {
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
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
