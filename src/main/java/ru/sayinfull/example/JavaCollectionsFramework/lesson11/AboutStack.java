package ru.sayinfull.example.JavaCollectionsFramework.lesson11;

import java.util.Stack;

public class AboutStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1); // метод Push добавляет элемент в список
        stack.push(10);
        stack.push(7);

        while (!stack.empty()){
            System.out.println(stack.pop());
        }

        System.out.println(stack.pop()); // извлекает последний элемент из списка
        System.out.println(stack.pop());

    }
}
