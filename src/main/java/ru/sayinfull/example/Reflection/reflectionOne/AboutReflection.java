package ru.sayinfull.example.Reflection.reflectionOne;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class AboutReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();
        Class personClass1 = Person.class;
        Class personClass2 = person.getClass();
        Class personClass3 = Class.forName("ru.sayinfull.example.Reflection.reflectionOne.Person");

//        Method[] methods = personClass1.getMethods();
//        for (Method method : methods) {
//            System.out.println(method.getName() + ", "
//                    + method.getReturnType() + ", " + Arrays.toString(method.getParameterTypes()));
//        }

//        Field[] fields = personClass1.getFields();
//        for (Field field : fields) {
//            System.out.println(field.getName() + ", " + field.getType());
//        }

        Annotation[] annotations = personClass1.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof Author) {
                System.out.println("Yes");
            }
        }
    }
}
