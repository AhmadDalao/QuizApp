package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.MessageFormat;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    check answer for question one
     */
    public int checkAnswerQuestionOne(boolean checkbox1, boolean checkbox2, boolean checkbox3) {
        int score = 0;
        if (checkbox1) {
            score = score + 1;
        } else if (checkbox2 || checkbox3) {
            score = score + 0;
        }
        return score;
    }


    /*
    check answer for question two
     */


    public int checkAnswerQuestionTwo(boolean checkbox1, boolean checkbox2, boolean checkbox3) {
        int score = 0;
        if (checkbox1 || checkbox3) {
            score = score + 0;
        } else if (checkbox2) {
            score = score + 1;
        }
        return score;
    }

    /*
    check answer for question three
     */

    public int checkAnswerQuestionThree(boolean radio1, boolean radio2, boolean radio3) {
        int score = 0;
        if (radio1) {
            score = score + 1;
        } else if (radio2 || radio3) {
            score = score + 0;
        }
        return score;
    }

    /*
    check answer for question four
     */

    public int checkAnswerQuestionFour(String guess) {
        int score = 0;
        if (guess.equals("baka")) {
            score = score + 1;
        } else score = score + 0;

        return score;
    }

 /*
    check answer for question five
     */

   public int checkAnswerQuestionFive(String guess2){
        int score = 0;

        // find a way to fix it , it should be correct if the user inters Pie !!

        if(guess2.equals("pie")){
            score = score +1;
        }else score = score+0;
        return score;
   }


 /*
 this method will display the score if the question been answered correctly
  */

    public void displayScore(int number, int number2, int number3, int number4 , int number5) {
        TextView score = findViewById(R.id.Score);
        score.setText(String.valueOf(number + number2 + number3 + number4 + number5));
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

        int question1Score = checkAnswerQuestionOne(question_checkbox1, question_checkbox2, question_checkbox3);


/*
handle question 2
 */
        CheckBox checkbox1_question2 = findViewById(R.id.checkbox1_question2);
        boolean question2_checkbox1 = checkbox1_question2.isChecked();

        CheckBox checkbox2_question2 = findViewById(R.id.checkbox2_question2);
        boolean question2_checkbox2 = checkbox2_question2.isChecked();

        CheckBox checkbox3_question2 = findViewById(R.id.checkbox3_question2);
        boolean question2_checkbox3 = checkbox3_question2.isChecked();

        int question2Score = checkAnswerQuestionTwo(question2_checkbox1, question2_checkbox2, question2_checkbox3);


        /*
        handle question 3
         */


        RadioButton radioButton_question3 = findViewById(R.id.question3_radio_button);
        boolean question3_radioButton1 = radioButton_question3.isChecked();

        RadioButton radioButton2_question3 = findViewById(R.id.question3_radio_button2);
        boolean question3_radioButton2 = radioButton2_question3.isChecked();

        RadioButton radioButton3_question3 = findViewById(R.id.question3_radio_button3);
        boolean question3_radioButton3 = radioButton3_question3.isChecked();

        int question3Score = checkAnswerQuestionThree(question3_radioButton1, question3_radioButton2, question3_radioButton3);

        /*
        handle question 4
         */

        EditText editText = (EditText) findViewById(R.id.myEdit);
        String guessAnswer = editText.getText().toString();

        int question4Score = checkAnswerQuestionFour(guessAnswer);


        /*
        handle question 4
         */
        EditText editText2 = (EditText) findViewById(R.id.myEditTwo);
        String guessAnswer2 = editText2.getText().toString();

        int question5Score = checkAnswerQuestionFive(guessAnswer2);



        displayScore(question1Score, question2Score, question3Score, question4Score , question5Score);


    }
} // end of main activity
