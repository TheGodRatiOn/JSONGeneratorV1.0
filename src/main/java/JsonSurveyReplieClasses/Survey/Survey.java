package JsonSurveyReplieClasses.Survey;

import JsonSurveyReplieClasses.*;

import java.util.ArrayList;
import java.util.LinkedList;


public class Survey{
    private String id;
    private String title;
    private String description;
    private LinkedList<String> editorsId;
    private String confirmationMesssage;
    private int questionsNumber;
    private ArrayList<questions> questions;

    Survey(String survID, String survTitle, String survDescription, String survEditID1, String survEditID2, String survConfMess, int survQuestNumb){
        this.id = survID;
        this.title = survTitle;
        this.description = survDescription;
        this.editorsId = new LinkedList<>();
        this.editorsId.add(survEditID1);
        this.editorsId.add(survEditID2);
        this.confirmationMesssage = survConfMess;
        this.questionsNumber = survQuestNumb;
        this.questions = new ArrayList<>();
    }

    Survey(){
        this.id = null;
        this.title = null;
        this.description = null;
        this.editorsId = null;
        this.confirmationMesssage = null;
        this.questionsNumber = -1;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LinkedList<String> getEditorsId() {
        return editorsId;
    }

    public void setEditorsId(LinkedList<String> editorsId) {
        this.editorsId = editorsId;
    }

    public String getConfirmationMesssage() {
        return confirmationMesssage;
    }

    public void setConfirmationMesssage(String confirmationMesssage) {
        this.confirmationMesssage = confirmationMesssage;
    }

    public int getQuestionsNumber() {
        return questionsNumber;
    }

    public void setQuestionsNumber(int questionsNumber) {
        this.questionsNumber = questionsNumber;
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

    public void fillQuestionArrays(){
        int currentLengthTA, currentLengthCB, currentLengthMC,currentLengthDD;
        if (this.questionsNumber < 1){
            System.out.println("No questions are about to be created");
        }else{
            currentLengthDD = generateInt(this.questionsNumber/4);
            currentLengthCB = generateInt(this.questionsNumber - currentLengthDD)/4;
            currentLengthMC = generateInt(this.questionsNumber - currentLengthDD - currentLengthCB)/4;
            currentLengthTA = this.questionsNumber - currentLengthDD - currentLengthMC - currentLengthCB;


            for (int i = 0; i < currentLengthTA; i++) {
                this.questions.add(new SurveyTypeTextArea(generateBasString(generateInt(40)),
                        generateBasString(generateInt(30)),
                        generateBasString(generateInt(100)),
                        generateInt(10000000),
                        generateBoolean()));
            }

            for (int i = 0; i < currentLengthMC; i++) {
                this.questions.add(new SurveyTypeMultipleChoice(generateBasString(generateInt(40)),
                        generateBasString(generateInt(30)),
                        generateBasString(generateInt(100)),
                        generateInt(10000000),
                        generateBoolean(),
                        generateInt(10)));
            }

            for (int i = 0; i < currentLengthCB; i++) {
                this.questions.add(new SurveyTypeCheckbox(generateBasString(generateInt(40)),
                        generateBasString(generateInt(30)),
                        generateBasString(generateInt(100)),
                        generateInt(10000000),
                        generateBoolean(),
                        generateInt(10)));
            }

            for (int i = 0; i < currentLengthDD; i++) {
                this.questions.add(new SurveyTypeDropdown(generateBasString(generateInt(40)),
                        generateBasString(generateInt(30)),
                        generateBasString(generateInt(100)),
                        generateInt(10000000),
                        generateBoolean(),
                        generateInt(10)));
            }
        }
    }

}