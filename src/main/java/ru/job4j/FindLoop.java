package ru.job4j;

public class FindLoop {
    public static int indexOf (int[] data, int el){
        int index;
        int rst = -1;
        for (index = 0; index!=el; index++ ) {
            if (data[index] == el){
                rst = index;
                break;
            }
        }
        return rst;
    }
}
