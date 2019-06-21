package JsonSurveyReplieClasses.Replie.Survey;

import java.util.ArrayList;

public class SurveyCopy {
    private String id;
    private int questionsNumber;
    private ArrayList<SurveyTypeTextArea> questionsTA;
    private ArrayList<SurveyTypeMultipleChoice> questionsMC;
    private ArrayList<SurveyTypeCheckbox> questionsCB;
    private ArrayList<SurveyTypeDropdown> questionsDD;

    SurveyCopy (String survID, int survQuestNumb){
        this.id = survID;
        this.questionsNumber = survQuestNumb;
        this.questionsTA = new ArrayList<>();
        this.questionsMC = new ArrayList<>();
        this.questionsCB = new ArrayList<>();
        this.questionsDD = new ArrayList<>();
    }

    SurveyCopy(){
        this.id = null;
        this.questionsNumber = -1;
        this.questionsTA = null;
        this.questionsMC = null;
        this.questionsCB = null;
        this.questionsDD = null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuestionsNumber() {
        return questionsNumber;
    }

    public void setQuestionsNumber(int questionsNumber) {
        this.questionsNumber = questionsNumber;
    }

    public ArrayList<SurveyTypeTextArea> getQuestionsTA() {
        return questionsTA;
    }

    public void setQuestionsTA(ArrayList<SurveyTypeTextArea> questionsTA) {
        this.questionsTA = questionsTA;
    }

    public ArrayList<SurveyTypeMultipleChoice> getQuestionsMC() {
        return questionsMC;
    }

    public void setQuestionsMC(ArrayList<SurveyTypeMultipleChoice> questionsMC) {
        this.questionsMC = questionsMC;
    }

    public ArrayList<SurveyTypeCheckbox> getQuestionsCB() {
        return questionsCB;
    }

    public void setQuestionsCB(ArrayList<SurveyTypeCheckbox> questionsCB) {
        this.questionsCB = questionsCB;
    }

    public ArrayList<SurveyTypeDropdown> getQuestionsDD() {
        return questionsDD;
    }

    public void setQuestionsDD(ArrayList<SurveyTypeDropdown> questionsDD) {
        this.questionsDD = questionsDD;
    }
}