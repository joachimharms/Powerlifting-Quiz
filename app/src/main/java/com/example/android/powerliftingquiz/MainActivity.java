package com.example.android.powerliftingquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity
{
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkQuestFive()
    {
        EditText editText = (EditText) findViewById(R.id.edit_text_view);
        String ans = editText.getText().toString().toLowerCase();
        if(ans.contains("raw"))
        {
            score ++;
            Log.v("MainActivity", "Value: " + score);
        }
    }





}
