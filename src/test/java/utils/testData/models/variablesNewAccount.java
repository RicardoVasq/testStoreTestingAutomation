package utils.testData.models;

import base.BaseTest;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("newAccount")
public class variablesNewAccount {
    @JsonProperty("header")
    private String header;
    @JsonProperty("currentPage")
    private String currentPage;
    @JsonProperty("form")
    private variablesFormNewAccountLabels form;

    public String getHeader() {
        return header;
    }
    public String getCurrentPage() {
        return currentPage;
    }
    public variablesFormNewAccountLabels getForm() {
        return form;
    }
}
