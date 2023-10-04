public class MultipleChoiceQuestion extends Question{

    private String questionText=Question.getQuestion();
    private String trueAnswer=Question.getTrueAnswer();
    private String[] wrongAnswer=Question.getWrongAnswers();

    //Method for setting multiple answers
    //@param answers
    @Override void setTrueAnswer(String answers){
        answers=answers.toLowerCase();
        if(answers.contains("a")){
            trueAnswer+="a ";
            }   
        if(answers.contains("b")){
            trueAnswer+="b ";
            }   
        if(answers.contains("c")){
            trueAnswer+="c ";
            }   
        if(answers.contains("d")){
            trueAnswer+="d ";
            }   
    }

        

}
