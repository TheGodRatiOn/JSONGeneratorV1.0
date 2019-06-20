package JsonSurveyReplieClasses.Survey;
import JsonSurveyReplieClasses.RandomString;
import JsonSurveyReplieClasses.Survey.Survey;
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
        LinkedList<Survey> surveyLinkedList = new LinkedList<Survey>();

        //N - number of survey JSONs will be created;

        int N = 15;

        for (int i = 0; i < N; i++) {
            surveyLinkedList.add(new Survey(generateBasString(43),
                    generateBasString(generateInt(80)),
                    generateBasString(generateInt(60)),
                    generateBasString(40),
                    generateBasString(40),
                    generateBasString(generateInt(57)),
                    generateInt(40) + 5));
        }

        for (int i = 0; i < 5; i++) {
            surveyLinkedList.get(i).fillQuestionArrays();
        }

        String curDir = System.getProperty("user.dir");

        ObjectMapper mapper = new ObjectMapper();

        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);

        for (int i = 0; i < N; i++)
        {
            try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(curDir + "\\SurvJSON\\survJSONex" + (i + 1) + ".json"),surveyLinkedList.get(i));


        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    }
}
