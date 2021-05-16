package tests.booking;

import day19.L4JLogging;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import steps.bookingBaseSteps.BaseSteps;
import pages.booking.MainpagePage;
import pages.booking.SearchResultsPage;

public class BookingMoskowRoomsByDate extends BaseSteps{
    String pagename = "https://booking.com";
    String city = "Moskow";

    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());

    @Test
    public void bookingMoskowRoomsByDateTest() {
        LOGGER.debug("start bookingMoskowRoomsByDateTest");
        openPageAdress(pagename);
        MainpagePage.enterCityName(city);
        MainpagePage.datesInput();
        MainpagePage.exactStartDate();
        MainpagePage.exaxtLeaveDate();
        MainpagePage.clickSearchButton();
        ppageLoadTimeout();
        Assert.assertTrue(SearchResultsPage.presentingsearchResults() == true);
        LOGGER.debug("end bookingMoskowRoomsByDateTest");
    }
}
