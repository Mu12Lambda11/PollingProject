public class MultipleChoiceQuestion extends Question{

    private String questionText=Question.getQuestion();
    private String questionAnswer=Question.getAnswer();

    //Method for setting multiple answers
    @Override void setAnswer(String answers){
        answers=answers.toLowerCase();
        if(answers.contains("a")){
            questionAnswer+="a ";
            }   
        if(answers.contains("b")){
            questionAnswer+="b ";
            }   
        if(answers.contains("c")){
            questionAnswer+="c ";
            }   
        if(answers.contains("d")){
            questionAnswer+="d ";
            }   
    }

        

}
