package tests.booking;

import day19.L4JLogging;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import steps.BaseSteps;
import steps.booking.MainPageSteps;
import steps.booking.SearchResultsSteps;

public class BookingMoskowRoomsByDate extends BaseSteps{
    String pagename = "https://booking.com";
    String city = "Moskow";

    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());

    @Test
    public void bookingMoskowRoomsByDateTest() {
        LOGGER.debug("start bookingMoskowRoomsByDateTest");
        BaseSteps.openPageAdress(pagename);
        MainPageSteps.enterCityName(city);
        MainPageSteps.datesInput();
        MainPageSteps.exactStartDate();
        MainPageSteps.exaxtLeaveDate();
        MainPageSteps.clickSearchButton();
        BaseSteps.ppageLoadTimeout();
        Assert.assertTrue(SearchResultsSteps.presentingsearchResults() == true);
        LOGGER.debug("end bookingMoskowRoomsByDateTest");
    }
}
