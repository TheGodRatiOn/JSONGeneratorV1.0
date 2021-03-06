package JsonSurveyReplieClasses.Replie.Survey;

import java.util.ArrayList;

public class SurveyTypeCheckbox extends questions {
   //private boolean hasOtherOption;
    private ArrayList<String> options;

    private void fillOptions(int a){
        for (int i = 0; i < a; i++) {
            int j = i + 1;
            this.options.add("Option " + j + " Check");
        }
    }

    SurveyTypeCheckbox(String sHelpText, String sPlaceHolder, String sTitle, String sID, boolean sIsRequired, int sOptLength){
        this.type = "CHECKBOX";
        this.helpText = sHelpText;
        this.placeholder = sPlaceHolder;
        this.title = sTitle;
        this.id = sID;
        this.isRequired = sIsRequired;
        /*if (sOptLength > 1){
            this.hasOtherOption = true;
        }else {
            this.hasOtherOption = false;
        }*/
        //this.optionsLength = sOptLength;
        this.options = new ArrayList<>();
        this.fillOptions(sOptLength);
    }

    SurveyTypeCheckbox(){
        this.type = null;
        this.helpText = null;
        this.placeholder = null;
        this.title = null;
        this.id = null;
        this.isRequired = false;
        //this.hasOtherOption = false;
        //this.optionsLength = -1;
        this.options = null;
    }

    /*public boolean isHasOtherOption() {
        return hasOtherOption;
    }

    public void setHasOtherOption(boolean hasOtherOption) {
        this.hasOtherOption = hasOtherOption;
    }*/

    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }
}
