public class TrueFalseQuestion extends Question{
    
    private String questionText=Question.getQuestion();
    private String questionAnswer=Question.getAnswer();

    //Method for setting answer to true or false
    @Override void setAnswer(String answer){
        if(answer.equals("1")){
            answer="true";
        }else{
            answer="false";
        }
    }

}