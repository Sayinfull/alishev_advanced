package ru.sayinfull.example.Regexp.regexpPartOne;

import java.util.Arrays;

public class AboutRegexp {
    public static void main(String[] args) {

        /*
        \\d - одна цифра
        \\w - одна буква
        + - 1 или более цифр
        * - 0 или более цифр
        Если поставить минус перед обратными слешами, то он покажет наличие отрицательных цирф
        ? - 0 или более символов до, проверяет есть ли

       (x|y|z) - одна строка из множества строк
       [a-zA-Z] - все английские буквы
       [0-9] - \\d одна цифра
       [^abc] - мы хотим все символы кроме [abc]

       . - мы предполагаем любой символ

       {2} - 2 симвала до (\\d{2})
       {2, } - 2 2 или более символа (\\d{2, })
       {2, 4} - от 2 до 4 символов (\\d{2, 4})
         */

        String a = "-1234";
        String b = "1234";
        String c = "+1234";
        System.out.println(a.matches("(-|\\+)?\\d*"));
        System.out.println(b.matches("(-|\\+)?\\d*"));
        System.out.println(c.matches("(-|\\+)?\\d*"));

        String d = "a111dfgdf1111111asadsfgsga333sdfght333333a123124124";
        System.out.println(d.matches("[a-zA-Z31]+\\d*"));

        String e = "helloc";
        System.out.println(e.matches("[^abc]*"));

        String url = "http://www.google.com";
        String url2 = "http://www.yandex.ru";
        System.out.println(url.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(url2.matches("http://www\\..+\\.(com|ru)"));

        String f = "Hello12348917549there1251324keyqw124salam";
        String[] words = f.split("\\d+");
        System.out.println(Arrays.toString(words));

        String ab = "Hello12312there123125165key";
        String words2 = ab.replaceAll("\\d+", ".");
        String words3 = ab.replaceFirst("\\d+", ".");
        System.out.println(words2);
        System.out.println(words3);
    }
}
