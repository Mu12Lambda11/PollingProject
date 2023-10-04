import java.util.ArrayList;

public class VotingService {
    
    private int aCount=0;
    private int bCount=0;
    private int cCount=0;
    private int dCount=0;
    private int trueCount=0;
    private int falseCount=0;
    private ArrayList<String> studentSubmissions= new ArrayList<String>();
    private ArrayList<String> studentSubmissionIDs= new ArrayList<String>();
    private Question configuredQuestion;
    private String questionText=configuredQuestion.getQuestion();
    private String questionAnswer=configuredQuestion.getTrueAnswer();


    //Method to configure question for use within this class
    //@param givenQuestion
    void configureQuestion(Question givenQuestion){
        Question configuredQuestion = givenQuestion;
    }


    //Accept student submissions after verifying their ID
    //@param student
    void acceptSubmission(Student student){
    //if ID array does not contain student's ID, ...
    if(!(studentSubmissionIDs.contains(student.getID()))){
        studentSubmissionIDs.add(student.getID());
        studentSubmissions.add(student.getStudentAnswer());
    }else{
        //if ID array does contain student's ID, find and replace their answer
        for(int i =0; i<studentSubmissionIDs.size();i++){
            if(studentSubmissionIDs.get(i)==student.getID()){
                studentSubmissionIDs.set(i, student.getID());
                studentSubmissions.set(i, student.getStudentAnswer());
            }
        }
     }
    }

    //Processes all votes, and increments the respective vote counter
    //@param answers
    void processVotes(ArrayList answers){
        for(int i=0; i<answers.size();i++){
            switch(((String)answers.get(i)).toLowerCase()){
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

    //Processes all votes from a multiple choice question,
    //and increments the respective vote counter
    //@param answers
    void processMultipleVotes(ArrayList answers){
        for(int i=0; i<answers.size();i++){
            
            if(((String)answers.get(i)).toLowerCase().contains("a")){
                aCount++;
            }
            if(((String)answers.get(i)).toLowerCase().contains("b")){
                bCount++;
            }
            if(((String)answers.get(i)).toLowerCase().contains("c")){
                cCount++;
            }
            if(((String)answers.get(i)).toLowerCase().contains("d")){
                dCount++;
            }
        }
    }

    //Resets the studentSubmission and count variables to prepare for the next question
    void resetVariables(){
    aCount=0;
    bCount=0;
    cCount=0;
    dCount=0;
    trueCount=0;
    falseCount=0;
    studentSubmissions= new ArrayList<String>();
    studentSubmissionIDs= new ArrayList<String>();
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
    //@param numOfStudents
    void displayStats(int numOfStudents){
    System.out.println("These are the statistics for each answer\n");
    System.out.println("These are the number of students:" + numOfStudents);
    System.out.println("A:"+aCount+"\nB:"+bCount+"\nC:"+cCount+"\nD:"+dCount+"\nTrue"+trueCount+"\nFalse"+falseCount+"\n");
    }
}
