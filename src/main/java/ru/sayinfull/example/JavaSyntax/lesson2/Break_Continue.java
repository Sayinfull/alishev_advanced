package ru.sayinfull.example.JavaSyntax.lesson2;

public class Break_Continue {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <= 15; i++) {
            if (i % 2 == 0) {
                continue;
            }
            Thread.sleep(500);
            System.out.println("Это нечетное число " + i);
        }
    }
}
