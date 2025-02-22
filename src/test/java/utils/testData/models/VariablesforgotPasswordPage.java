package utils.testData.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("forgotPasswordPage")
public class VariablesforgotPasswordPage {
    @JsonProperty("header")
    private String header;
    @JsonProperty("currentPage")
    private String currentPage;
    @JsonProperty("messegeForUser")
    private String messegeForUser;

    public String getHeader() {
        return header;
    }
    public String getCurrentPage() {
        return currentPage;
    }
    public String getMessegeForUser() {
        return messegeForUser;
    }
}
