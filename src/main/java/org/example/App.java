package org.example;

import org.example.config.SpringConfiguration;
import org.example.models.Dog;
import org.example.models.Horse;
import org.example.models.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Horse horse = context.getBean("horse", Horse.class);
        System.out.println(horse);

        Dog dog = context.getBean("dog", Dog.class);
        System.out.println(dog);

        Person person = context.getBean("person", Person.class);
        System.out.println(person);

        Person person2 = context.getBean("person2", Person.class);
        System.out.println(person2);

        context.close();
    }
}
