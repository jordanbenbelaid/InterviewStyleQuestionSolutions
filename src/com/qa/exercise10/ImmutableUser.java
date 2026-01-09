package com.qa.exercise10;

public class ImmutableUser {
    private final String name;
    private final int age;

    public ImmutableUser(String name, int age) {
        if (name == null || age < 0) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
