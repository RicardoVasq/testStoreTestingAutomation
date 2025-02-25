package utils.testData.models;

import base.BaseTest;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("newAccount")
public class variablesNewAccount extends BaseTest {
    @JsonProperty("header")
    private String header;
    @JsonProperty("currentPage")
    private String currentPage;

    public String getHeader() {
        return header;
    }
    public String getCurrentPage() {
        return currentPage;
    }
}
