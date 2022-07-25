package ru.sayinfull.example.JavaCollectionsFramework.lesson9;

import java.util.*;

public class AboutComparable {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        Set<Person> personSet = new TreeSet<>();

        addPerson(personList);
        addPerson(personSet);

        System.out.println(personList);
        System.out.println(personSet);

    }

    public static void addPerson(Collection collection) {
        collection.add(new Person(1, "Bob"));
        collection.add(new Person(4, "George"));
        collection.add(new Person(3, "Mike"));
        collection.add(new Person(2, "Tom"));

    }
}

class Person implements Comparable<Person> {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if (this.id > o.getId()){
            return 1;
        }if (this.id < o.getId()){
            return -1;
        }else {
            return 0;
        }
    }
}


