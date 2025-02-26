package utils.testData.models;

import base.BaseTest;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("form")
public class variablesFormNewAccountLabels {

    @JsonProperty("labelFirstName")
    private String labelFirstName;
    @JsonProperty("labelLastName")
    private String labelLastName;
    @JsonProperty("labelEmail")
    private String labelEmail;
    @JsonProperty("labelPassword")
    private String labelPassword;
    @JsonProperty("labelBirthdate")
    private String labelBirthdate;
    @JsonProperty("messageOffers")
    private String messageOffers;
    @JsonProperty("messageTermsConditions")
    private String messageTermsConditions;
    @JsonProperty("messageNewsletter")
    private String messageNewsletter;

    public String getLabelFirstName() {
        return labelFirstName;
    }
    public String getLabelPassword() {
        return labelPassword;
    }
    public String getLabelEmail() {
        return labelEmail;
    }
    public String getLabelLastName() {
        return labelLastName;
    }
    public String getMessageNewsletter() {
        return messageNewsletter;
    }
    public String getMessageTermsConditions() {
        return messageTermsConditions;
    }
    public String getMessageOffers() {
        return messageOffers;
    }
    public String getLabelBirthdate() {
        return labelBirthdate;
    }

}
