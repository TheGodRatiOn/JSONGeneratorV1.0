package JsonSurveyReplieClasses.Survey;

import java.util.ArrayList;

public class SurveyTypeDropdown extends questions {
    private ArrayList<String> options;

    private void fillOptions(int a){
        for (int i = 0; i < a; i++) {
            int j = i + 1;
            this.options.add("Option " + j + " Dropdown");
        }
    }

    SurveyTypeDropdown(String sHelpText, String sPlaceHolder, String sTitle, int sID, boolean sIsRequired, int sOptLength){
        this.type = "DROPDOWN";
        this.helpText = sHelpText;
        this.placeholder = sPlaceHolder;
        this.title = sTitle;
        this.id = sID;
        this.isRequired = sIsRequired;
        //this.optionsLength = sOptLength;
        this.options = new ArrayList<String>();
        this.fillOptions(sOptLength);
    }

    SurveyTypeDropdown(){
        this.type = null;
        this.helpText = null;
        this.placeholder = null;
        this.title = null;
        this.id = -1;
        this.isRequired = false;
        //this.optionsLength = -1;
        this.options = null;
    }
}