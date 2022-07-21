package ru.sayinfull.example.lesson8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AboutComparator {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person(1, "Bob"));
        people.add(new Person(3, "Mike"));
        people.add(new Person(2, "Katy"));

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getId() > o2.getId()) {
                    return 1;
                } else if (o1.getId() < o2.getId()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(people);

        List<String> animals = new ArrayList<>();
        animals.add("dog");
        animals.add("aa");
        animals.add("cat");
        animals.add("ajkfsndalkjf");
        animals.add("frog");
        animals.add("a");
        animals.add("bird");

        Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(0);
        numbers.add(500);
        numbers.add(100);

        Collections.sort(numbers, new BackwardsIntegerComparator());
        System.out.println(numbers);
    }
}

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
        /*
        o1 > o2 => 1;
        o1 < o2 => -1;
        o1 == o2 => 0;
        compare(2, 1) => 1;
        compare(1, 2) =>-1;
        compare(1, 1) => 0
         */
    }
}

class BackwardsIntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 > o2) {
            return -1;
        } else if (o1 < o2) {
            return 1;
        } else {
            return 0;
        }
    }
}

class Person {
    private int id;
    private String name;

    public int getId() {
        return id;
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
}
