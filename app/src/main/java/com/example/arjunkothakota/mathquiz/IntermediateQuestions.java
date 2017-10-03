package com.example.arjunkothakota.mathquiz;

/**
 * Created by Arjun Kothakota on 8/13/2017.
 */

public class IntermediateQuestions {

    public String mQuestions[]={
            "Solve for a : 27 > a + 24",
            "John put magazines on a bookshelf. They have either 48 or 52 pages. \n" +
                    "Which one of the following numbers cannot be the total number of pages of all the magazines on the bookshelf?",
            "What is the square root of 169",
            "Round -4.5 by round to the even method",
            "What is the square of 25",
            "",
            "",
            "",
            "",
            ""
    };

    private String mChoices[][]={
            {"51 > a", "51 < a", "3 > a", "a > 3"},
            {"516", "536", "524", "402"},
            {"13", "12", "14", "11"},
            {"-4", "-3.5", "-5", "-2"},
            {"700", "624", "625", "642"},
            {"Uranus", "Venus", "Mars", "Saturn"},
            {"Saturn", "Mercury", "Uranus", "Earth"},
            {"Neptune", "Earth", "Mars", "Venus"},
            {"", "", "", ""},
            {"", "", "", ""}
    };

    public int getLength(){
        return mQuestions.length;
    }

    private String mAnswers[]=
            {"3 > a", "524", "13", "-4", "625", "Saturn", "Uranus", "Neptune", "", ""};

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
