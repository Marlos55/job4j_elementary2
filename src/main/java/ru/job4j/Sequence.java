package ru.job4j;

public class Sequence {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
            }
        }
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = args.length *i + j + 1;
            }
        }
    }
}