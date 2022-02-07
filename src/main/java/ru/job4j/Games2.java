package ru.job4j;

public class Games2 {
    public static void per(boolean allowByPar, boolean hasMoney){

        if(allowByPar && hasMoney){
            System.out.println("I can go to the computer club.");
        }else {
            System.out.println("I can't.");
        }
    }
    public static void main(String[] args){
        Games2.per(true, true);
        Games2.per(true, false);
        Games2.per(false, true);
        Games2.per(false, false);
    }
}
