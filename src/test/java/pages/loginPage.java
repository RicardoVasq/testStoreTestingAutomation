package pages;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utils.Logs;

public class loginPage extends BaseTest {
    //Elementos del Login

    //Localizadores
    private static final By userInfo = By.xpath("//div[@id='_desktop_user_info']//span[contains(text(), 'Sign in')]");
    private static final By emailTextBox = By.id("field-email");
    private static final By passwordTextBox = By.id("field-password");
    private static final By buttonSignIn = By.id("submit-login");
    private static final By closeSesion = By.cssSelector("span[class='hidden-sm-down']");
    private static final By nameUser = By.cssSelector(".user-info .account .hidden-sm-down");



    //Metodos Acción
    public static void userNoLogeado(){
        Assert.assertTrue(driver.findElement(userInfo).isDisplayed());
    }
    public static void loginUser(String email, String password){
        Logs.debug("Damos click a Sign In");
        driver.findElement(userInfo).click();

        Logs.info("Validamos que elementos existan en el DOM");
        softAssertl.assertTrue( driver.findElement(emailTextBox).isDisplayed());
        softAssertl.assertTrue(driver.findElement(passwordTextBox).isDisplayed());
        softAssertl.assertAll();

        Logs.debug("Ingresamos credenciales para logeo");
        driver.findElement(emailTextBox).sendKeys(email);
        driver.findElement(passwordTextBox).sendKeys(password);

        Logs.debug("Iniciamos sesion");
        driver.findElement(buttonSignIn).click();
    }
    public static void infoUser(String name){
        Assert.assertEquals(driver.findElement(nameUser).getText(),name);
    }



}
