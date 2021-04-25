package tests;

import org.testng.annotations.BeforeTest;
import pages.TrashmailPage;
import steps.BaseMailCreationSteps;
import steps.BaseSteps;

public class BaseMailCreationTest extends BaseSteps {

    @BeforeTest
    public void createNewMailbox(){
        TrashmailPage.openTrashmailPage();
        BaseMailCreationSteps.chooseNewUserTab();
        BaseMailCreationSteps.inputPass();
        BaseMailCreationSteps.confirmPass();
        BaseMailCreationSteps.clickSubmitButton();
    }

}
