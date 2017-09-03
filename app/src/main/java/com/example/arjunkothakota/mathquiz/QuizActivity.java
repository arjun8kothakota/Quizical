package com.example.arjunkothakota.mathquiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    private Button answer1Btn, answer2Btn, answer3Btn, answer4Btn;

    private TextView scoreTextView, questionTextView;

    private LinearLayout bgColor;

    private BeginnerQuestions beginnerQuestions = new BeginnerQuestions();
    private IntermediateQuestions intermediateQuestions = new IntermediateQuestions();
    private AdvancedQuestions advancedQuestions = new AdvancedQuestions();

    private String answer;
    private int beginnerScore = 0;
    private int intermediateScore = 0;
    private int advancedScore = 0;
    private int questionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        answer1Btn = (Button) findViewById(R.id.answer1Btn);
        answer2Btn = (Button) findViewById(R.id.answer2Btn);
        answer3Btn = (Button) findViewById(R.id.answer3Btn);
        answer4Btn = (Button) findViewById(R.id.answer4Btn);

        scoreTextView = (TextView) findViewById(R.id.scoreTextView);
        questionTextView = (TextView) findViewById(R.id.questionsTextView);

        final String levelTitle = getIntent().getStringExtra(HomeActivity.EXTRA_ITEM_TITLE);

        if (levelTitle.equalsIgnoreCase(HomeActivity.MATH_BEGINNER)){
            scoreTextView.setText("Score : "+ beginnerScore);
        }else if (levelTitle.equalsIgnoreCase(HomeActivity.MATH_INTERMEDIATE)){
            scoreTextView.setText("Score : "+ intermediateScore);
        }else if (levelTitle.equalsIgnoreCase(HomeActivity.MATH_ADVANCED)){
            scoreTextView.setText("Score : "+ advancedScore);
        }

        updateQuestion();

        answer1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer1Btn.getText() == answer){
                    if (levelTitle.equalsIgnoreCase(HomeActivity.MATH_BEGINNER)){
                        beginnerScore += 5;
                        scoreTextView.setText("Score : " + beginnerScore);
                        updateQuestion();
                        Toast.makeText(getApplicationContext(), "You've got the right Answer!", Toast.LENGTH_SHORT).show();
                     }else if (levelTitle.equalsIgnoreCase(HomeActivity.MATH_INTERMEDIATE)){
                            intermediateScore += 5;
                            scoreTextView.setText("Score : " + intermediateScore);
                            updateQuestion();
                            Toast.makeText(getApplicationContext(), "You've got the right Answer!", Toast.LENGTH_SHORT).show();
                    }else if (levelTitle.equalsIgnoreCase(HomeActivity.MATH_ADVANCED)){
                        advancedScore += 5;
                        scoreTextView.setText("Score : " + advancedScore);
                        updateQuestion();
                        Toast.makeText(getApplicationContext(), "You've got the right Answer!", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    gameOver();
                }
            }
        });

        answer2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer2Btn.getText() == answer){
                    if (levelTitle.equalsIgnoreCase(HomeActivity.MATH_BEGINNER)){
                        beginnerScore += 5;
                        scoreTextView.setText("Score : " + beginnerScore);
                        updateQuestion();
                        Toast.makeText(getApplicationContext(), "You've got the right Answer!", Toast.LENGTH_SHORT).show();
                    }else if (levelTitle.equalsIgnoreCase(HomeActivity.MATH_INTERMEDIATE)){
                        intermediateScore += 5;
                        scoreTextView.setText("Score : " + intermediateScore);
                        updateQuestion();
                        Toast.makeText(getApplicationContext(), "You've got the right Answer!", Toast.LENGTH_SHORT).show();
                    }else if (levelTitle.equalsIgnoreCase(HomeActivity.MATH_ADVANCED)){
                        advancedScore += 5;
                        scoreTextView.setText("Score : " + advancedScore);
                        updateQuestion();
                        Toast.makeText(getApplicationContext(), "You've got the right Answer!", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    gameOver();
                }
            }
        });

        answer3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer3Btn.getText() == answer){
                    if (levelTitle.equalsIgnoreCase(HomeActivity.MATH_BEGINNER)){
                        beginnerScore += 5;
                        scoreTextView.setText("Score : " + beginnerScore);
                        updateQuestion();
                        Toast.makeText(getApplicationContext(), "You've got the right Answer!", Toast.LENGTH_SHORT).show();
                    }else if (levelTitle.equalsIgnoreCase(HomeActivity.MATH_INTERMEDIATE)){
                        intermediateScore += 5;
                        scoreTextView.setText("Score : " + intermediateScore);
                        updateQuestion();
                        Toast.makeText(getApplicationContext(), "You've got the right Answer!", Toast.LENGTH_SHORT).show();
                    }else if (levelTitle.equalsIgnoreCase(HomeActivity.MATH_ADVANCED)){
                        advancedScore += 5;
                        scoreTextView.setText("Score : " + advancedScore);
                        updateQuestion();
                        Toast.makeText(getApplicationContext(), "You've got the right Answer!", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    gameOver();
                }
            }
        });

        answer4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer4Btn.getText() == answer){
                    if (levelTitle.equalsIgnoreCase(HomeActivity.MATH_BEGINNER)){
                        beginnerScore += 5;
                        scoreTextView.setText("Score : " + beginnerScore);
                        updateQuestion();
                        Toast.makeText(getApplicationContext(), "You've got the right Answer!", Toast.LENGTH_SHORT).show();
                    }else if (levelTitle.equalsIgnoreCase(HomeActivity.MATH_INTERMEDIATE)){
                        intermediateScore += 5;
                        scoreTextView.setText("Score : " + intermediateScore);
                        updateQuestion();
                        Toast.makeText(getApplicationContext(), "You've got the right Answer!", Toast.LENGTH_SHORT).show();
                    }else if (levelTitle.equalsIgnoreCase(HomeActivity.MATH_ADVANCED)){
                        advancedScore += 5;
                        scoreTextView.setText("Score : " + advancedScore);
                        updateQuestion();
                        Toast.makeText(getApplicationContext(), "You've got the right Answer!", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    gameOver();
                }
            }
        });
    }

    private void updateQuestion(){

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linearLayout);

        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);

        String levelTitle = getIntent().getStringExtra(HomeActivity.EXTRA_ITEM_TITLE);

        if (levelTitle.equalsIgnoreCase(HomeActivity.MATH_BEGINNER)){


            linearLayout.setBackgroundColor(Color.parseColor("#58D68D"));
            constraintLayout.setBackgroundResource(R.drawable.greenbg);

            if (questionNumber < beginnerQuestions.getLength()){
                questionTextView.setText(beginnerQuestions.getQuestion(questionNumber));
                answer1Btn.setText(beginnerQuestions.getChoice1(questionNumber));
                answer2Btn.setText(beginnerQuestions.getChoice2(questionNumber));
                answer3Btn.setText(beginnerQuestions.getChoice3(questionNumber));
                answer4Btn.setText(beginnerQuestions.getChoice4(questionNumber));

                answer = beginnerQuestions.getAnswer(questionNumber);

                questionNumber++;


            }else {

                Intent intent = new Intent(QuizActivity.this, ScoreActivity.class);
                intent.putExtra("beginner score", beginnerScore);
                intent.putExtra(HomeActivity.EXTRA_ITEM_TITLE, levelTitle);
                startActivity(intent);
            }
        }else if (levelTitle.equalsIgnoreCase(HomeActivity.MATH_INTERMEDIATE)){

            constraintLayout.setBackgroundResource(R.drawable.bluebg);
            linearLayout.setBackgroundColor(Color.parseColor("#3498DB"));

            if (questionNumber < intermediateQuestions.getLength()){
                questionTextView.setText(intermediateQuestions.getQuestion(questionNumber));
                answer1Btn.setText(intermediateQuestions.getChoice1(questionNumber));
                answer2Btn.setText(intermediateQuestions.getChoice2(questionNumber));
                answer3Btn.setText(intermediateQuestions.getChoice3(questionNumber));
                answer4Btn.setText(intermediateQuestions.getChoice4(questionNumber));

                answer = intermediateQuestions.getAnswer(questionNumber);

                questionNumber++;
            }else{
                Intent intent = new Intent(QuizActivity.this, ScoreActivity.class);
                intent.putExtra("intermediate score", intermediateScore);
                intent.putExtra(HomeActivity.EXTRA_ITEM_TITLE, levelTitle);
                startActivity(intent);
            }
        }else if (levelTitle.equalsIgnoreCase(HomeActivity.MATH_ADVANCED)){

            constraintLayout.setBackgroundResource(R.drawable.redbg);
            linearLayout.setBackgroundColor(Color.parseColor("#EC7063"));

            if (questionNumber < advancedQuestions.getLength()){
                questionTextView.setText(advancedQuestions.getQuestion(questionNumber));
                answer1Btn.setText(advancedQuestions.getChoice1(questionNumber));
                answer2Btn.setText(advancedQuestions.getChoice2(questionNumber));
                answer3Btn.setText(advancedQuestions.getChoice3(questionNumber));
                answer4Btn.setText(advancedQuestions.getChoice4(questionNumber));

                answer = advancedQuestions.getAnswer(questionNumber);

                questionNumber++;
            }else{
                Intent intent = new Intent(QuizActivity.this, ScoreActivity.class);
                intent.putExtra("advanced score", advancedScore);
                intent.putExtra(HomeActivity.EXTRA_ITEM_TITLE, levelTitle);
                startActivity(intent);
            }
        }
    }

    private void gameOver(){
        final String levelTitle = getIntent().getStringExtra(HomeActivity.EXTRA_ITEM_TITLE);

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(QuizActivity.this);
        alertDialogBuilder
                .setMessage("Wrong Answer! Game Over")
                .setCancelable(false)
                .setPositiveButton("Check Score", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(QuizActivity.this, ScoreActivity.class);
                                if (levelTitle.equalsIgnoreCase(HomeActivity.MATH_BEGINNER)){
                                    intent.putExtra("beginner score", beginnerScore);
                                }else if (levelTitle.equalsIgnoreCase(HomeActivity.MATH_INTERMEDIATE)){
                                    intent.putExtra("intermediate score", intermediateScore);
                                }else if (levelTitle.equalsIgnoreCase(HomeActivity.MATH_ADVANCED)){
                                    intent.putExtra("advanced score", advancedScore);
                                }
                                intent.putExtra(HomeActivity.EXTRA_ITEM_TITLE, levelTitle);
                                startActivity(intent);
                            }
                        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
