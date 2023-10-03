public class VotingService {
    
    private int aCount=0;
    private int bCount=0;
    private int cCount=0;
    private int dCount=0;
    private int trueCount=0;
    private int falseCount=0;
    private Question configuredQuestion;
    private String questionText=configuredQuestion.getQuestion();
    private String questionAnswer=configuredQuestion.getAnswer();


    //Method to configure question
    void configureQuestion(Question givenQuestion){
        Question configuredQuestion = givenQuestion;
    }



    //Processes all votes, and increments the respective vote counter
    void processVotes(String answer){
        switch(answer.toLowerCase()){
            case "a":
            aCount++;
            break;

            case "b":
            bCount++;
            break;

            case "c":
            cCount++;
            break;

            case "d":
            dCount++;
            break;

            case "true":
            trueCount++;
            break;

            case "false":
            falseCount++;
            break;
        }

    }

    //Print out the configured question
    void displayQuestion(){
        System.out.println(questionText);
    }

    //Print out the configured question's answer
    void displayAnswer(){
        System.out.println(questionAnswer);
    }

    //Display all question data
    void displayStats(){
    System.out.println("These are the statistics for each answer");
    System.out.println("A:"+aCount+"B:"+bCount+"C:"+cCount+"D:"+dCount+"True"+trueCount+"False"+falseCount);
    }
}
