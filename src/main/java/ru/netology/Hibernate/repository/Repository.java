package ru.netology.Hibernate.repository;

import org.springframework.core.io.ClassPathResource;
import ru.netology.Hibernate.entities.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

@org.springframework.stereotype.Repository
public class Repository {

    @PersistenceContext
    EntityManager entityManager;

    public List<Person> getPersonsByCity(String city) {
        return (List<Person>) entityManager.createNativeQuery("select name, surname from hibernate.persons where lower(city_of_living) = lower(:city)")
                .setParameter("city", city)
                .getResultList();
    }
}
