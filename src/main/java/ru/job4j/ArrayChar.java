package ru.job4j;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            result = word[i] == pref[i];
        }
        for (int i = 0; i < pref.length; i++) {
            if(word[i] != pref[i]){
                result = false;
                break;
            }
            else result = true;

        }
        return result;
    }
}