package tests.booking;

import day19.L4JLogging;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import steps.bookingBaseSteps.BaseSteps;
import pages.booking.MainpagePage;
import pages.booking.SearchResultsPage;

import static utils.TransformTextUtil.takePriceForDayFromSearchResult;
import static utils.TransformTextUtil.transformMaxPriceForRoom;

public class BookingMinimalPriceForRoomTest extends BaseSteps {
    String pageadress = "https://booking.com";
    String city = "Paris, Ile de France, France";
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());

    @Test
    public void comparisonOfRatingTest() {
        LOGGER.debug("start comparisonOfRatingTest");
        openPageAdress(pageadress);
        MainpagePage.enterCityName(city);
        MainpagePage.datesInput();
        MainpagePage.exactStartDate();
        MainpagePage.exaxtLeaveDate();
        MainpagePage.clickGuestsToggle();
        MainpagePage.clickPlusAdultGuest();
        MainpagePage.clickPlusAdultGuest();
        MainpagePage.clickSearchButton();
        ppageLoadTimeout();
        SearchResultsPage.hooseMaxPriceInLeftSideMenu();
        fluentWait();
        SearchResultsPage.pickHighestStarsSelector();
        Assert.assertTrue(takePriceForDayFromSearchResult() <= transformMaxPriceForRoom());
        LOGGER.debug("end comparisonOfRatingTest");
    }
}



