package ru.sayinfull.example.JavaSyntax.lesson1;


import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int value;
        do {
            Thread.sleep(1000);
            System.out.println("Введи 5");
            value = scanner.nextInt();
            if (value != 5) {
                System.out.println("Вы ввели " + value + ",а нужно 5");
            }
        } while (value != 5);
        System.out.println("Вы ввели 5");
    }
}
