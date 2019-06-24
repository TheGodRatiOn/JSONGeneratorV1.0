package JsonSurveyReplieClasses.Replie.Survey;


public class SurveyTypeText extends questions {
    SurveyTypeText(String sHelpText, String sPlaceHolder, String sTitle, String sID, boolean sIsRequired){
        this.type = "TEXT";
        this.helpText = sHelpText;
        this.placeholder = sPlaceHolder;
        this.title = sTitle;
        this.id = sID;
        this.isRequired = sIsRequired;
    }

    SurveyTypeText(){
        this.type = null;
        this.helpText = null;
        this.placeholder = null;
        this.title = null;
        this.id = null;
        this.isRequired = false;
    }
}