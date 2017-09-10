package com.example.android.powerliftingquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showResult(View view) {
        String ansToast = "";

        checkQuestOne();
        checkQuestTwo();
        checkQuestThree();
        checkQuestFour();
        checkQuestFive();

        switch (score) {
            case 0:
                ansToast = "Your score is " + score + " of 5. Lol - you are a fuggin weakling!";
                break;
            case 1:
                ansToast = "Your score is " + score + " of 5. Probably a fluke answer...";
                break;
            case 2:
                ansToast = "Your score is " + score + " of 5. Try harder next time.";
                break;
            case 3:
                ansToast = "Your score is " + score + " of 5. You've got some potential.";
                break;
            case 4:
                ansToast = "Your score is " + score + " of 5. Not bad!";
                break;
            case 5:
                ansToast = "Your score is " + score + " of 5. You are a strong mf!";
                break;

        }


        Toast.makeText(this, ansToast, Toast.LENGTH_LONG).show();
        score = 0;
    }

    public void checkQuestOne() {
        CheckBox checkboxSquat = (CheckBox) findViewById(R.id.checkbox_squat);
        CheckBox checkBoxBench = (CheckBox) findViewById(R.id.checkbox_bench_press);
        CheckBox checkBoxDeadlift = (CheckBox) findViewById(R.id.checkbox_deadlift);
        CheckBox checkBoxOverhead = (CheckBox) findViewById(R.id.checkbox_overhead_press);
        if ((checkboxSquat.isChecked()) && (checkBoxBench.isChecked()) && (checkBoxDeadlift.isChecked()) && (!checkBoxOverhead.isChecked())) {
            score++;
        }
    }

    public void checkQuestTwo() {
        RadioButton radioButtonRightAns = (RadioButton) findViewById(R.id.radio_button_right_bottom);
        if (radioButtonRightAns.isChecked()) {
            score++;
        }
    }

    public void checkQuestThree() {
        RadioButton radioButtonRightAns = (RadioButton) findViewById(R.id.radiobutton_no);
        if (radioButtonRightAns.isChecked()) {
            score++;
        }
    }

    public void checkQuestFour() {
        CheckBox checkBoxSchumacher = (CheckBox) findViewById(R.id.checkbox_schumacher);
        CheckBox checkBoxKarkowski = (CheckBox) findViewById(R.id.checkbox_karkowski);
        CheckBox checkBoxCoan = (CheckBox) findViewById(R.id.checkbox_coan);
        CheckBox checkBoxMalanichev = (CheckBox) findViewById(R.id.checkbox_malanichev);
        if ((checkBoxKarkowski.isChecked()) && (checkBoxCoan.isChecked()) && (checkBoxMalanichev.isChecked()) && (!checkBoxSchumacher.isChecked())) {
            score++;
        }

    }

    public void checkQuestFive() {
        EditText editText = (EditText) findViewById(R.id.edit_text_view);
        String ans = editText.getText().toString().toLowerCase();
        if (ans.contains("raw")) {
            score++;
            Log.v("MainActivity", "Value: " + score);
        }
    }


}
