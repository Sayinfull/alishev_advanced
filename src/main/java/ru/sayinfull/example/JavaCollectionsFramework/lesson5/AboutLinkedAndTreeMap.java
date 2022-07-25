package ru.sayinfull.example.JavaCollectionsFramework.lesson5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AboutLinkedAndTreeMap {
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<>();// нет порядка
        Map<Integer, String> linkedMap = new LinkedHashMap<>(); // есть порядок(сортировка) в том порядке
        // в каком их добавили
        Map<Integer,String> treeMap = new TreeMap<>(); // все данные отсортированы по ключу значения (от 0 до 10 например)
            testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map){
        map.put(39,"Bob");
        map.put(12, "Chris");
        map.put(77, "Tom");
        map.put(0, "Tim");
        map.put(7, "Sos");
        map.put(1500, "Rose");

        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
