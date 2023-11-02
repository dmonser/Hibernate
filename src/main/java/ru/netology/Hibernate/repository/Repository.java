package ru.netology.Hibernate.repository;

import org.springframework.core.io.ClassPathResource;

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

    private final String scriptFileName = "search_by_city.sql";

    private final String sql = read(scriptFileName);

    private static String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String> getPersonsByCity(String city) {
        List<String> result = entityManager.createQuery(sql)
                .setParameter(1, city)
                .getResultList();

        return result;
    }
}
