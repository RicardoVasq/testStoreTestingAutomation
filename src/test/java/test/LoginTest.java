package test;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.loginPage;
import utils.Logs;
import utils.testData.reader.variablesReader;

public class LoginTest extends BaseTest {
    @Test
    public void testUserNoLogeado() {
        Logs.debug("Validamos que el usuario no este logeado");
        loginPage.userNoLogeado();
    }

    @Test
    public void testLoginUsarioValido() {
        Logs.debug("Realizamos el login con credenciales validas");
        loginPage.loginUser(variablesReader.variables().getVariablesLogin().getUserValido().getEmail(),
                variablesReader.variables().getVariablesLogin().getUserValido().getPassword());

        Logs.debug("Validamos el ingreso correcto del usuario");
        loginPage.infoUser(variablesReader.variables().getVariablesLogin().getUserValido().getName());

    }
}
