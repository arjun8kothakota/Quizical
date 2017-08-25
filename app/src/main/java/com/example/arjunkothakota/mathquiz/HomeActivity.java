package com.example.arjunkothakota.mathquiz;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;


public class HomeActivity extends AppCompatActivity {

    RelativeLayout beginnerBtn, intermediateBtn, advancedBtn;

    public static final String EXTRA_ITEM_TITLE = "extra.item.title";
    public static final String MATH_BEGINNER = "Beginner";
    public static final String MATH_INTERMEDIATE = "Intermediate";
    public static final String MATH_ADVANCED = "Advanced";

    ImageView calculatorImageView, lessthanImageView, squareRootImageView, equalsImageView, piImageView, triangleImageView, sigmaImageView, ratioImageView, xImageView, sineImageView, tangentImageView, curveImageView;

    ProgressBar beginnerBar, intermediateBar, advancedBar;

    private BeginnerQuestions beginnerQuestions = new BeginnerQuestions();
    private IntermediateQuestions intermediateQuestions = new IntermediateQuestions();
    private AdvancedQuestions advancedQuestions = new AdvancedQuestions();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        beginnerBtn = (RelativeLayout) findViewById(R.id.beginnerBtn);
        intermediateBtn = (RelativeLayout) findViewById(R.id.intermediateBtn);
        advancedBtn = (RelativeLayout) findViewById(R.id.advancedBtn);

        calculatorImageView = (ImageView) findViewById(R.id.imageView2);
        lessthanImageView = (ImageView) findViewById(R.id.imageView);
        squareRootImageView = (ImageView) findViewById(R.id.imageView3);
        equalsImageView = (ImageView) findViewById(R.id.imageView4);
        piImageView = (ImageView) findViewById(R.id.imageView7);
        sigmaImageView = (ImageView) findViewById(R.id.imageView6);
        ratioImageView = (ImageView) findViewById(R.id.imageView8);
        triangleImageView = (ImageView) findViewById(R.id.imageView5);
        tangentImageView = (ImageView) findViewById(R.id.imageView9);
        sineImageView = (ImageView) findViewById(R.id.imageView10);
        xImageView = (ImageView) findViewById(R.id.imageView11);
        curveImageView = (ImageView) findViewById(R.id.imageView12);

        calculatorImageView.setColorFilter(Color.parseColor("#ffffff"));
        lessthanImageView.setColorFilter(Color.parseColor("#ffffff"));
        squareRootImageView.setColorFilter(Color.parseColor("#ffffff"));
        equalsImageView.setColorFilter(Color.parseColor("#ffffff"));
        piImageView.setColorFilter(Color.parseColor("#ffffff"));
        sigmaImageView.setColorFilter(Color.parseColor("#ffffff"));
        ratioImageView.setColorFilter(Color.parseColor("#ffffff"));
        triangleImageView.setColorFilter(Color.parseColor("#ffffff"));
        tangentImageView.setColorFilter(Color.parseColor("#ec7063"));
        sineImageView.setColorFilter(Color.parseColor("#ffffff"));
        xImageView.setColorFilter(Color.parseColor("#ffffff"));
        curveImageView.setColorFilter(Color.parseColor("#ffffff"));

        beginnerBar = (ProgressBar)findViewById(R.id.determinateBarBeginner);
        SharedPreferences beginnerSharedPreferences = getSharedPreferences("Scores", MODE_PRIVATE);
        int beginnerHighScore = beginnerSharedPreferences.getInt("beginner HighScore", 0);
        Log.d("progress", beginnerHighScore/40d + " " + beginnerHighScore);
        beginnerBar.setProgress((int) ((beginnerHighScore/40d)*100));

        intermediateBar = (ProgressBar)findViewById(R.id.determinateBarIntermediate);
        SharedPreferences intermediateSharedPreferences = getSharedPreferences("Scores", MODE_PRIVATE);
        int intermediateHighScore = intermediateSharedPreferences.getInt("intermediate HighScore", 0);
        Log.d("progress", intermediateHighScore/40d + " " + intermediateHighScore);
        intermediateBar.setProgress((int) ((intermediateHighScore/40d)*100));

        advancedBar = (ProgressBar)findViewById(R.id.determinateBarAdvanced);
        SharedPreferences advancedSharedPreferences = getSharedPreferences("Scores", MODE_PRIVATE);
        int advancedHighScore = advancedSharedPreferences.getInt("advanced HighScore", 0);
        Log.d("progress", advancedHighScore/40d + " " + advancedHighScore);
        advancedBar.setProgress((int) ((advancedHighScore/40d)*100));





        beginnerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadQuizActivity(HomeActivity.MATH_BEGINNER);
            }
        });

        intermediateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadQuizActivity(HomeActivity.MATH_INTERMEDIATE);
            }
        });

        advancedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadQuizActivity(HomeActivity.MATH_ADVANCED);
            }
        });

    }

    private void loadQuizActivity(String levelTitle){
        Intent intent = new Intent(HomeActivity.this, QuizActivity.class);
        intent.putExtra(HomeActivity.EXTRA_ITEM_TITLE, levelTitle);
        startActivity(intent);
    }
}
