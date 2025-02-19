package test;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.loginPage;

public class loginTest extends BaseTest {
    @Test
    public void testUserNoLogeado() {
        loginPage.userLogeado();
    }
}
