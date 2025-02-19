package utils.testData.reader;

import io.qameta.allure.internal.shadowed.jackson.databind.ObjectMapper;
import utils.Logs;
import utils.testData.models.variables;
import utils.testData.models.variablesLogin;

import java.io.File;
import java.io.IOException;

public class variablesReader {
    private final static String variablePath = "src/test/java/utils/testData/testData.json";

    public static variables variables(){
        final var objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new File(variablePath), variables.class);
        }catch (IOException ioException){
            Logs.error("IOException: %s", ioException.getLocalizedMessage());
            throw new RuntimeException();
        }
    }
}
