package utils.testData.models;


import com.fasterxml.jackson.annotation.JsonProperty;

public class variables {
    @JsonProperty("variablesLogin")
    private variablesLogin variablesLogin;

    public variablesLogin getVariablesLogin() {
        return variablesLogin;
    }
}
