package tests.booking;

import day19.L4JLogging;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import steps.bookingBaseSteps.BaseSteps;
import pages.booking.BookingRegisterTestPage;
import pages.booking.CheckingForAlertInBookingAccountPage;
import pages.booking.ConfirmingRegistrationFronMailboxPage;
import tests.preconditions.BaseMailCreationTest;
import utils.GetMailAdressFromFileUtil;

import java.io.IOException;


public class BookingRegisterTest extends BaseMailCreationTest {

    String pagename = "https://booking.com";
    String passwordForBooking = "Aa1234567890";
    String mainMailAdress = "https://mail.ru/";
    String mailName = "firestarter9797";
    String passwordForMainMail = "12345678ytrewq";
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());


    @Test
    public void bookingRegisterTest() throws IOException {
        LOGGER.debug("start bookingRegisterTest");
        BaseSteps.openPageAdress(pagename);
        BookingRegisterTestPage.clickRegisterButton();
        BookingRegisterTestPage.sendMailAdress(GetMailAdressFromFileUtil.getEmailAdress());
        BaseSteps.implicitlyWait();
        BookingRegisterTestPage.confirmMailAdress();
        BookingRegisterTestPage.enterPassword(passwordForBooking);
        BookingRegisterTestPage.confirmPassword(passwordForBooking);
        BookingRegisterTestPage.submitPasswords();
        BookingRegisterTestPage.holdSubmitPasswords();
        LOGGER.debug("end bookingRegisterTest");
    }


    @Test
    public void confirmingRegistrationFronMailbox() {
        BaseSteps.openPageAdress(mainMailAdress);
        ConfirmingRegistrationFronMailboxPage.loginEnterAdress(mailName);
        ConfirmingRegistrationFronMailboxPage.clickLoginButton();
        BaseSteps.implicitlyWait();
        ConfirmingRegistrationFronMailboxPage.loginEnterPass(passwordForMainMail);
        ConfirmingRegistrationFronMailboxPage.loginClickPassButton();
        ConfirmingRegistrationFronMailboxPage.findAndClickConfirmationLetter();
        ConfirmingRegistrationFronMailboxPage.clickConfirmationButton();
    }

    @Test
    public void checkingForAlertInBookingAccount() throws IOException {
        BaseSteps.openPageAdress(pagename);
        CheckingForAlertInBookingAccountPage.clickLoginButton();
        BaseSteps.implicitlyWait();
        CheckingForAlertInBookingAccountPage.sendMailAdress(GetMailAdressFromFileUtil.getEmailAdress());
        CheckingForAlertInBookingAccountPage.loginClickButton();
        CheckingForAlertInBookingAccountPage.sendPass(passwordForBooking);
        CheckingForAlertInBookingAccountPage.passClickButton();
        CheckingForAlertInBookingAccountPage.profileButtonClick();
        CheckingForAlertInBookingAccountPage.profileDropdownButtonClick();
        CheckingForAlertInBookingAccountPage.personDetailsClick();
        CheckingForAlertInBookingAccountPage.notification();
        Assert.assertTrue(CheckingForAlertInBookingAccountPage.notification() == true);

    }

}
