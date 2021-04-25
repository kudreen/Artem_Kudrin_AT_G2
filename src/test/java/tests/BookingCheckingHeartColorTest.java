package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.BookingPage;
import steps.BaseSteps;
import steps.BookingCheckingHeartColorSteps;

public class BookingCheckingHeartColorTest extends BaseSteps {

    @Test
    public void heartColorTest() throws InterruptedException {
        BookingPage.openBookingPage();
        BookingCheckingHeartColorSteps booking = null;
        booking.clickLoginButton();
        booking.sendMailAdress();
        booking.loginClickButton();
        Thread.sleep(5000);
        booking.sendPass();
        Thread.sleep(5000);
        booking.passClickButton();
        Thread.sleep(5000);
        booking.citySearchInput();
        booking.datePick();
        booking.searchButtonClick();
        booking.firstCardAddToFavorites();
        booking.lastCardAddToFavorites();
        String color = booking.getHartColor();
        String colorEtalon = "rgba(51, 51, 51, 1)";
        Assert.assertTrue(color.equals(colorEtalon));
    }

    @Test
    public void myNextTripTest() throws InterruptedException {
        BookingPage.openBookingPage();
        BookingCheckingHeartColorSteps booking = null;
        booking.clickLoginButton();
        booking.sendMailAdress();
        booking.loginClickButton();
        Thread.sleep(5000);
        booking.sendPass();
        Thread.sleep(5000);
        booking.passClickButton();
        Thread.sleep(5000);
        booking.citySearchInput();
        booking.datePick();
        booking.searchButtonClick();
        booking.firstCardAddToFavorites();
        booking.lastCardAddToFavorites();
        //доделать проверку заголвков


    }
}
