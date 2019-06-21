package JsonSurveyReplieClasses.Replie.Survey;

public class ReplieDD extends replies {
    String selectedAnswer;

    ReplieDD(int rID, String rSelectedAnswer){
        this.type = "DROPDOWN";
        this.questionID = rID;
        this.selectedAnswer = rSelectedAnswer;

    }

    ReplieDD(){
        this.type = null;
        this.selectedAnswer = null;
        this.questionID = -1;
    }
}
