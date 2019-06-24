package JsonSurveyReplieClasses.Replie.Survey;


public class ReplieMC extends replies {
   // boolean selectedAnotherOption;
    String selectedAnswer;

    ReplieMC(String rID, String rSelectedAnswer){
        this.type = "MULTIPLE_CHOICE";
        this.questionID = rID;
       // this.selectedAnotherOption = rSelectedAnotherOption;
        this.selectedAnswer = rSelectedAnswer;
    }

    ReplieMC(){
        this.type = null;
        this.questionID = null;
        //this.selectedAnotherOption = false;
        this.selectedAnswer = null;
    }
}
