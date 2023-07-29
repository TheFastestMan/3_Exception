package fileReaderTask4;

import java.util.Objects;

public class Person {
    private String name;
    private String sureName;
    private int age;

    public Person(String name, String sureName, int age) {
        this.name = name;
        this.sureName = sureName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSureName() {
        return sureName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return getAge() == person.getAge() && Objects.equals(getName(), person.getName()) &&
                Objects.equals(getSureName(), person.getSureName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSureName(), getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sureName='" + sureName + '\'' +
                ", age=" + age +
                '}';
    }
}
