package JsonSurveyReplieClasses;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomString{
    public String value;

    public RandomString(int strLength){
        this.value = RandomStringUtils.randomAlphanumeric(strLength).toLowerCase();
    }
}