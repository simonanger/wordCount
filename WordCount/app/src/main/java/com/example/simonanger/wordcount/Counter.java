package com.example.simonanger.wordcount;

/**
 * Created by simonanger on 18/09/2017.
 */

public class Counter {
    public static int countWords(String input) {
        if (input.trim().isEmpty() || input == null ) {
            return 0;
        }
        String[] arrayOfWords = input.trim().split(" ");
        int numberofWords = arrayOfWords.length;
        return numberofWords;
    }
}

//string.split