package tests.preconditions;

import day19.L4JLogging;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import steps.BaseSteps;
import steps.precondition.trashMail.BaseMailCreationSteps;

import java.io.IOException;

public class BaseMailCreationTest extends BaseSteps {

    String pagename = "https://trashmail.com";
    String mirrorMailbox = "firestarter9797@mail.ru";
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());

    @BeforeTest
    public void createNewMailbox() throws IOException {
        LOGGER.debug("start createNewMailbox");
        BaseSteps.openPageAdress(pagename);
        BaseMailCreationSteps.chooseDomain();
        BaseMailCreationSteps.inputRealEmail(mirrorMailbox);
        BaseMailCreationSteps.clickFormRedirectionsNumber();
        BaseMailCreationSteps.clickExactNumbersOfRedirections();
        BaseMailCreationSteps.clickDesableCapcha();
        BaseMailCreationSteps.pushCreateButton();
        BaseMailCreationSteps.getCreatedEmailName();
        LOGGER.debug("end createNewMailbox");
    }

}
