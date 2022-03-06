package ru.job4j;

public class Matrix {
    public static int[][] multiple(int size){
        int[][] mas = new int [size][size];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                mas[i][j]= (i+1) * (j+1);
            }
        }
        return mas;
    }
}
