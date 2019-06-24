package JsonSurveyReplieClasses.Replie.Survey;

import JsonSurveyReplieClasses.*;
import java.util.ArrayList;
import java.util.LinkedList;


public class Survey{
    private String id;
    private JsonSurveyReplieClasses.Replie.Survey.Meta meta;
    private ArrayList<questions> questions;

    Survey(String survID, String survTitle, String survDescription, String posterID, String survCompanyID, LinkedList<String> stringLinkedList, String survConfMess, int survQuestNumb){
        this.id = survID;
        this.meta = new Meta(survTitle, survDescription, posterID,survCompanyID, stringLinkedList, survConfMess, survQuestNumb);
        this.questions = new ArrayList<>();
    }

    Survey(){
        this.id = null;
        this.meta = null;
        this.questions = null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public ArrayList<questions> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<questions> questions) {
        this.questions = questions;
    }

    public int generateInt(int a){
        return (int) (a * Math.random()) + 4;
    }

    public boolean generateBoolean(){
        double number = Math.random();
        if (number > 0.5){
            return false;
        }else{
            return true;
        }
    }

    public String generateBasString(int strLength){
        RandomString resString = new RandomString(strLength);
        return resString.value;
    }

    public SurveyCopy fillQuestionArrays(SurveyCopy surveyCopy){
        int currentLengthTA, currentLengthT, currentLengthCB, currentLengthMC, currentLengthDD;
        if (this.meta.getQuestionsNumber() < 1){
            System.out.println("No questions are about to be created");
        }else{

            currentLengthDD = generateInt(this.meta.getQuestionsNumber())/6;
            currentLengthCB = generateInt(this.meta.getQuestionsNumber() - currentLengthDD)/5;
            currentLengthMC = generateInt(this.meta.getQuestionsNumber() - currentLengthDD - currentLengthCB)/3;
            currentLengthT = generateInt(this.meta.getQuestionsNumber() - currentLengthDD - currentLengthMC - currentLengthCB)/2;
            currentLengthTA = this.meta.getQuestionsNumber() - currentLengthDD - currentLengthMC - currentLengthCB - currentLengthT ;


            for (int i = 0; i < currentLengthT; i++) {
                SurveyTypeText bufferT = new SurveyTypeText(generateBasString(generateInt(40)),
                        generateBasString(generateInt(30)),
                        generateBasString(generateInt(100)),
                        generateBasString(43),
                        generateBoolean());
                surveyCopy.getQuestionsT().add(bufferT);
                this.questions.add(bufferT);
            }

            for (int i = 0; i < currentLengthTA; i++) {
                SurveyTypeTextArea bufferTA = new SurveyTypeTextArea(generateBasString(generateInt(40)),
                        generateBasString(generateInt(30)),
                        generateBasString(generateInt(100)),
                        generateBasString(43),
                        generateBoolean());
                surveyCopy.getQuestionsTA().add(bufferTA);
                this.questions.add(bufferTA);
            }

            for (int i = 0; i < currentLengthMC; i++) {
                SurveyTypeMultipleChoice bufferMC = new SurveyTypeMultipleChoice(generateBasString(generateInt(40)),
                        generateBasString(generateInt(30)),
                        generateBasString(generateInt(100)),
                        generateBasString(43),
                        generateBoolean(),
                        generateInt(10));
                surveyCopy.getQuestionsMC().add(bufferMC);
                this.questions.add(bufferMC);
            }

            for (int i = 0; i < currentLengthCB; i++) {
                SurveyTypeCheckbox bufferCB = new SurveyTypeCheckbox(generateBasString(generateInt(40)),
                        generateBasString(generateInt(30)),
                        generateBasString(generateInt(100)),
                        generateBasString(43),
                        generateBoolean(),
                        generateInt(10));
                surveyCopy.getQuestionsCB().add(bufferCB);
                this.questions.add(bufferCB);
            }

            for (int i = 0; i < currentLengthDD; i++) {
                SurveyTypeDropdown bufferDD = new SurveyTypeDropdown(generateBasString(generateInt(40)),
                        generateBasString(generateInt(30)),
                        generateBasString(generateInt(100)),
                        generateBasString(43),
                        generateBoolean(),
                        generateInt(10));
                surveyCopy.getQuestionsDD().add(bufferDD);
                this.questions.add(bufferDD);
            }

            return surveyCopy;
        }
        return surveyCopy;
    }
}