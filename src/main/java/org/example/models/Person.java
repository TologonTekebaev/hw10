package org.example.models;

import lombok.*;
import org.example.interfaces.Animal;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component

public class Person {
    private String name;
    private int age;
    private Animal animal;

    public Person(String name, int age, Animal animal) {
        this.name = name;
        this.age = age;
        this.animal = animal;
    }
}


