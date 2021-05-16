package tests.booking;

import org.junit.Assert;
import org.junit.Test;
import steps.bookingBaseSteps.BaseSteps;
import pages.booking.MainpagePage;
import pages.booking.SearchResultsPage;
import utils.TransformTextUtil;

public class BookingMaxRate extends BaseSteps {

    String cityName = "Москва";
    String pageName = "https://booking.com";
    int etalonRating = 9;
    

    @Test
    public void comparisonOfRatingTest() throws InterruptedException {
        openPageAdress(pageName);
        MainpagePage.enterCityName(cityName);
        MainpagePage.clickSearchButton();
        SearchResultsPage.pickHighestStarsSelector();
        fluentWait();
        SearchResultsPage.clickFirstCardInSearchResults();
        switchActualPage();
        ppageLoadTimeout();
        Assert.assertTrue(TransformTextUtil.ratingFromHotelPageInteger() >= etalonRating);
    }
}

