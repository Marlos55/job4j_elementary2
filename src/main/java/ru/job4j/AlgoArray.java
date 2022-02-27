package ru.job4j;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int tem3 = array[1];
        array[1] = array[2];
        array[2] = tem3;

        int temp = array[0]; /* переменная для временного хранения значение ячейки с индексом 0. */
        array[0] = array[3]; /* записываем в ячейку с индексом 0 значение ячейки с индексом 3. */
        array[3] = temp; /* записываем в ячейку с индексом 3 значение временной переменной. */

        int tem5 = array[3];
        array[3] = array[4];
        array[4] = tem5;


        for (int i : array) {
            System.out.println(i);
        }
    }
}
