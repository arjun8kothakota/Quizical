package com.example.arjunkothakota.mathquiz;

/**
 * Created by Arjun Kothakota on 8/13/2017.
 */

public class IntermediateQuestions {

    public String mQuestions[]={
            "What is my name?",
            "What is the second planet in the solar system?",
            "What is the third planet in the solar system?",
            "What is the fourth planet in the solar system?",
            "What is the fifth planet in the solar system?",
            "What is the sixth planet in the solar system?",
            "What is the seventh planet in the solar system?",
            "What is the eighth planet in the solar system?"
    };

    private String mChoices[][]={
            {"Mercury", "Venus", "Mars", "Saturn"},
            {"Jupiter", "Venus", "Earth", "Neptune"},
            {"Earth", "Jupiter", "Pluto", "Venus"},
            {"Jupiter", "Saturn", "Mars", "Earth"},
            {"Jupiter", "Pluto", "Mercury", "Earth"},
            {"Uranus", "Venus", "Mars", "Saturn"},
            {"Saturn", "Mercury", "Uranus", "Earth"},
            {"Neptune", "Earth", "Mars", "Venus"},
    };

    public int getLength(){
        return mQuestions.length;
    }

    private String mAnswers[]=
            {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

    public String getQuestion(int q){
        String question= mQuestions[q];
        return question;
    }

    public String getChoice1(int c){
        String choice = mChoices[c][0];
        return choice;
    }

    public String getChoice2(int c){
        String choice = mChoices[c][1];
        return choice;
    }

    public String getChoice3(int c){
        String choice = mChoices[c][2];
        return choice;
    }

    public String getChoice4(int c){
        String choice = mChoices[c][3];
        return choice;
    }

    public String getAnswer(int a){
        String answer = mAnswers[a];
        return answer;
    }

}
