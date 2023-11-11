package ru.netology.hibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernate.entities.Person;
import ru.netology.hibernate.repository.Repository;

import java.util.List;

@RestController
public class Controller {

    private final Repository repository;

    public Controller (Repository repository) {
        this.repository = repository;
    }

    @GetMapping("/persons/by-city")
    public List<Person> getPersonsByCity(@RequestParam("city") String city) {
        return repository.getPersonsByCity(city);
    }
}
