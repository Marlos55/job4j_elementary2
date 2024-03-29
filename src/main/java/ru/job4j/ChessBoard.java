package ru.job4j;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2){
        int rsl = 0;
        if (isValid(x1) && isValid(x2) && isValid(y1) && isValid(y2)){
            if(y1 == x2 || x1 == y2){
                rsl = Math.abs(y1 - x2);
                rsl = rsl + Math.abs(x1 - y2);
            }
        }
        return rsl;
    }
    public static boolean isValid(int coordinate){
        return coordinate >= 0 && coordinate <= 7;
    }
}
