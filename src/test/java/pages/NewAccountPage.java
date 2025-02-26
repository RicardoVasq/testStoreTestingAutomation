package pages;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Logs;
import utils.testData.reader.variablesReader;

public class NewAccountPage extends BaseTest {
    //Localizadores
    private static final By headerPage = By.cssSelector("header[class='page-header']");
    private static final By currentPageLabel = By.cssSelector("nav[class='breadcrumb']");
    //Localizadores formulario
    private static final By radioButtonMister = By.id("field-id_gender-1");
    private static final By radioButtonMistress = By.id("field-id_gender-2");
    private static final By labelFieldFirstName = By.cssSelector("label[for='field-firstname']");
    private static final By fieldFirstName = By.id("field-firstname");
    private static final By labelFieldLastName = By.cssSelector("label[for='field-lasttname']");
    private static final By fieldLastName = By.id("field-lastname");
    private static final By labelFieldEmail = By.cssSelector("label[for='field-email']");
    private static final By fieldEmail = By.id("field-email");
    private static final By labelFieldPassword = By.cssSelector("label[for='field-password']");
    private static final By fieldPassword = By.id("field-password");
    private static final By labelFieldBirthday = By.cssSelector("label[for='field-Birthday']");
    private static final By fieldBirthday = By.id("field-Birthday");
    private static final By checkboxOffers = By.cssSelector("input[name='optin']");
    private static final By checkBoxTermsAndConditions = By.cssSelector("input[name='psgdpr']");
    private static final By checkBoxNewsletter = By.cssSelector("input[name='newsletter']");
    private static final By buttonSave = By.cssSelector("button[data-link-action='save-customer']");



    //Metodos
    public static void urlNewAccount(){
        Logs.debug("Navegamos hasta la pantalla de creación de nueva cuenta");
        loginPage.clickSignIn();
        loginPage.clickLinkNoAccount();
        Assert.assertEquals(driver.getCurrentUrl(), variablesReader.variables().getUrlPage().getRegistration());
    }
    public static String captureHeaderPage(){
        return driver.findElement(headerPage).getText();
    }
    public static String captureCurrentPagelLabel(){
        return driver.findElement(currentPageLabel).getText();
    }
    public static boolean visibleRadioButtonMister(){
        return driver.findElement(radioButtonMister).isDisplayed();
    }
    public static boolean visibleRadioButtonMistress(){
        return driver.findElement(radioButtonMistress).isDisplayed();
    }
    public static void clickRadioButtonMister(){driver.findElement(radioButtonMister).click();}
    public static void clickRadioButtonMistress(){driver.findElement(radioButtonMistress).click();}

    //Metodos para formulario
    public static String getLabelFieldFirstName(){
        return driver.findElement(labelFieldFirstName).getText();
    }
    public static boolean visibleFieldFirstName(){ return driver.findElement(fieldFirstName).isDisplayed();}
    public static void writeFirstName(String firstName){driver.findElement(fieldFirstName).sendKeys(firstName);}
    public static String getLabelFieldLastName(){
        return driver.findElement(labelFieldLastName).getText();
    }
    public static boolean visibleFieldLastName(){ return driver.findElement(fieldLastName).isDisplayed();}
    public static void writeLastName(String lastName){driver.findElement(fieldLastName).sendKeys(lastName);}
    public static String getLabelFieldEmail(){
        return driver.findElement(labelFieldEmail).getText();
    }
    public static boolean visibleFieldEmail(){ return driver.findElement(fieldEmail).isDisplayed();}
    public static void writeEmail(String email){driver.findElement(fieldEmail).sendKeys(email);}
    public static String getLabelPassword(){
        return driver.findElement(labelFieldPassword).getText();
    }
    public static boolean visibleFieldPassword(){ return driver.findElement(fieldPassword).isDisplayed();}
    public static void writePassword(String password){driver.findElement(fieldPassword).sendKeys(password);}
    public static String getLabelFieldBirthday(){
        return driver.findElement(labelFieldBirthday).getText();
    }
    public static boolean visibleFieldBirthday(){ return driver.findElement(fieldBirthday).isDisplayed();}
    public static void writeBirthday(String birthday){driver.findElement(fieldBirthday).sendKeys(birthday);}
    public static void setCheckboxOffers(){ driver.findElement(checkboxOffers).click();}
    public static boolean visibleCheckboxOffers(){ return driver.findElement(checkboxOffers).isDisplayed();}
    public static void setCheckBoxTermsAndConditions(){ driver.findElement(checkBoxTermsAndConditions).click();}
    public static boolean visibleCheckBoxTermsAndConditions(){ return driver.findElement(checkBoxTermsAndConditions).isDisplayed();}
    public static void setCheckBoxNewsletter(){ driver.findElement(checkBoxNewsletter).click();}
    public static boolean visibleCheckBoxNewsletter(){ return driver.findElement(checkBoxNewsletter).isDisplayed();}

}
