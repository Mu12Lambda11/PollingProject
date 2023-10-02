public interface Student {
    //Every student has a unique ID value
    String studentID="";

    //generates a student's ID
    String generateID();

    //Returns a students ID
    String getID();

    //Allows a student to submit an answer
    void submitAnswer();
}
