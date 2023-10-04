public class Question {
    //variables for questions and the true question
    private static String questionText="Sample Question";
    private static String questionAnswer="Sample Answer";

    //Method to get the question string
    static String getQuestion(){
        return questionText;
    }

    //Method to get the answer string
    static String getAnswer(){
        return questionAnswer;
    }

    //Method for setting question text
    void setQuestion(String desiredQuestion){
        questionText=desiredQuestion;
    }

    //Method for setting answer text
    void setAnswer(String desiredAnswer){
        questionAnswer=desiredAnswer;
    }



}
