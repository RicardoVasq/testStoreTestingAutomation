package test;

import base.BaseTest;
import com.beust.ah.A;
import org.openqa.selenium.bidi.log.Log;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.loginPage;
import utils.Logs;
import utils.testData.reader.variablesReader;

public class ForgotPasswordTest extends BaseTest {
    @Test
    public void testTitleAndBreadcrumbValidte() {
        Logs.debug("Nos dirigimos a la pagina de Forgot your password");
        ForgotPasswordPage.urlForgotPassword();

        Logs.debug("Validamos que el titulo y que el breadcrumbs contengan el texto correcto");
        softAssertl.assertEquals(ForgotPasswordPage.captureHeaderPage(),
                variablesReader.variables().getForgotPasswordPage().getHeader());
        softAssertl.assertEquals(ForgotPasswordPage.captureCurrentPagelLabel(),
                variablesReader.variables().getForgotPasswordPage().getCurrentPage());


        softAssertl.assertAll();

    }

    @Test
    public void testMessegeForUser() {
        Logs.debug("Nos dirigimos a la pagina de Forgot your password");
        ForgotPasswordPage.urlForgotPassword();
        Logs.debug("Validamos que el texto indicativo tenga el texto correcto");
        Assert.assertEquals(ForgotPasswordPage.captureMessageIndicativeForUser(),
                variablesReader.variables().getForgotPasswordPage().getMessegeForUser());
    }

    @Test
    public void testValidateEmailField() {
        Logs.debug("Nos dirigimos a la pagina de Forgot your password");
        ForgotPasswordPage.urlForgotPassword();

        Logs.debug("Validamos que el elemento este visible");
        ForgotPasswordPage.visibleFieldEmail();

    }

    @Test
    public void testValidateFormatInFieldEmail() {
        Logs.debug("Nos dirigimos a la pagina de Forgot your password");
        ForgotPasswordPage.urlForgotPassword();

        Logs.debug("Digitamos un correo con formato invalido");
        ForgotPasswordPage.writeInFieldEmail(
                variablesReader.variables().getVariablesLogin().getFormatoIncorrect());

        Logs.debug("Damos click en el boton para obtener para realizar el reset de la contraseña");
        ForgotPasswordPage.clickSendResetLink();

        Logs.debug("Verificamos que la alerta de formato se muestre con el texto esperado");
        String menssageErrorFormatEmail = String.format("Please include an '@' in the email address. '%s' is missing an '@'.",
                variablesReader.variables().getVariablesLogin().getFormatoIncorrect());
        // Verificamos que el mensaje de error correspondiente se muestre.
        softAssertl.assertEquals(ForgotPasswordPage.messegeErrorFormatEmail(), menssageErrorFormatEmail);
        softAssertl.assertAll();

    }
}

