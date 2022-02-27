package ru.job4j;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] rc = new int[5];
        for (int i = 0; i < rc.length; i++) {
            rc[i] = i * 2 + 3;

        }
        for (int number : rc ) {
            System.out.println(number);

        }
    }
}
