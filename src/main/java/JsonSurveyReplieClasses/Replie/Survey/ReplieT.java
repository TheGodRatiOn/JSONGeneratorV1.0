package JsonSurveyReplieClasses.Replie.Survey;

public class ReplieT extends replies {
    String Text;

    ReplieT(String rID, String rText){
        this.type = "TEXT";
        this.questionID = rID;
        this.Text = rText;
    }

    ReplieT(){
        this.type = null;
        this.questionID = null;
        this.Text = null;
    }
}
