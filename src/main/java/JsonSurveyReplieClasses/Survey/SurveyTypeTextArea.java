package JsonSurveyReplieClasses.Survey;


public class SurveyTypeTextArea extends questions {
    SurveyTypeTextArea(String sHelpText, String sPlaceHolder, String sTitle, int sID, boolean sIsRequired){
        this.type = "TEXTAREA";
        this.helpText = sHelpText;
        this.placeholder = sPlaceHolder;
        this.title = sTitle;
        this.id = sID;
        this.isRequired = sIsRequired;
    }

    SurveyTypeTextArea(){
        this.type = null;
        this.helpText = null;
        this.placeholder = null;
        this.title = null;
        this.id = -1;
        this.isRequired = false;
    }
}