package test;

import base.BaseTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.loginPage;
import utils.Logs;
import utils.testData.reader.variablesReader;

public class LoginTest extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);

    @Test
    public void testUserNotLogin() {
        // Validamos que el usuario no esté logeado al intentar acceder a la página de login.
        Logs.debug("Validamos que el usuario no este logeado");
        loginPage.userNoLogeado();
    }

    @Test
    public void testLoginUserValid() {
        // Realizamos el login utilizando credenciales válidas y verificamos el ingreso correcto.
        Logs.debug("Realizamos el login con credenciales validas");
        loginPage.loginUser(variablesReader.variables().getVariablesLogin().getUserValido().getEmail(),
                variablesReader.variables().getVariablesLogin().getUserValido().getPassword());

        // Verificamos que el nombre del usuario se muestra correctamente después del login.
        Logs.debug("Validamos el ingreso correcto del usuario");
        loginPage.infoUser(variablesReader.variables().getVariablesLogin().getUserValido().getName());
    }

    @Test
    public void testVerifierTitlePage() {
        // Damos click en el botón 'Sign In' para ir a la página de login.
        Logs.debug("Damos click en Sign In");
        loginPage.clickSignIn();

        // Validamos que el título de la página contenga el texto esperado.
        Logs.debug("Validamos que el Titulo de la pagina contega el texto esperado");
        softAssertl.assertEquals(loginPage.headerPageLogin(),
                variablesReader.variables().getVariablesLogin().getHeader());

        // Validamos que el subtítulo de la página sea el esperado.
        Logs.debug("Validamos el contenido del subtitulo current page");
        softAssertl.assertEquals(loginPage.messagePageLabel(),
                variablesReader.variables().getVariablesLogin().getCurrentPage());
        Logs.debug("currentpage %s",loginPage.messagePageLabel());

        softAssertl.assertAll();
    }

    @Test
    public void testShowHidePasswordButton() {
        // Damos click en el botón 'Sign In' para ir a la página de login.
        Logs.debug("Nos dirigimos a la pagina de Login");
        loginPage.clickSignIn();

        // Introducimos una contraseña en el campo correspondiente.
        Logs.debug("Digitamos en el campo de password");
        loginPage.setPasswordTextBox(variablesReader.variables().getVariablesLogin().getUserValido().getPassword());

        // Verificamos que la contraseña esté ofuscada (tipo 'password').
        Logs.debug("Validmos que la contraseña se encuentre ofuscada");
        softAssertl.assertEquals(loginPage.typePasswordTextBox(),"password");

        // Cambiamos la visibilidad de la contraseña al hacer click en el botón para mostrarla.
        Logs.debug("Ingresamos una contraseña");
        loginPage.setPasswordTextBox(variablesReader.variables().getVariablesLogin().getUserValido().getPassword());

        Logs.debug("Damos click en boton para mostrar contraseña");
        loginPage.setHideShowPasswordButton();

        // Verificamos que la contraseña se muestre en texto claro (tipo 'text').
        Logs.debug("Validamos que la contraseña se muestre");
        softAssertl.assertEquals(loginPage.typePasswordTextBox(),"text");

    }

    @Test
    public void testLoginWithoutData() {
        // Accedemos a la página de login.
        Logs.debug("Nos dirigimos a la pagina de Login");
        loginPage.clickSignIn();

        // Intentamos hacer login sin ingresar ningún dato.
        Logs.debug("Intentamos logearnos sin ingresar sin ingresar datos");
        loginPage.setButtonSignIn();

        // Validamos que la alerta de campo requerido se muestre.
        Logs.debug("Validamos que la alerta sea visible");
        softAssertl.assertEquals(loginPage.messageRequeridElementEmail(),"Please fill out this field.");

        // Ingresamos un email y volvemos a intentar hacer login sin password.
        Logs.debug("Ingresamos data en el campo de Email");
        loginPage.setEmailTextBox(variablesReader.variables().getVariablesLogin().getUserValido().getEmail());

        // Validamos que la alerta de campo requerido para password se muestre.
        Logs.debug("Intentamos ingresar sin digitar el password");
        loginPage.setButtonSignIn();

        Logs.debug("Validamos que la alerta sea visible");
        softAssertl.assertEquals(loginPage.messageRequeridElementPassword(),"Please fill out this field.");
        softAssertl.assertAll();

    }

    @Test
    public void testFormatEmailTextBox() {
        // Accedemos a la página de login.
        Logs.debug("Nos dirigimos a la pagina de Login");
        loginPage.clickSignIn();

        // Intentamos ingresar un email con formato incorrecto.
        Logs.debug("Ingresamos un data sin el formato correcto en el campo email");
        loginPage.setEmailTextBox(variablesReader.variables().getVariablesLogin().getFormatoIncorrect());

        // Preparamos el mensaje de error esperado en caso de formato incorrecto.
        String menssageErrorFormatEmail = String.format("Please include an '@' in the email address. '%s' is missing an '@'.",
                variablesReader.variables().getVariablesLogin().getFormatoIncorrect());

        // Verificamos que el mensaje de error correspondiente se muestre.
        softAssertl.assertEquals(loginPage.messageRequeridElementEmail(), menssageErrorFormatEmail);

        softAssertl.assertAll();

    }

    @Test
    public void testLoginIncorrect() {
        // Accedemos a la página de login.
        Logs.debug("Nos dirigimos a la pagina de Login");
        loginPage.clickSignIn();

        // Realizamos el login utilizando credenciales incorrecta.
        Logs.debug("Realizamos el login con credenciales Incorrectas");
        loginPage.loginUser(variablesReader.variables().getVariablesLogin().getUserIncorrecto().getEmail(),
                variablesReader.variables().getVariablesLogin().getUserIncorrecto().getPassword());

        // Verificamos que el mensaje de error sea visible
        Logs.debug("Verificamos que el mensaje de error sea visible");
        softAssertl.assertTrue(loginPage.visibleErrorMessegeLogin());

        //Validamos el contenido del mensaje de error
        Logs.debug("Validamos el contenido del mensaje de error");
        softAssertl.assertEquals(loginPage.setErrorMessegeLogin(),
                variablesReader.variables().getVariablesLogin().getMesseErrorLogin());
        softAssertl.assertAll();

    }

    @Test
    public void testLinkForgotPassword() {
        // Accedemos a la página de login.
        Logs.debug("Nos dirigimos a la pagina de Login");
        loginPage.clickSignIn();

        //Damos click en el link de Forgot your pasword?
        Logs.debug("Damos click en el link de Forgot you password");
        loginPage.clickLinkForgotPasword();

        //Verificamos quee nos redireccione a la pagina correcta
        Logs.debug("Verificamos la URL donde nos redirecciona");
        Assert.assertEquals(loginPage.captureUrlCurrent(),variablesReader.variables().getUrlPage().getForgotPassword());
    }

    @Test
    public void testLinkRegistration() {
        // Accedemos a la página de login.
        Logs.debug("Nos dirigimos a la pagina de Login");
        loginPage.clickSignIn();

        //Damos click en el link de Forgot your pasword?
        Logs.debug("Damos click en el link de Forgot you password");
        loginPage.clickLinkNoAccount();
        Assert.assertEquals(loginPage.captureUrlCurrent(),variablesReader.variables().getUrlPage().getRegistration());

    }

}



