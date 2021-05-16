package tests.booking;

import org.junit.Assert;
import org.junit.Test;
import pages.booking.BookingCheckingHeartColorSteps;
import steps.bookingBaseSteps.BaseSteps;

import static steps.bookingBaseSteps.BaseSteps.implicitlyWait;


public class BookingCheckingHeartColorTest  {

    String pagename = "https://booking.com";
    String mailAdress = "toptoptoptop@trashmail.com";
    String password = "Aa123456789";
    String city = "Madrid";
    String colorEtalon = "rgba(51, 51, 51, 1)";

    @Test
    public void heartColorTest()  {
        BaseSteps.openPageAdress(pagename);
        BookingCheckingHeartColorSteps booking = null;
        booking.clickLoginButton();
        booking.sendMailAdress(mailAdress);
        booking.loginClickButton();
        implicitlyWait();
        booking.sendPass(password);
        booking.passClickButton();
        booking.closeWelcomPopup();
        booking.citySearchInput(city);
        booking.datePick();
        booking.searchButtonClick();
        booking.firstCardAddToFavorites();
        booking.lastCardAddToFavorites();
        Assert.assertTrue(booking.getHartColor().equals(colorEtalon));
    }
}
