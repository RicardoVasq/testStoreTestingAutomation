package test;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.NewAccountPage;

public class NewAccountTest extends BaseTest {

    @Test
    public void testRedireccionNewAccount() {
        NewAccountPage.urlNewAccount();
    }
}
