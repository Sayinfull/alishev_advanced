package ru.sayinfull.example.lesson3;

public class MyLinkedList {
    public static void main(String[] args) {
        AboutLinkedList2 aboutLinkedList2 = new AboutLinkedList2();
        aboutLinkedList2.add(1);
        aboutLinkedList2.add(2);
        aboutLinkedList2.add(10);

        System.out.println(aboutLinkedList2);
        System.out.println(aboutLinkedList2.get(0));
        System.out.println(aboutLinkedList2.get(1));
        System.out.println(aboutLinkedList2.get(2));

        aboutLinkedList2.remove(1);
        System.out.println(aboutLinkedList2);
        aboutLinkedList2.remove(1);
        System.out.println(aboutLinkedList2);
    }
}
