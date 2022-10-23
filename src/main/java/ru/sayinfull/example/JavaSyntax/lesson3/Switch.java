package ru.sayinfull.example.JavaSyntax.lesson3;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст");
        int age = scanner.nextInt();
        switch (age) {
            case 0:
                System.out.println("Ты родился");
                break;
            case 7:
                System.out.println("Пора в школу");
                break;
            case 18:
                System.out.println("Пора в институт");
                break;
            case 30:
                System.out.println("Пора заводить детей");
                break;
            default:
                System.out.println("Где то между");
        }

    }
}
