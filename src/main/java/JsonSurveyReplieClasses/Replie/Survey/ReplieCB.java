package JsonSurveyReplieClasses.Replie.Survey;


import java.util.LinkedList;

public class ReplieCB extends replies {
    //boolean selectedAnotherOption;
    LinkedList<String> selectedAnswer;

    ReplieCB(int rID, LinkedList<String> stringLinkedList){
        this.type = "CHECKBOX";
        this.questionID = rID;
        //this.selectedAnotherOption = rSelectedAnotherOption;
        this.selectedAnswer = stringLinkedList;
    }

    ReplieCB(){
        this.type = null;
        this.questionID = -1;
        this.selectedAnswer = null;
        //this.selectedAnotherOption = false;
    }
}
