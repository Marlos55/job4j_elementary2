package ru.job4j;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            if(word[word.length - i - 1] != post[post.length-i-1]){
                result = false;
                break;
            }else result = true;

        }
        return result;
    }
}