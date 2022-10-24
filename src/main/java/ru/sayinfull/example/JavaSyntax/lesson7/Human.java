package ru.sayinfull.example.JavaSyntax.lesson7;

public class Human {
    public static void main(String[] args) {

        Humans human1 = new Humans("Salikh", 26);
        human1.getInfo();

    }
}

class Humans {
    private String name;
    private int age;

    public Humans(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getInfo() {
        System.out.println("Меня зовут " + name + " и мне " + age + " лет.");
    }
}
