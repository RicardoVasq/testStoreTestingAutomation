package utils.testData.models;


import com.fasterxml.jackson.annotation.JsonProperty;

public class variables {
    @JsonProperty("variablesLogin")
    private variablesLogin variablesLogin;
    @JsonProperty("urlPage")
    private variablesUrl urlPage;
    @JsonProperty("forgotPasswordPage")
    private VariablesforgotPasswordPage forgotPasswordPage;
    @JsonProperty("newAccount")
    private variablesNewAccount newAccount;

    public variablesLogin getVariablesLogin() {
        return variablesLogin;
    }
    public variablesUrl getUrlPage() {
        return urlPage;
    }
    public VariablesforgotPasswordPage getForgotPasswordPage() {
        return forgotPasswordPage;
    }
    public variablesNewAccount getNewAccount() {
        return newAccount;
    }

}
