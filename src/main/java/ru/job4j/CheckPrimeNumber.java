package ru.job4j;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        for (int index = 2; index <number; index++) {
            if ((number % 5) == 0) {
                prime = true;
                break;
            }

        }
        return prime;
    }
}