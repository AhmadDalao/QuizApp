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

    /**
     * check answer for question one
     *
     * @param checkbox1 taking the checkbox boolean variable passed  from the user
     * @param checkbox2 taking the checkbox boolean variable passed  from the user
     * @param checkbox3 taking the checkbox boolean variable passed  from the user
     * @return the score if the user got the right answer , usually story it in int variable to pass it to displayScore method
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


    /**
     * check answer for question two
     *
     * @param checkbox1 taking the checkbox boolean variable passed  from the user
     * @param checkbox2 taking the checkbox boolean variable passed  from the user
     * @param checkbox3 taking the checkbox boolean variable passed  from the user
     * @return the score if the user got the right answer , usually story it in int variable to pass it to displayScore method
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

    /**
     * check answer for question three
     *
     * @param radio1 taking the radio boolean variable passed  from the user
     * @param radio2 taking the radio boolean variable passed  from the user
     * @param radio3 taking the radio boolean variable passed  from the user
     * @return the score if the user got the right answer , usually story it in int variable to pass it to displayScore method
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

    /**
     * check answer for question four ,
     * it will compare the text from user with the correct text and increase the score
     * if the user guessed the right answer.
     *
     * @param guess taking the answer from the user as a string variable passed to it from the user
     * @return the score if the user got the right answer , usually story it in int variable to pass it to displayScore method
     */

    public int checkAnswerQuestionFour(String guess) {
        int score = 0;
        if (guess.equals("baka") || guess.equals("Baka") || guess.equals("BAKA")) {
            score = score + 1;
        } else score = score + 0;

        return score;
    }

    /**
     * check answer for question five ,
     * it will compare the text from user with the correct text and increase the score
     * if the user guessed the right answer.
     *
     * @param guess2 taking the answer from the user as a string variable passed to it from the user
     * @return the score if the user got the right answer , usually story it in int variable to pass it to displayScore method
     */

    public int checkAnswerQuestionFive(String guess2) {
        int score = 0;
        if (guess2.equals("pie") || guess2.equals("Pie") || guess2.equals("PIE")) {
            score = score + 1;
        } else score = score + 0;
        return score;
    }

    /**
     * this method will calculate and display the score when called
     *
     * @param number  is the variable passed from question one contains the score if the answer was correct it will contain 1
     * @param number2 is the variable passed from question two contains the score if the answer was correct it will contain 1
     * @param number3 is the variable passed from question three contains the score if the answer was correct it will contain 1
     * @param number4 is the variable passed from question four contains the score if the answer was correct it will contain 1
     * @param number5 is the variable passed from question five contains the score if the answer was correct it will contain 1
     */

    public void displayScore(int number, int number2, int number3, int number4, int number5) {
        TextView score = findViewById(R.id.Score);
        int TheScore = number + number2 + number3 + number4 + number5;

        if (TheScore == 5) {
            score.setVisibility(View.VISIBLE);
            score.setText(String.valueOf("Well Done !! \n" + "You got " + TheScore + " out of 5"));
        } else if (TheScore == 4) {
            score.setVisibility(View.VISIBLE);
            score.setText(String.valueOf("Great job !!\n" + "You got " + TheScore + " out of 5"));
        } else if (TheScore == 3) {
            score.setVisibility(View.VISIBLE);
            score.setText(String.valueOf("Good !!\n" + "You got " + TheScore + " out of 5"));
        } else if (TheScore == 2) {
            score.setVisibility(View.VISIBLE);
            score.setText(String.valueOf("That's bad !! try again\n" + "You got " + TheScore + " out of 5"));
        } else if (TheScore == 1) {
            score.setVisibility(View.VISIBLE);
            score.setText(String.valueOf("So bad!! read some books\n" + "you got " + TheScore + " out of 5"));
        } else
            score.setVisibility(View.VISIBLE);
        score.setText(String.valueOf("Are you even trying ??\n" + "you got " + TheScore + " out of 5"));
    }


    /*
    this method should takes action when the button check answers is clicked on

    it handles taking objects from the widgets and store them in variables then pass them into methods

    it is also responsible for calling the method displayScore() which will handle calculating the score and displaying it on screen

     */

    public void CheckCorrectAnswer(View view) {

         /*
        handle question 1
         */

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
        handle question 5
         */

        EditText editText2 = (EditText) findViewById(R.id.myEditTwo);
        String guessAnswer2 = editText2.getText().toString();

        int question5Score = checkAnswerQuestionFive(guessAnswer2);

        displayScore(question1Score, question2Score, question3Score, question4Score, question5Score);


    }
} // end of main activity
