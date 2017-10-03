package com.example.arjunkothakota.mathquiz;

/**
 * Created by Arjun Kothakota on 8/11/2017.
 */

public class BeginnerQuestions {
    public String mQuestions[]={
            "What is the result when you add 4.87 and 9.42?",
            "Which one of the following is different?",
            "How many minutes is 28 hours 40 min?",
            "Which unit would most likely be used to measure the height of Mount Everest?",
            "How many yards is one mile?",
            "What percent is 24 out of 30",
            "What is the the range of the following numbers :" +
                    "1, 5, 2, 4, 5, 3, 7, 5, 6, 4",
            "Jack won 45 out of 50 matches. What is his loss percentage?",
            "A dice is thrown once. What is the probability that the score is less than three?",
            "8 is subtracted from a number x and is then multiplied by 9. If the result is 27 which one of the following is the equation?"
    };

    private String mChoices[][]={
            {"14.87", "14.29", "13.80", "14.65"},
            {"12 x 3", "2 x 18", "5 x 7", "3 x 12"},
            {"1625", "1720", "2180", "1789"},
            {"Metres", "Kilometres", "Centimetres", "Millimetres"},
            {"2840 yards", "17600 yards", "1462 yards", "1760 yards"},
            {"84%", "72%", "89%", "80%"},
            {"7", "6", "8", "4"},
            {"10%", "20%", "30%", "25%"},
            {"1/2", "2/3", "1/3", "4/5"},
            {"8(x-9)=27", "9(x-8)=27", "x(9-8)=27", "9(8-x)=27"}
    };

    public int getLength(){
        return mQuestions.length;
    }

    private String mAnswers[]=
            {"14.29", "5 x 7", "1720", "Metres", "1760 yards", "80%", "6", "10%", "1/3", "9(x-8)=27"};

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
