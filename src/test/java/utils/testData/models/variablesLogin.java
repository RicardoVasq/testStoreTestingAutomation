package utils.testData.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("variablesLogin")
public class variablesLogin {
    @JsonProperty("userValido")
    private variablesUserValido userValido;
    @JsonProperty("userIncorrecto")
    private variablesUserIncorrecto userIncorrecto;
    @JsonProperty("header")
    private String header;
    @JsonProperty("currentPage")
    private String currentPage;
    @JsonProperty("formatoIncorrect")
    private String formatoIncorrect;
    @JsonProperty("messeErrorLogin")
    private String messeErrorLogin;

    public variablesUserValido getUserValido() {
        return userValido;
    }
    public variablesUserIncorrecto getUserIncorrecto() {
        return userIncorrecto;
    }
    public String getHeader() {
        return header;
    }
    public String getCurrentPage() {
        return currentPage;
    }
    public String getFormatoIncorrect() {
        return formatoIncorrect;
    }
    public String getMesseErrorLogin() {
        return messeErrorLogin;
    }
}
