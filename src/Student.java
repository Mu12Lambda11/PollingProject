public class Student {
    //Every student has a unique ID value
    String studentID="";
    String singleAnswer="";
    String multipleAnswer="";

    //generates a student's ID
    String generateID(){
        return "0";
    }

    //generates a student's answer for a single choice question
    String singleAnswer(){
        String answer="";
        return answer;
    }

    //generates a student's answer(s) for a multiple choice question
    String[] multipleAnswer(){
        String[] answers={"a"};
        return answers;
    }
    
    String trueFalseAnswer(){
        String answer="";

        return answer;
    }
    

    //Returns a students ID
    String getID(){
        return studentID;
    }


    //Allows a student to submit an answer
    void submitSingleAnswer(){
        
    }

    //Allows a student to submit an answer array
    void submitMultipleAnswer(){

    }
}
