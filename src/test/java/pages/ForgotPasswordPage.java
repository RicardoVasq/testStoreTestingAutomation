package pages;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Logs;
import utils.testData.reader.variablesReader;

public class ForgotPasswordPage extends BaseTest {

    //Localizadores
    private static final By headerPage = By.cssSelector("header[class='page-header']");
    private static final By currentPageLabel = By.cssSelector("nav[class='breadcrumb']");
    private static final By messageIndicativeForUser = By.cssSelector("p[class='send-renew-password-link']");
    private static final By fieldEmail = By.id("email");
    private static final By buttonSendResetLink = By.id("send-reset-link");

    //Metodos
    public static void urlForgotPassword(){
        Logs.debug("Navegamos hasta la pantalla de recuperacion de contraseña");
        loginPage.clickSignIn();
        loginPage.clickLinkForgotPasword();
        Assert.assertEquals(driver.getCurrentUrl(),variablesReader.variables().getUrlPage().getForgotPassword());
    }
    public static String captureHeaderPage(){
        return driver.findElement(headerPage).getText();
    }
    public static String captureCurrentPagelLabel(){
        return driver.findElement(currentPageLabel).getText();
    }
    public static String captureMessageIndicativeForUser(){
        return driver.findElement(messageIndicativeForUser).getText();
    }
    public static void visibleFieldEmail(){
        driver.findElement(fieldEmail).isDisplayed();
    }
    public static void writeInFieldEmail(String email){
        Logs.debug("Escribirmos un correo en el campo de Email");
        driver.findElement(fieldEmail).sendKeys(email);
    }
    public static void clickSendResetLink(){
        driver.findElement(buttonSendResetLink).click();
    }
    public static String messegeErrorFormatEmail(){
        return driver.findElement(fieldEmail).getAttribute("validationMessage");
    }
}
