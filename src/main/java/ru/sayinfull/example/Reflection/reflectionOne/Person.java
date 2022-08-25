package ru.sayinfull.example.Reflection.reflectionOne;


@Author(name = "Salikh", dateOfCreation = 1996)
public class Person {
    private String name;
    private int id;

    public Person() {
        this.id = -1;
        this.name = "No name";
    }

    public Person(String name, int id) {
        this.id = id;
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Person with id: " + id + " and name: " + name + " says hello!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
