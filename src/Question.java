abstract class Question {
    //variables for questions and the true question
    String questionText="Sample Question";
    String questionAnswer="Sample Answer";

    //Method for displaying questions
    void displayQuestion(){

    }

    //Method to get the question string
    String getQuestion(){
        return questionText;
    }

    //Method to get the answer string
    String getAnswer(){
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
