public class TrueFalseQuestion extends Question{
    
    private String questionText=Question.getQuestion();
    private String trueAnswer=Question.getTrueAnswer();

    //Method for setting answer to true or false
    @Override void setTrueAnswer(String answer){
        if(answer.equals("1")){
            answer="true";
        }else{
            answer="false";
        }
    }

}