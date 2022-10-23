package ru.sayinfull.example.JavaSyntax.lesson6;

public class Multimensional_arrays {
    public static void main(String[] args) {


        int[][] arrays1 = {{1, 2, 3},
                {3, 4, 5,},
                {6, 7, 8}};
        System.out.println(arrays1[1][1]);
        System.out.println();

        int[][] arrays2 = new int[5][5];
        for (int i = 0; i < arrays2.length; i++) {
            for (int j = 0; j < arrays2[i].length; j++) {
                arrays2[i][j] = j + 1;
                System.out.print(arrays2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
