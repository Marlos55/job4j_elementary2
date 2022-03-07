package ru.job4j;
/*
coins - массив монет в автомате

rsl - сдача в виде массива монет

size - размер массива rsl , которого он достигнет после того, как автомат отдаст всю сдачу

money - купюра из кармана;

price - цена покупки
 */
import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        while (money != price){
            for (int coin : coins) {
                if (money - price >= coin){
                    money = money - coin;
                    rsl[size] = coin;
                    size = size + 1;
                    break;
                }

            }

        }
        for (int coin : coins) {
            while (money >= coin + price) {
                   money = money - coin;
                   rsl[size++] = coin;

            }
        }

        return Arrays.copyOf(rsl, size);
    }
}