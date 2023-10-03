public class VotingService {
    
    private int aCount=0;
    private int bCount=0;
    private int cCount=0;
    private int dCount=0;
    private int trueCount=0;
    private int falseCount=0;

    //
    void gatherVotes(String answer){

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

    //Processes all votes, and increments the respective vote counter
    void processVotesArray(String[] answer){
        for(int i =0; i<answer.length;i++){
            switch(answer[i].toLowerCase()){
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

    }

    //Display all question data
    void displayStats(){
    System.out.println("These are the statistics for each answer");
    System.out.println("A:"+aCount+"B:"+bCount+"C:"+cCount+"D:"+dCount+"True"+trueCount+"False"+falseCount);
    }
}
