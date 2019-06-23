package JsonSurveyReplieClasses.Replie.Survey;
import JsonSurveyReplieClasses.RandomString;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

public class Main {

    public static int generateInt(int a) {
        return (int) (a * Math.random());
    }

    public static String generateBasString(int strLength){
        RandomString resString = new RandomString(strLength);
        return resString.value;
    }

    public static void main(String[] args) {
        LinkedList<Survey> surveyLinkedList = new LinkedList<>();
        LinkedList<Response> responseLinkedList = new LinkedList<>();
        LinkedList<SurveyCopy> surveyCopiesBas = new LinkedList<>();
        LinkedList<SurveyCopy> surveyCopiesMod = new LinkedList<>();


        //N - number of survey JSONs will be created;
        //M - number of responses for each survey;

        int N = 5;
        int M = 20;

        String checkID = generateBasString(generateInt(50));

        for (int i = 0; i < N; i++) {

            String buffStrID;
            int buffQuestNumb;

            buffStrID = generateBasString(43);
            buffQuestNumb = generateInt(40) + 5;

            int lSize = generateInt(5);

            LinkedList<String> editorsList = new LinkedList<>();

            for (int j = 0; j < lSize; j++) {
                editorsList.add(generateBasString(generateInt(30)));
            }

            surveyLinkedList.add(new Survey(
                    buffStrID,
                    generateBasString(generateInt(80)),
                    generateBasString(generateInt(60)),
                    generateBasString(40),
                    generateBasString(40),
                    editorsList,
                    generateBasString(generateInt(57)),
                    buffQuestNumb));
            surveyCopiesBas.add(new SurveyCopy(buffStrID, buffQuestNumb));
        }

        for (int i = 0; i < N; i++){
            surveyCopiesMod.add(surveyLinkedList.get(i).fillQuestionArrays(surveyCopiesBas.get(i)));
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                responseLinkedList.add(new Response(generateInt(1000000), surveyCopiesBas.get(i).getId(), checkID, generateInt(surveyCopiesMod.get(i).getQuestionsNumber())));
            }
        }

        for (int i = 0; i < N * M; i++) {
            responseLinkedList.get(i).fillQuestionRelpies(surveyCopiesMod.get(i/M));
        }

        String curDir = System.getProperty("user.dir");

        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);

        for (int i = 0; i < N; i++)
        {
            try {

                objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(curDir + "\\SurvJSON\\survJSONex" + (i + 1) + ".json"),surveyLinkedList.get(i));

            } catch (IOException e) {
            e.printStackTrace();
            }
        }

        for (int i = 0; i < N * M; i++)
        {
            try {

                objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(curDir + "\\RespJSON\\respJSONex" + (i + 1) + ".json"),responseLinkedList.get(i));

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.exit(0);
    }
}
