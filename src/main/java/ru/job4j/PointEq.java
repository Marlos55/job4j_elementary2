package ru.job4j;

public class PointEq {
    public static boolean eq(int x1, int y1, int x2, int y2) {
        return x2 == x1 && y2 == y1;

    }

    public static void main(String[] args) {
        System.out.println(eq(1, 1, 2, 2));
        System.out.println(eq(10, 10, 10, 10));
    }
}