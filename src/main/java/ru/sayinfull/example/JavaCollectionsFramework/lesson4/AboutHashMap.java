package ru.sayinfull.example.JavaCollectionsFramework.lesson4;

import java.util.HashMap;
import java.util.Map;

public class AboutHashMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        System.out.println(map);

        map.put(3,  "other value for key"); // когда мы вставляем дубликат значения, то оно заменяется на новое.
        System.out.println(map);

        System.out.println(map.get(1));

        //Map.Entry вызывает пару ключ-значение ( т.е. 1, "one") и т.д.
        // map.entrySet вызывает все ключи, которые есть в мэпе

        for (Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
