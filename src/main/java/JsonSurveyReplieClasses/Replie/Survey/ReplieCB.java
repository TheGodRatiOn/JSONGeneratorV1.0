package JsonSurveyReplieClasses.Replie.Survey;


import java.util.LinkedList;

public class ReplieCB extends replies {
    //boolean selectedAnotherOption;
    LinkedList<String> selectedAnswer;

    ReplieCB(String rID, LinkedList<String> stringLinkedList){
        this.type = "CHECKBOX";
        this.questionID = rID;
        //this.selectedAnotherOption = rSelectedAnotherOption;
        this.selectedAnswer = stringLinkedList;
    }

    ReplieCB(){
        this.type = null;
        this.questionID = null;
        this.selectedAnswer = null;
        //this.selectedAnotherOption = false;
    }
}
