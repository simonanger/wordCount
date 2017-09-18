package com.example.simonanger.wordcount;

/**
 * Created by simonanger on 18/09/2017.
 */

public class Counter {
    public static int countWords(String input)
    {
        return input.split(" ").length;
    }
}

//string.split