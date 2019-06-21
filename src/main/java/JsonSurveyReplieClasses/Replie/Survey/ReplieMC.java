package JsonSurveyReplieClasses.Replie.Survey;


public class ReplieMC extends replies {
   // boolean selectedAnotherOption;
    String selectedAnswer;

    ReplieMC(int rID, String rSelectedAnswer){
        this.type = "MULTIPLE_CHOICE";
        this.questionID = rID;
       // this.selectedAnotherOption = rSelectedAnotherOption;
        this.selectedAnswer = rSelectedAnswer;
    }

    ReplieMC(){
        this.type = null;
        this.questionID = -1;
        //this.selectedAnotherOption = false;
        this.selectedAnswer = null;
    }
}
