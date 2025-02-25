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

}
