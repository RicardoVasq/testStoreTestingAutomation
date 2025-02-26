package test;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.NewAccountPage;
import utils.Logs;
import utils.testData.reader.variablesReader;

public class NewAccountTest extends BaseTest {

    @Test
    public void testRedireccionNewAccount() {
        NewAccountPage.urlNewAccount();
    }

    @Test
    public void testVisibleElementsForm() {
        NewAccountPage.urlNewAccount();

        Logs.debug("Validamos que los radiobutton de 'Social title' sean visibles");
        NewAccountPage.visibleRadioButtonMister();
        NewAccountPage.visibleRadioButtonMistress();

        Logs.debug("Validamos que el campo de 'First Name'");
        NewAccountPage.visibleFieldFirstName();
        Logs.debug("Validamos que el label contenga el texto correcto");
        softAssertl.assertEquals(NewAccountPage.getLabelFieldFirstName(),
                variablesReader.variables().getNewAccount().getForm().getLabelFirstName());


        Logs.debug("Validamos que el campo de 'Last Name'");
        NewAccountPage.visibleFieldLastName();
        Logs.debug("Validamos que el label contenga el texto correcto");
        softAssertl.assertEquals(NewAccountPage.getLabelFieldLastName(),
                variablesReader.variables().getNewAccount().getForm().getLabelLastName());


        Logs.debug("Validamos que el campo de 'Email'");
        NewAccountPage.visibleFieldEmail();
        Logs.debug("Validamos que el label contenga el texto correcto");
        softAssertl.assertEquals(NewAccountPage.getLabelFieldEmail(),
                variablesReader.variables().getNewAccount().getForm().getLabelEmail());

        Logs.debug("Validamos que el campo de 'Password'");
        NewAccountPage.visibleFieldPassword();
        Logs.debug("Validamos que el label contenga el texto correcto");
        softAssertl.assertEquals(NewAccountPage.getLabelPassword(),
                variablesReader.variables().getNewAccount().getForm().getLabelPassword());

        Logs.debug("Verificamos que el checkbox de 'offers' sea visible");
        NewAccountPage.visibleCheckboxOffers();

        Logs.debug("Verificamos que el checkbox de 'Terms and conditions' sea visible");
        NewAccountPage.visibleCheckBoxTermsAndConditions();

        Logs.debug("Verificamos que el checkbox de 'newsletter' sea visible");
        NewAccountPage.visibleCheckBoxNewsletter();

        softAssertl.assertAll();

    }

    @Test
    public void testValidateFiledFirstName() {
        NewAccountPage.urlNewAccount();

    }


}
