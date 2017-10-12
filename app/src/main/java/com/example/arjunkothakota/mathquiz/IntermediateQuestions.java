package com.example.arjunkothakota.mathquiz;

/**
 * Created by Arjun Kothakota on 8/13/2017.
 */

public class IntermediateQuestions {

    public String mQuestions[]={
            "Solve for a : 27 > a + 24.",
            "John put magazines on a bookshelf. They have either 48 or 52 pages. \n" +
                    "Which one of the following numbers cannot be the total number of pages of all the magazines on the bookshelf?",
            "What is the square root of 169?",
            "Round -4.5 by round to the even method.",
            "What is the square of 25?",
            "Solve simultaneous equations 13x - 6y = 20, 7x + 4y = 18",
            "In linear equation 'ax+by = c' a,b and c are considered as",
            "A book was sold for Rs 27.50 with a profit of 10%. If it were sold for Rs. 25.75, then would have been percentage of profit and loss ?",
            "A person incurs a loss of 5% be selling a watch for 1140 bucks. At what price should the watch be sold to earn 5% profit.",
            "If Rs. 782 is divided into three parts, proportional to \n" +
                    "\n" +
                    "  1 / 2 : 2 / 3 : 3 / 4 " + "\n" +
                    "find the first part.",
            "If 2x + 3y = 31, y - z = 4 and x + 2z = 11, then what is the value of x + y + z?",
            "The high temperatures for the last 5 days in January were 31°C, 32°C, 29°C, 26°C and\n" +
                    "32°C. The median of these temperatures are:"
    };

    private String mChoices[][]={
            {"51 > a", "51 < a", "3 > a", "a > 3"},
            {"516", "536", "524", "402"},
            {"13", "12", "14", "11"},
            {"-4", "-3.5", "-5", "-2"},
            {"700", "624", "625", "642"},
            {"x = 2, y = 1", "x = 4, y = 8", "x = 6, y = 1", "x = 2, y = 4"},
            {"variable", "constants", "zero", "real numbers"},
            {"2% Profit", "3% Profit", "2% Loss", "3% Loss"},
            {"1200", "1230", "1260", "1290"},
            {"190", "204", "220", "230"},
            {"12", "13", "15", "16"},
            {"30°C", "32°C", "26°C", "31°C"}
    };

    public int getLength(){
        return mQuestions.length;
    }

    private String mAnswers[]=
            {"3 > a", "524", "13", "-4", "625", "x = 2, y = 1", "constants", "3% Profit", "1260", "204", "15", "31°C"};

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
