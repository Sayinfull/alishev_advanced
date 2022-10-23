package ru.sayinfull.example.JavaSyntax.lesson4;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
            System.out.println(numbers[i]);
        }
        System.out.println();

        int[] numbers2 = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }
    }
}
