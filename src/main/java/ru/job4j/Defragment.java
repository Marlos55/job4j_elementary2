package ru.job4j;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] != null) {
                while (index != 0) {
                    if (array[index - 1] == null) {
                        String temp = array[index - 1];
                        array[index - 1] = array[index];
                        array[index] = temp;
                    }
                    index--;
                }
            }
        }
        return array;
    }
}