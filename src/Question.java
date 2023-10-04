public class Question {
    //variables for questions and the true question
    private static String questionText="Sample Question";
    private static String trueAnswer="Sample Answer";
    private static String[] wrongAnswers= new String[4];

    //Method to get the question string
    static String getQuestion(){
        return questionText;
    }

    //Method to get the answer string
    static String getTrueAnswer(){
        return trueAnswer;
    }

    static String[] getWrongAnswers(){
        return wrongAnswers;
    }

    //Method for setting question text
    //@param desiredQuestion
    void setQuestion(String desiredQuestion){
        questionText=desiredQuestion;
    }

    //Method for setting answer text
    //@param desiredAnswer
    void setTrueAnswer(String desiredAnswer){
        trueAnswer=desiredAnswer;
    }

    //Method for setting the wrong answers
    /* @param answer1
     * @param answer2
     * @param answer3
     */
    void setWrongAnswers(String answer1, String answer2, String answer3){
        wrongAnswers[1]=answer1;
        wrongAnswers[2]=answer2;
        wrongAnswers[3]=answer3;
    }


}
