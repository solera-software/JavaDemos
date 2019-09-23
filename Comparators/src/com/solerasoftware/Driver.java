package com.solerasoftware;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(80, "Adam"));
        people.add(new Person(23, "Zelda"));
        people.add(new Person(23, "Anna"));
        people.add(new Person(45, "Anna"));
        people.add(new Person(17, "Gina"));

        System.out.println("Age only");
        Collections.sort(people, Comparator.comparing(Person::getAge));
        people.forEach(System.out::println);

        System.out.println("Name only");
        Collections.sort(people, Comparator.comparing(Person::getName));
        people.forEach(System.out::println);

        System.out.println("Age then name");
        Collections.sort(people, Comparator.comparing(Person::getAge).thenComparing(Person::getName));
        people.forEach(System.out::println);

        System.out.println("Name then age");
        Collections.sort(people, Comparator.comparing(Person::getName).thenComparing(Person::getAge));
        people.forEach(System.out::println);
    }
}
