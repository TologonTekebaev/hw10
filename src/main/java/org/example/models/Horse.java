package org.example.models;

import lombok.*;
import org.example.interfaces.Animal;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Horse implements Animal {

    @Value("${horse.name}")
    private String name;
    @Value("${horse.age}")
    private int age;
    @Value("${horse.color}")
    private String color;
    @Value("${horse.price}")
    private int price;


    @PostConstruct
    @Override
    public void animalPlus() {
        System.out.println("Doing horse initialization");
    }
    @PreDestroy
    @Override
    public void animalMinus() {
        System.out.println("Doing horse destruction");
    }
}
