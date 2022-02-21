package ru.job4j;

public class Factorial {

    public static int calc(int n){
        int res = 1;
        for (int index = 1; index <= n; index++){
            res = res * index;
        }
        return res;
    }
}
