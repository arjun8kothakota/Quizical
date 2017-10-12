package com.example.arjunkothakota.mathquiz;

/**
 * Created by Arjun Kothakota on 8/13/2017.
 */

public class AdvancedQuestions {

    public String mQuestions[]={
            "Any number that is a root of a non-zero polynomial with rational coefficients is called:",
            "Given that tan 52.7° = 1.3127, what is the value of tan 127.3°?",
            "Diana, Ed, and Fiona all shopped in the same store." +
                    "\n" +
                    "Diana bought 2 apples, 3 bananas, and 1 coconut, and paid a total of $4.50.\n" +
                    "Ed bought 1 apple, 4 bananas, and 2 coconuts, and paid a total of $6.70.\n" +
                    "Fiona bought 3 apples, 1 banana, and 3 coconuts, and paid a total of $8.80.\n" +
                    "\n" +
                    "What was the cost of 1 coconut in this store?\n",
            "The sum of two natural numbers is equal to 77. \n" +
                    "If the first number is multiplied by 8 and the second by 6, then those products are equal. \n" +
                    "Which is the larger of these numbers?",
            "Two numbers are in the ratio 3:5. If 9 is subtracted from each of them, then their ratio becomes 12:23. Find the smaller number.",
            "If two diameters of a circle lie on the lines x − y = 3 and x + 2y = 6, what are the coordinates of the center of the circle?",
            "It is estimated that there are 828 motor vehicles in the US for every 1,000 people.\n" +
                    "If the number of motor vehicles in the US is 260 million, then what is its population to the nearest million?",
            "Quentin is 4 times as old as Rose and the difference between their ages is greater than or equal to 15 years.\n" +
                    "Which of the following inequalities could be used to find the ages of both Quentin and Rose?",
            "Two variables x and y if involved in linear equation then equation is",
            "Express 0.181818... as a fraction.",
            "What is (-∞, 0] ∩ [0, +∞)?",
            ""
    };

    private String mChoices[][]={
            {"Rational", "Irrational", "Algebraic", "Transcendental"},
            {"-1.3127", "-0.3127", "0.3127", "1.3127"},
            {"$2.00", " $2.10", "$2.20", "$2.30"},
            {"23", "33", "43", "44"},
            {"27", "33", "49", "55"},
            {"(0, 0)", "(2, 2)", "(1, -1)", "(4, 1)"},
            {"215 million", "314 million", "315 million", "475 million "},
            {"(r + 4) − r ≥ 15", "4r ≥ 15 − r", "4r − r ≤ 15", "4r − r ≥ 15"},
            {"ax+by = c", "ab+xy = c", "ac+bx = y", "ax+bc = y"},
            {"9 / 50", "1 / 5", "19 / 100", "2 / 11"},
            {"∅", "{0}", "R − {0}", "R"},
            {"", "", "", ""}
    };

    public int getLength(){
        return mQuestions.length;
    }

    private String mAnswers[]=
            {"Algebraic", "-1.3127", "$2.30", "44", "33", "(4, 1)", "314 million", "4r − r ≥ 15", "ax+by = c", "2 / 11", "{0}", ""};

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
