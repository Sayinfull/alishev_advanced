package ru.sayinfull.example.lesson6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class AboutSet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(6);

        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);


        hashSet.add("Mike");
        hashSet.add("Cat");
        hashSet.add("Poul");
        hashSet.add("Alfredo");
        hashSet.add("Tom");

        for (String name : hashSet){
            System.out.println(name);
        }
        System.out.println(hashSet.contains("Tom"));
        System.out.println(hashSet.isEmpty());

        //union - объединение множеств
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union);

        //intersection - пересечение множеств
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); //метод retainall сохраняет все повторяющиеся элементы из второго объекта
        System.out.println(intersection);

        // difference - разность множеств
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println(difference);
    }
}
