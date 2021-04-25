package tests;

import gherkin.lexer.Th;
import org.junit.*;
import pages.BookingPage;
import steps.*;
import utils.UtilChangeColors;

import org.junit.Test;

import java.util.concurrent.TimeUnit;


public class BookingRegisterTest extends BaseMailCreationSteps {
    @Test
    public void registerTest() {
        BookingPage.openBookingPage();
        BookingRegisterTestSteps register = null;
        register.clickRegisterButton();
        register.sendMailAdress();
        register.confirmMailAdress();
        register.enterPassword();
        register.confirmPassword();
        register.submitPasswords();
    }

    @Test
    public void confirmingRegistrationFronMailbox() throws InterruptedException {
        ConfirmingRegistrationFronMailboxTest mailbox = null;
        mailbox.openMailBox();
        mailbox.loginEnterAdress();
        mailbox.loginClickButton();
        mailbox.loginEnterPass();
        BaseSteps.scriptLoadTimeout();
       // Thread.sleep(9000);
        mailbox.loginClickPassButton();
        //Thread.sleep(9000);
        BaseSteps.scriptLoadTimeout();
        mailbox.findAndClickConfirmationLetter();
        BaseSteps.scriptLoadTimeout();
      // Thread.sleep(9000);
        mailbox.clickConfirmationButton();

    }

    @Test
    public void checkingForAlertInBookingAccount() {
        BookingPage.openBookingPage();
        CheckingForAlertInBookingAccount step = null;
        step.clickLoginButton();
        BaseSteps.scriptLoadTimeout();
        step.sendMailAdress();
        BaseSteps.scriptLoadTimeout();
        step.loginClickButton();
        BaseSteps.scriptLoadTimeout();
        step.sendPass();
        BaseSteps.scriptLoadTimeout();
        step.passClickButton();
        BaseSteps.scriptLoadTimeout();
        step.profileButtonClick();
        BaseSteps.scriptLoadTimeout();
        step.profileDropdownButtonClick();
        BaseSteps.scriptLoadTimeout();
        step.personDetailsClick();
        BaseSteps.scriptLoadTimeout();
        step.notification();
        
    }

}
