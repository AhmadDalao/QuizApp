package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.text.MessageFormat;

public class MainActivity extends AppCompatActivity {


    int score= 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public int checkAnswerQuestionOne(boolean checkbox1 , boolean checkbox2 , boolean checkbox3){

        if (checkbox1){
            score = score +1;
        } else if (checkbox2 || checkbox3){
            score = score + 0 ;
        }

            return  score;
    }

 /*
 this method will display the score if the question been answered correctly
  */

    public void displayScore(int number) {
        TextView score = findViewById(R.id.Score);
        score.setText(String.valueOf(number));
    }

    /*
    this method should check for the answer
     */
    public void CheckCorrectAnswer(View view) {

        CheckBox checkbox1_question1 = findViewById(R.id.checkbox1_question1);
        boolean question_checkbox1 = checkbox1_question1.isChecked();

        CheckBox checkbox2_question1 = findViewById(R.id.checkbox2_question1);
        boolean question_checkbox2 = checkbox2_question1.isChecked();

        CheckBox checkbox3_question1 = findViewById(R.id.checkbox3_question1);
        boolean question_checkbox3 = checkbox3_question1.isChecked();

     int score = checkAnswerQuestionOne(question_checkbox1 , question_checkbox2 , question_checkbox3);

    displayScore(score);


    }



}
