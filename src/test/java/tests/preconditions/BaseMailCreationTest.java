package tests.preconditions;

import day19.L4JLogging;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import steps.bookingBaseSteps.BaseSteps;

import java.io.IOException;

public class BaseMailCreationTest extends BaseSteps {

    String pagename = "https://trashmail.com";
    String mirrorMailbox = "firestarter9797@mail.ru";
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());

    @BeforeTest
    public void createNewMailbox() throws IOException {
        LOGGER.debug("start createNewMailbox");
        BaseSteps.openPageAdress(pagename);
        steps.precondition.trashMail.BaseMailCreationPage.chooseDomain();
        steps.precondition.trashMail.BaseMailCreationPage.inputRealEmail(mirrorMailbox);
        steps.precondition.trashMail.BaseMailCreationPage.clickFormRedirectionsNumber();
        steps.precondition.trashMail.BaseMailCreationPage.clickExactNumbersOfRedirections();
        steps.precondition.trashMail.BaseMailCreationPage.clickDesableCapcha();
        steps.precondition.trashMail.BaseMailCreationPage.pushCreateButton();
        steps.precondition.trashMail.BaseMailCreationPage.getCreatedEmailName();
        LOGGER.debug("end createNewMailbox");
    }

}
