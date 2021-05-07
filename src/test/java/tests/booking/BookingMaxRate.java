package tests.booking;

import org.junit.Assert;
import org.junit.Test;
import steps.bookingBaseSteps.BaseSteps;
import steps.booking.MainPageSteps;
import steps.booking.SearchResultsSteps;
import utils.TransformTextUtil;

public class BookingMaxRate extends BaseSteps {

    String cityName = "Москва";
    String pageName = "https://booking.com";
    int etalonRating = 9;
    

    @Test
    public void comparisonOfRatingTest() throws InterruptedException {
        BaseSteps.openPageAdress(pageName);
        MainPageSteps.enterCityName(cityName);
        MainPageSteps.clickSearchButton();
        SearchResultsSteps.pickHighestStarsSelector();
        BaseSteps.fluentWait();
        SearchResultsSteps.clickFirstCardInSearchResults();
        BaseSteps.switchActualPage();
        BaseSteps.ppageLoadTimeout();
        Assert.assertTrue(TransformTextUtil.ratingFromHotelPageInteger() >= etalonRating);
    }
}

