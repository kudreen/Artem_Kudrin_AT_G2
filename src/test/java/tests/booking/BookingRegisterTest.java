package tests.booking;

import day19.L4JLogging;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import steps.BaseSteps;
import steps.booking.BookingRegisterTestSteps;
import steps.booking.CheckingForAlertInBookingAccount;
import steps.booking.ConfirmingRegistrationFronMailboxSteps;
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
        BookingRegisterTestSteps.clickRegisterButton();
        BookingRegisterTestSteps.sendMailAdress(GetMailAdressFromFileUtil.getEmailAdress());
        BaseSteps.implicitlyWait();
        BookingRegisterTestSteps.confirmMailAdress();
        BaseSteps.implicitlyWait();
        BookingRegisterTestSteps.enterPassword(passwordForBooking);
        BaseSteps.implicitlyWait();
        BookingRegisterTestSteps.confirmPassword(passwordForBooking);
        BaseSteps.implicitlyWait();
        BookingRegisterTestSteps.submitPasswords();
        BaseSteps.implicitlyWait();
        BookingRegisterTestSteps.holdSubmitPasswords();
        BaseSteps.implicitlyWait();
        LOGGER.debug("end bookingRegisterTest");
    }


    @Test
    public void confirmingRegistrationFronMailbox() throws  InterruptedException {
        BaseSteps.openPageAdress(mainMailAdress);
        ConfirmingRegistrationFronMailboxSteps.loginEnterAdress(mailName);
        ConfirmingRegistrationFronMailboxSteps.clickLoginButton();
        BaseSteps.implicitlyWait();
        ConfirmingRegistrationFronMailboxSteps.loginEnterPass(passwordForMainMail);
        ConfirmingRegistrationFronMailboxSteps.loginClickPassButton();
        BaseSteps.implicitlyWait();
        ConfirmingRegistrationFronMailboxSteps.findAndClickConfirmationLetter();
        BaseSteps.implicitlyWait();
        ConfirmingRegistrationFronMailboxSteps.clickConfirmationButton();
    }

    @Test
    public void checkingForAlertInBookingAccount() throws IOException {
        BaseSteps.openPageAdress(pagename);
        CheckingForAlertInBookingAccount.clickLoginButton();
        BaseSteps.implicitlyWait();
        CheckingForAlertInBookingAccount.sendMailAdress(GetMailAdressFromFileUtil.getEmailAdress());
        BaseSteps.implicitlyWait();
        CheckingForAlertInBookingAccount.loginClickButton();
        BaseSteps.implicitlyWait();
        CheckingForAlertInBookingAccount.sendPass(passwordForBooking);
        BaseSteps.implicitlyWait();
        CheckingForAlertInBookingAccount.passClickButton();
        BaseSteps.implicitlyWait();
        CheckingForAlertInBookingAccount.profileButtonClick();
        BaseSteps.implicitlyWait();
        CheckingForAlertInBookingAccount.profileDropdownButtonClick();
        BaseSteps.implicitlyWait();
        CheckingForAlertInBookingAccount.personDetailsClick();
        BaseSteps.implicitlyWait();
        CheckingForAlertInBookingAccount.notification();
        Assert.assertTrue(CheckingForAlertInBookingAccount.notification() == true);

    }

}
