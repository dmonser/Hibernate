package ru.netology.Hibernate.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "persons", schema = "hibernate")
@IdClass(PersonId.class)
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Id
    @Column(nullable = false)
    private String name;

    @Id
    @Column(nullable = false)
    private String surname;

    @Column()
    private int age;

    @Column
    private String phone_number;

    @Column(nullable = false)
    private String city_of_living;
}

@AllArgsConstructor
@NoArgsConstructor
@Data
class PersonId implements Serializable {
    private long id;
    private String name;
    private String surname;
}