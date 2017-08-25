package com.example.arjunkothakota.mathquiz;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        final TextView highestScoreTxt = (TextView) findViewById(R.id.highestScoreTextView);
        TextView scoreTxt = (TextView) findViewById(R.id.yourScoretextView);
        Button clearBtn = (Button) findViewById(R.id.clearBtn);
        Button goHomeButton = (Button) findViewById(R.id.homeBtn);

        final Intent intent = getIntent();
        final int beginnerScore = intent.getIntExtra("beginner score", 0);
        final int intermediateScore = intent.getIntExtra("intermediate score", 0);
        final int advancedScore = intent.getIntExtra("advanced score", 0);
        final String levelTitle = intent.getStringExtra(HomeActivity.EXTRA_ITEM_TITLE);

        scoreTxt.setText("Your score : " + beginnerScore);
        scoreTxt.setText("Your score : " + intermediateScore);
        scoreTxt.setText("Your score : " + advancedScore);

        SharedPreferences sharedPreferences = getSharedPreferences("Scores", MODE_PRIVATE);
        final int beginnerHighScore = sharedPreferences.getInt("beginner HighScore", 0);

        final int intermediateHighScore = sharedPreferences.getInt("intermediate HighScore", 0);

        final int advancedHighScore = sharedPreferences.getInt("advanced HighScore", 0);

        if (levelTitle.equalsIgnoreCase(HomeActivity.MATH_BEGINNER)){

            if (beginnerHighScore >= beginnerScore){
                highestScoreTxt.setText("High Score : "+beginnerHighScore);
                scoreTxt.setText("Your score : " + beginnerScore);
            }else {
                highestScoreTxt.setText("New HighScore : " + beginnerScore + "!");
                scoreTxt.setText("Your score : " + beginnerScore);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt("beginner HighScore", beginnerScore);
                editor.commit();
            }
        }else if (levelTitle.equalsIgnoreCase(HomeActivity.MATH_INTERMEDIATE)){

            if (intermediateHighScore >= intermediateScore){
                highestScoreTxt.setText("HighScore : " + intermediateHighScore);
                scoreTxt.setText("Your score : " + intermediateScore);
            }else {
                highestScoreTxt.setText("New HighScore : " + intermediateScore+ "!");
                scoreTxt.setText("Your score : " + intermediateScore);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt("intermediate HighScore", intermediateScore);
                editor.commit();
            }
        }else if (levelTitle.equalsIgnoreCase(HomeActivity.MATH_ADVANCED)){

            if (advancedHighScore>=advancedScore){
                highestScoreTxt.setText("HighScore : " + advancedHighScore);
                scoreTxt.setText("Your score : " + advancedScore);
            }else {
                highestScoreTxt.setText("New HighScore : " + advancedScore + "!");
                scoreTxt.setText("Your score : " + advancedScore);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt("advanced HighScore", advancedScore);
                editor.commit();
            }

        }

        goHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(ScoreActivity.this, HomeActivity.class);
                if (levelTitle.equalsIgnoreCase(HomeActivity.MATH_BEGINNER)){
                    homeIntent.putExtra("beginner highscore", highestScoreTxt.getText().toString());
                }else if (levelTitle.equalsIgnoreCase(HomeActivity.MATH_INTERMEDIATE)){
                    homeIntent.putExtra("intermediate highscore", highestScoreTxt.getText().toString());
                }else if (levelTitle.equalsIgnoreCase(HomeActivity.MATH_ADVANCED)) {
                    homeIntent.putExtra("advanced highscore", highestScoreTxt.getText().toString());
                }
                startActivity(homeIntent);
            }
        });

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (levelTitle.equalsIgnoreCase(HomeActivity.MATH_BEGINNER)){
                    SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
                    final int beginnerHighScore = 0;
                    highestScoreTxt.setText("HighScore : " + 0);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putInt("beginner HighScore", beginnerHighScore);
                    editor.commit();

                }else if (levelTitle.equalsIgnoreCase(HomeActivity.MATH_INTERMEDIATE)){
                    SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
                    final int intermediateHighScore = 0;
                    highestScoreTxt.setText("HighScore : " + 0);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putInt("intermediate HighScore", intermediateHighScore);
                    editor.commit();

                }else if (levelTitle.equalsIgnoreCase(HomeActivity.MATH_ADVANCED)){
                    SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
                    final int advancedHighScore = 0;
                    highestScoreTxt.setText("HighScore : " + 0);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putInt("advanced HighScore", advancedHighScore);
                    editor.commit();
                }
            }
        });

    }
}
