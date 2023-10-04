import java.util.Random;

public class Student {
    //Every student has a unique ID value
    private static String studentID="";
    private static String studentAnswer="";

    //generates a student's ID which is 8 digits long
    void generateID(){
        Random random = new Random();
        for(int i =0; i<8; i++){
            studentID=(random.nextInt(10))+"";
        }
    }

    //sets the student's answer
    //@param input
    void setAnswer(String input){
        studentAnswer=input;
    }


    //generates a student's answer for a single choice question
    String generateSingleAnswer(){
        Random random = new Random();
        String answer = "";
        switch(random.nextInt(4)){
            case 0:
            answer="a";
            break;
            case 1:
            answer="b";
            break;
            case 2:
            answer="c";
            break;
            case 3:
            answer="d";
            break;
        }
        return answer;
    }

    //generates a student's multiple choice answer
    String generateMultipleAnswers(){
        Random random = new Random();
        String answer ="";
        //generates a base case so that there is at least one answer
        answer +=generateSingleAnswer();
        //generates a true/false parameter, then if true, generates a random answer
        for(int i =0; i<3; i++){
            if(random.nextBoolean()){
                answer+= generateSingleAnswer();
            }
        }

        return answer;
    }
    //generates a student's true false answer
    String generateTrueFalseAnswer(){
        Random random = new Random();
        String answer="";
        //Generates a true/false parameter, print a string accordingly
        if(random.nextBoolean()){
            answer = "true";
        }else{
            answer = "false";
        }

        return answer;
    }
    

    //Returns a students ID
    String getID(){
        return studentID;
    }

    //getter for studentAnswer
    String getStudentAnswer(){
        return studentAnswer;
    }

    //Allows a student to submit an answer
    void submitSingleAnswer(){
        
    }

}
