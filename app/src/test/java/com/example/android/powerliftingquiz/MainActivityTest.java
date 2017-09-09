package com.example.android.powerliftingquiz;

import android.util.Log;
import android.widget.EditText;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Joachim on 09.09.2017.
 */
public class MainActivityTest {

    @Test
    public void checkQuestFive()
    {
        int score = 0;
        String editText = "It is a RAW Competition";
        String ans = editText.toLowerCase();
        if(ans.contains("raw"))
        {
            score++;
        }
        assertEquals(1, score);
    }

}