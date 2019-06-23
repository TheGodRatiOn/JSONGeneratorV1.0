package JsonSurveyReplieClasses.Replie.Survey;

import java.util.LinkedList;

public class Meta {
       private String title;
       private String description;
       private String posterID;
       private String companyID;
       private LinkedList<String> editorsId;
       private String confirmationMesssage;
       private int questionsNumber;

       public Meta(String survTitle, String survDescription, String posterID, String companyID, LinkedList<String> stringLinkedList, String survConfMess, int questionsNumber){
              this.title = survTitle;
              this.description = survDescription;
              this.posterID = posterID;
              this.companyID = companyID;
              this.editorsId = stringLinkedList;
              this.confirmationMesssage = survConfMess;
              this.questionsNumber = questionsNumber;
       }

       public Meta(){
              this.title = null;
              this.description = null;
              this.companyID = null;
              this.posterID = null;
              this.editorsId = null;
              this.confirmationMesssage = null;
              this.questionsNumber = -1;
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

       public String getPosterID() {
              return posterID;
       }

       public void setPosterID(String posterID) {
              this.posterID = posterID;
       }

       public String getCompanyID() {
              return companyID;
       }

       public void setCompanyID(String companyID) {
              this.companyID = companyID;
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
}
