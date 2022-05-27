package org.example.models;

import lombok.*;
import org.example.interfaces.Animal;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Dog implements Animal {
    @Value("${dog.name}")
    private String name;
    @Value("${dog.color}")
    private String color;

    @PostConstruct
    @Override
    public void animalPlus() {
        System.out.println("Doing dog initialization");
    }
    @PreDestroy
    @Override
    public void animalMinus() {
        System.out.println("Doing dog destruction");
    }
}
