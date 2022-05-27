package org.example.config;

import org.example.models.Dog;
import org.example.models.Horse;
import org.example.models.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.example.models")
@PropertySource("classpath:application.properties")

public class SpringConfiguration {

    @Bean
    public Horse horse(){
        return new Horse();
    }

    @Bean
    public Dog dog(){
        return new Dog();
    }

    @Bean("person")
    public Person person(){
        return new Person("Tologon", 25, horse());
    }


    @Bean("person2")
    public Person person2(){
        return new Person("Nargiza", 18, dog());
    }
}
