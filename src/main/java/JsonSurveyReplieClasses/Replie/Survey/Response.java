package JsonSurveyReplieClasses.Replie.Survey;

import JsonSurveyReplieClasses.RandomString;

import java.util.*;

public class Response {
    private int id;
    private String surveyID;
    private String checkID;
    private int answeredQuestions;
    private ArrayList<replies> replies;

    Response(int resID, String resSurveyID, String resCheckID, int resAnsweredQuestions){
        this.id = resID;
        this.surveyID = resSurveyID;
        this.checkID = resCheckID;
        this.answeredQuestions = resAnsweredQuestions;
        this.replies = new ArrayList<>();
    }

    Response(){
        this.id = -1;
        this.surveyID = null;
        this.answeredQuestions = -1;
        this.checkID = null;
        this.replies = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurveyID() {
        return surveyID;
    }

    public void setSurveyID(String surveyID) {
        this.surveyID = surveyID;
    }

    public String getCheckID() {
        return checkID;
    }

    public void setCheckID(String checkID) {
        this.checkID = checkID;
    }

    public int getAnsweredQuestions() {
        return answeredQuestions;
    }

    public void setAnsweredQuestions(int answeredQuestions) {
        this.answeredQuestions = answeredQuestions;
    }

    public ArrayList<JsonSurveyReplieClasses.Replie.Survey.replies> getReplies() {
        return replies;
    }

    public void setReplies(ArrayList<JsonSurveyReplieClasses.Replie.Survey.replies> replies) {
        this.replies = replies;
    }

    public Boolean generateBoolean(){
        double number = Math.random();
        if (number > 0.5){
            return false;
        }else{
            return true;
        }
    }

    public static int generateInt(int a) {
        return (int) (a * Math.random());
    }

    public static String generateBasString(int strLength){
        RandomString resString = new RandomString(strLength);
        return resString.value;
    }

    public void fillQuestionRelpies(SurveyCopy surveyCopy){

        int generalCounter = surveyCopy.getQuestionsNumber();

        List<Boolean> addQueueValidation = new LinkedList<>();

        for (int j = 0; j < generalCounter; j++) {
            addQueueValidation.add(false);
        }

        for (int i = 0; i < this.answeredQuestions; i++) {
            int pos = generateInt(generalCounter);
            while ((addQueueValidation.get(pos)) && (pos < generalCounter)) {
                pos++;
                if (pos == generalCounter) {
                    pos = 0;
                }
            }
            addQueueValidation.add(pos, true);
        }

        for (int i = 0; i < surveyCopy.getQuestionsT().size(); i++) {
            if (!addQueueValidation.get(i)){
                continue;
            }
            this.replies.add(new ReplieT(surveyCopy.getQuestionsT().get(i).id,
                    generateBasString(generateInt(40))));
        }

        for (int i = 0; i < surveyCopy.getQuestionsTA().size(); i++) {

            if (!addQueueValidation.get(i + surveyCopy.getQuestionsT().size())){
                continue;
            }
            this.replies.add(new ReplieTA(surveyCopy.getQuestionsTA().get(i).id,
                    generateBasString(generateInt(40))));

        }

        for (int i = 0; i < surveyCopy.getQuestionsMC().size(); i++) {

            if (!addQueueValidation.get(i + surveyCopy.getQuestionsTA().size() + surveyCopy.getQuestionsT().size())){
                continue;
            }

            this.replies.add(new ReplieMC(surveyCopy.getQuestionsMC().get(i).id,
                    surveyCopy.getQuestionsMC().get(i).getOptions().get(generateInt(surveyCopy.getQuestionsMC().get(i).getOptions().size()))));
        }

        for (int i = 0; i < surveyCopy.getQuestionsCB().size(); i++) {

            if (!addQueueValidation.get(i + surveyCopy.getQuestionsT().size() + surveyCopy.getQuestionsTA().size() + surveyCopy.getQuestionsMC().size())){
                continue;
            }

            int counter = surveyCopy.getQuestionsCB().get(i).getOptions().size();

            List<Boolean> queueMap = new LinkedList<>();

            LinkedList<String> bufferList = new LinkedList<>();

            for (int j = 0; j < counter; j++) {
                queueMap.add(generateBoolean());
            }

            for (int j = 0; j < counter; j++) {
                if (queueMap.get(j)){
                    bufferList.add(surveyCopy.getQuestionsCB().get(i).getOptions().get(j));
                }
            }

            this.replies.add(new ReplieCB(surveyCopy.getQuestionsCB().get(i).id,
                    bufferList));
        }

        for (int i = 0; i < surveyCopy.getQuestionsDD().size(); i++) {

            if (!addQueueValidation.get(i + surveyCopy.getQuestionsT().size()+ surveyCopy.getQuestionsTA().size() + surveyCopy.getQuestionsMC().size() + surveyCopy.getQuestionsCB().size())){
                continue;
            }

            this.replies.add(new ReplieDD(surveyCopy.getQuestionsDD().get(i).id,
                    surveyCopy.getQuestionsDD().get(i).getOptions().get(generateInt(surveyCopy.getQuestionsDD().get(i).getOptions().size()))));
        }
    }
}