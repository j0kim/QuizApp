package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    double score = 0;
    int percentScore = 0;

    //These variables will handle correct answers
    private boolean result1, result2, result3, result4, result5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void answer1 (View v) {
        // Checking if the button is checked
        boolean checked = ((android.widget.RadioButton) v).isChecked();

        // Check which radio button was clicked
        switch (v.getId()) {

            case R.id.num1_answer1:
                if (checked)
                    break;
            case R.id.num1_answer2:
                if(checked)
                    break;
            case R.id.num1_answer3:
                if (checked){
                    result1 = true;
                }
                break;
            case R.id.num1_answer4:
                if (checked)
                    break;
        }

    }

    public void answer2 (View v) {
        // Checking if the button is checked

        boolean checked = ((android.widget.RadioButton) v).isChecked();


        // Check which radio button was clicked

        switch (v.getId()) {

            case R.id.num1_answer1:
                if (checked)
                    break;
            case R.id.num1_answer2:
                if (checked)
                    break;
            case R.id.num1_answer3:
                if (checked) {
                    result2 = true;
                }
                break;
            case R.id.num1_answer4:
                if (checked)
                    break;
        }
    }

    public void answer3 (View v) {
        // Checking if the button is checked
        boolean checked = ((android.widget.RadioButton) v).isChecked();

        // Check which radio button was clicked
        switch (v.getId()) {

            case R.id.num1_answer1:
                if (checked) {
                    result3 = true;
                }
                break;
            case R.id.num1_answer2:
                if (checked)
                    break;
            case R.id.num1_answer3:
                if (checked)
                    break;
            case R.id.num1_answer4:
                if (checked)
                    break;
        }

    }

    public void answer4 (View v) {
        // Checking if the button is checked
        boolean checked = ((android.widget.RadioButton) v).isChecked();

        // Check which radio button was clicked
        switch (v.getId()) {

            case R.id.num1_answer1:
                if (checked)
                    break;
            case R.id.num1_answer2:
                if(checked)
                    break;
            case R.id.num1_answer3:
                if (checked) {
                    result4 = true;
                }
                break;
            case R.id.num1_answer4:
                if (checked)
                    break;
        }
    }

    public void answer5 (View v) {
        // Checking if the button is checked
        boolean checked = ((android.widget.RadioButton) v).isChecked();

        // Check which radio button was clicked
        switch (v.getId()) {
            case R.id.num1_answer1:
                if (checked)
                    break;
            case R.id.num1_answer2:
                if(checked)
                    break;
            case R.id.num1_answer3:
                if (checked)
                    break;
            case R.id.num1_answer4:
                if (checked) {
                    result5 = true;
                }
                break;
        }
    }





    public void submitGrade(View v) {

        EditText userName = (EditText) findViewById(R.id.name_text_input);
        String name = userName.getText().toString();

        if (result1) {
            score += 1;
        }

        if (result2){
            score += 1;
        }

        if (result3) {
            score += 1;
        }

        if (result4) {
            score += 1;
        }
        if (result5) {
            score += 1;
        }

        percentScore = (int) (score /5 * 100);

        //Displays a toast message to the screen
        Toast.makeText(this, "Name: " + name + "\nScore: " + percentScore + "%", android.widget.Toast.LENGTH_SHORT).show();

    }
}
