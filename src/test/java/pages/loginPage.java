package pages;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;

public class loginPage extends BaseTest {
    //Elementos del Login

    //Localizadores
    private static final By userInfo = By.xpath("//div[@id='_desktop_user_info']//span[contains(text(), 'Sign in')]");




    //Metodos Acción
    public static void userLogeado(){
        Assert.assertTrue(driver.findElement(userInfo).isDisplayed());
    }



}
