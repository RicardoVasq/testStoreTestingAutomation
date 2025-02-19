package utils.testData.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("variablesLogin")
public class variablesLogin {
    @JsonProperty("userValido")
    private variablesUserValido userValido;
    @JsonProperty("userIncorrecto")
    private variablesUserIncorrecto userIncorrecto;

    public variablesUserValido getUserValido() {
        return userValido;
    }

    public variablesUserIncorrecto getUserIncorrecto() {
        return userIncorrecto;
    }
}
