/*
 * By Isaiah Jordan
 * CS3560
 * Assignment 1
 */

import java.util.ArrayList;
import java.util.Random;

public class SimulatorDriver {
    //Counter for the number of students
    private static int numOfStudents=0;
    //Create VotingService object
    private static VotingService iVoteService = new VotingService();

    public static void main(String[] args) {
        //Question instances
        Question question1 = new Question();
        Question question2 = new MultipleChoiceQuestion();
        Question question3 = new TrueFalseQuestion();


        //initialize objects to hold the generated student answers
        ArrayList<String> singleChoiceAnswers = new ArrayList<String>();
        ArrayList<String> multipleChoiceAnswers = new ArrayList<String>();
        ArrayList<String> booleanAnswers = new ArrayList<String>();

        //SINGLE CHOICE
        System.out.println("SINGLE CHOICE\n");
        //Configure question1 in iVoteService
        iVoteService.configureQuestion(question1);

        //Generate single choice answers and load to arraylist
        singleChoiceAnswers=generateStudentsAndAnswers(1);

        //use iVoteService to process all the information
        useVoteService(singleChoiceAnswers, "single");

        //MULTIPLE CHOICE
        System.out.println("MULTIPLE CHOICE\n");
        //Configure question2 in iVoteService
        iVoteService.configureQuestion(question2);

        //Generate single choice answers and load to arraylist
        multipleChoiceAnswers=generateStudentsAndAnswers(2);

        //use iVoteService to process all the information
        useVoteService(multipleChoiceAnswers, "multiple");

        //TRUE/FALSE
        System.out.println("TRUE OR FALSE\n");
        //Configure question1 in iVoteService
        iVoteService.configureQuestion(question3);

        //Generate single choice answers and load to arraylist
        booleanAnswers=generateStudentsAndAnswers(3);

        //use iVoteService to process all the information
        useVoteService(booleanAnswers,"single");

        

    
    }
    //Function to generate the student instances and their respective answers.
    //The information is then processed by the VotingService instance.
    //@param option
    private static ArrayList generateStudentsAndAnswers(int option){
        Random random = new Random();
        ArrayList<String> choiceAnswers = new ArrayList<String>();
        switch(option){
            //single answer case
            case 1:

            //bound of 36 just for example
            for(int i=0; i<36;i++){
            //Students are generated randomly
            if(random.nextBoolean()){
                Student student = new Student();
                numOfStudents++;
                //generate student attributes
                student.generateID();
                choiceAnswers.add(student.generateSingleAnswer());
                student.setAnswer(choiceAnswers.get(choiceAnswers.size()-1));
                //submit answer 
                iVoteService.acceptSubmission(student);
            }

         }
            break;
            //Multiple choice
            case 2:

            //bound of 36 just for example
            for(int i=0; i<36;i++){
            //Students are generated randomly
            if(random.nextBoolean()){
                Student student = new Student();
                numOfStudents++;
                //generate student attributes
                student.generateID();
                choiceAnswers.add(student.generateMultipleAnswers());
                student.setAnswer(choiceAnswers.get(choiceAnswers.size()-1));
                //submit answer 
                iVoteService.acceptSubmission(student);
            }

         }
            break;
            //True-False
            case 3:

            //bound of 36 just for example
            for(int i=0; i<36;i++){
            //Students are generated randomly
            if(random.nextBoolean()){
                Student student = new Student();
                numOfStudents++;
                //generate student attributes
                student.generateID();
                choiceAnswers.add(student.generateTrueFalseAnswer());
                student.setAnswer(choiceAnswers.get(choiceAnswers.size()-1));
                //submit answer 
                iVoteService.acceptSubmission(student);
            }

         }
            break;
        }
        return choiceAnswers;

    }
    //Function to reset the variable counting the number of students
    private static void resetNumStudents(){
        numOfStudents=0;
    }

    //Function to use all the utilities of the VotingService instance.
    /* @param choiceAnswers
     * @param singleOrMultiple
     */
    private static void useVoteService(ArrayList<String> choiceAnswers, String singleOrMultiple){
        //Warning:Method is faulty, but unecessary for this implementation. Therefore, it is disabled.
        //->
        //display question
        //iVoteService.displayQuestion();

        switch(singleOrMultiple){
            case "single":
             //Process the students' votes
             iVoteService.processVotes(choiceAnswers);
            break;
            case "multiple":
             //Process the students' votes
             iVoteService.processMultipleVotes(choiceAnswers);
            break;
        }

        //Warning:Method is faulty, but unecessary for this implementation.  Therefore, it is disabled.
        //->
        //display answer
        //iVoteService.displayAnswer();

        //display stats
        iVoteService.displayStats(numOfStudents);

        //reset iVoteService
        iVoteService.resetVariables();

        //reset numOfStudents
        resetNumStudents();
    }
}
