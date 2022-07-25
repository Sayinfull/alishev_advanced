package ru.sayinfull.example.JavaCollectionsFramework.lesson12;

import java.util.ArrayList;
import java.util.Iterator;

public class AboutIterable {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();

        int index = 0;
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            if (index == 1) {
                iterator.remove();
                index++;
            }
            System.out.println(list);
        }

//        for (int x : list) {
//            System.out.println(x);
//        }
    }
}
