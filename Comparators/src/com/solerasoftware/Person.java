package com.solerasoftware;

public class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "com.solerasoftware.Person{" +
            "amount=" + age +
            ", side=" + name +
            '}';
    }
}
