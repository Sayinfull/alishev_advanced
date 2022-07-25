package ru.sayinfull.example.JavaCollectionsFramework.lesson2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedorArrayList {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>(); // linked и array листы имеют одинаковые методы
        //Разница лишь в скорости обработки данных. Так, например, добавлять в конец массива  лучше через arrayList
        // А удалять и добавлять в начало массива через linkedList
        List<Integer> arrayList = new ArrayList<>();

        measureTime(linkedList);
        measureTime(arrayList);

    }

    private static void measureTime(List<Integer> list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            list.add(0,i);
        }


        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
