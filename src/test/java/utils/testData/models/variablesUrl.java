package utils.testData.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("urlPage")
public class variablesUrl {
    @JsonProperty("forgotPassword")
    private String forgotPassword;
    @JsonProperty("registration")
    private String registration;

    public String getForgotPassword() {
        return forgotPassword;
    }

    public String getRegistration() {
        return registration;
    }
}
