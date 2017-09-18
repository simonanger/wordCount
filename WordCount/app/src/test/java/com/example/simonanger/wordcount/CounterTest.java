package com.example.simonanger.wordcount;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by simonanger on 18/09/2017.
 */
public class CounterTest {

    Counter counter;

    @Test
    public void canCountWords() {
        assertEquals(2, counter.countWords("Hello world"));
    }

}