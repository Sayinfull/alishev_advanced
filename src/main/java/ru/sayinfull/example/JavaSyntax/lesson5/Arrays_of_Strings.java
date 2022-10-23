package ru.sayinfull.example.JavaSyntax.lesson5;

public class Arrays_of_Strings {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        String[] strings = new String[3];
        strings[0] = "hello";
        strings[1] = "bye";
        strings[2] = "java";
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        System.out.println();
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println();

        int[] array = {1, 2, 3, 4, 5};
        int sum1 = 0;
        for (int i = 0; i < array.length; i++) {
            sum1 += + array[i];
        }
        System.out.println(sum1);

        int[] array2 = {1, 2, 3, 4, 5};
        int sum2 = 0;
        for(int x : array2){
            sum2 += x;
        }
        System.out.println(sum2);

    }

}
