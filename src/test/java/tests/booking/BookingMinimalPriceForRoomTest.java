package tests.booking;

import day19.L4JLogging;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import steps.BaseSteps;
import steps.booking.MainPageSteps;
import steps.booking.SearchResultsSteps;

import static utils.TransformTextUtil.takePriceForDayFromSearchResult;
import static utils.TransformTextUtil.transformMaxPriceForRoom;

public class BookingMinimalPriceForRoomTest {
    String pageadress = "https://booking.com";
    String city = "Paris, Ile de France, France";
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());

    @Test
    public void comparisonOfRatingTest() {
        LOGGER.debug("start comparisonOfRatingTest");
        BaseSteps.openPageAdress(pageadress);
        MainPageSteps.enterCityName(city);
        MainPageSteps.datesInput();
        MainPageSteps.exactStartDate();
        MainPageSteps.exaxtLeaveDate();
        MainPageSteps.clickGuestsToggle();
        MainPageSteps.clickPlusAdultGuest();
        MainPageSteps.clickPlusAdultGuest();
        MainPageSteps.clickSearchButton();
        BaseSteps.ppageLoadTimeout();
        SearchResultsSteps.hooseMaxPriceInLeftSideMenu();
        SearchResultsSteps.fluentWait();
        SearchResultsSteps.pickHighestStarsSelector();
        SearchResultsSteps.fluentWait();
        Assert.assertTrue(takePriceForDayFromSearchResult() <= transformMaxPriceForRoom());
        LOGGER.debug("end comparisonOfRatingTest");
    }
}



