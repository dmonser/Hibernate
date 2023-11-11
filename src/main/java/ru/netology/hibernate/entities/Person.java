package ru.netology.hibernate.entities;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(schema = "hibernate", name = "persons")
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

    @Column
    @ToString.Exclude
    private Integer age;

    @Column(name = "phone_number")
    @ToString.Exclude
    private String phoneNumber;

    @Column(nullable = false, name = "city_of_living")
    private String cityOfLiving;
}

@AllArgsConstructor
@NoArgsConstructor
@Data
class PersonId implements Serializable {
    private long id;
    private String name;
    private String surname;
}