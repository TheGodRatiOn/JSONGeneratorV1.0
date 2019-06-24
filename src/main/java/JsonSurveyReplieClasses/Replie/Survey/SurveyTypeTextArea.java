package JsonSurveyReplieClasses.Replie.Survey;


public class SurveyTypeTextArea extends questions {
    SurveyTypeTextArea(String sHelpText, String sPlaceHolder, String sTitle, String sID, boolean sIsRequired) {
        this.type = "TEXTAREA";
        this.helpText = sHelpText;
        this.placeholder = sPlaceHolder;
        this.title = sTitle;
        this.id = sID;
        this.isRequired = sIsRequired;
    }

    SurveyTypeTextArea() {
        this.type = null;
        this.helpText = null;
        this.placeholder = null;
        this.title = null;
        this.id = null;
        this.isRequired = false;
    }
}