package ru.job4j;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i <= finish; i++) {
            if(min > array[i])
                min = array[i];

        }
        return min;
    }
}