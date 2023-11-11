package ru.netology.hibernate.repository;

import ru.netology.hibernate.entities.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getPersonsByCity(String city) {
        return entityManager.createQuery("from Person where lower(city_of_living) = lower(:city)", Person.class)
                .setParameter("city", city)
                .getResultList();
    }
}
