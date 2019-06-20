package JsonSurveyReplieClasses.Survey;

import java.util.ArrayList;

public class SurveyTypeCheckbox extends questions {
    private boolean hasOtherOption;
    private ArrayList<String> options;

    private void fillOptions(int a){
        for (int i = 0; i < a; i++) {
            int j = i + 1;
            this.options.add("Option " + j+ " Check");
        }
    }

    SurveyTypeCheckbox(String sHelpText, String sPlaceHolder, String sTitle, int sID, boolean sIsRequired, int sOptLength){
        this.type = "CHECKBOX";
        this.helpText = sHelpText;
        this.placeholder = sPlaceHolder;
        this.title = sTitle;
        this.id = sID;
        this.isRequired = sIsRequired;
        if (sOptLength > 1){
            this.hasOtherOption = true;
        }else {
            this.hasOtherOption = false;
        }
        //this.optionsLength = sOptLength;
        this.options = new ArrayList<String>();
        this.fillOptions(sOptLength);
    }

    SurveyTypeCheckbox(){
        this.type = null;
        this.helpText = null;
        this.placeholder = null;
        this.title = null;
        this.id = -1;
        this.isRequired = false;
        this.hasOtherOption = false;
        //this.optionsLength = -1;
        this.options = null;
    }
}
