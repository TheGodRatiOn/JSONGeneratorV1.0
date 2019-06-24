package JsonSurveyReplieClasses.Replie.Survey;

public class ReplieTA extends replies {
    String Text;

    ReplieTA(String rID, String rText){
        this.type = "TEXTAREA";
        this.questionID = rID;
        this.Text = rText;
    }

    ReplieTA(){
        this.type = null;
        this.questionID = null;
        this.Text = null;
    }
}
