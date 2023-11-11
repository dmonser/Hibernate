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
        return (List<Person>) entityManager.createNativeQuery("select name, surname from hibernate.persons where lower(city_of_living) = lower(:city)")
                .setParameter("city", city)
                .getResultList();
    }
}
