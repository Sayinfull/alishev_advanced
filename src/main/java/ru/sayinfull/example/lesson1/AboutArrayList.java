package ru.sayinfull.example.lesson1;

import java.util.ArrayList;

public class AboutArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList); // arraylist автоматически имеет метод toString и поэтому сразу отобразится

        System.out.println(arrayList.get(0)); // метод get позволяет получить данные по индексу
        System.out.println(arrayList.get(99));

        System.out.println(arrayList.size()); // метод size возвращает количество элементов в массиве

        for (int i = 0; i < arrayList.size(); i++) {     //с помощью цикла получаем данные по индеку i,
            System.out.println(arrayList.get(i));
        }
        for (Integer x : arrayList) {   //аналогично с помощью цикла for each можем получить данные массива
            System.out.println(x);
        }

        arrayList.remove(5); // с помощью метода remove можно удалить элемент поопределенному индексу

    }
}
