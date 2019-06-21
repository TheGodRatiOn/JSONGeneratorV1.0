package JsonSurveyReplieClasses.Replie.Survey;

public class ReplieTA extends replies {
    String Text;

    ReplieTA(int rID, String rText){
        this.type = "TEXT";
        this.questionID = rID;
        this.Text = rText;
    }

    ReplieTA(){
        this.type = null;
        this.questionID = -1;
        this.Text = null;
    }

    //public void fillReplieTA(SurveyCopy surveyCopy, int i){
    //    this.questionID = surveyCopy.getQuestionsTA().get(i).id;
    //}
}
