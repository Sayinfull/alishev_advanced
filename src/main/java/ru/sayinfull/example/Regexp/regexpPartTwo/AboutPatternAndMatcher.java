package ru.sayinfull.example.Regexp.regexpPartTwo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AboutPatternAndMatcher {
    public static void main(String[] args) {
        String text = "Hello, Guys! I send you my email joe@gmail.com so we can\n" +
                "keep in touch. Thanks, Joe! That's cool. I am sending you \n" +
                "my adress: tim@yandex.ru. Let's stay in touch...";
        Pattern email = Pattern.compile("(\\w+)@(gmail|yandex)\\.(com|ru)");
        Matcher matcher = email.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group());
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            System.out.println(matcher.group(3));
        }
    }
}
