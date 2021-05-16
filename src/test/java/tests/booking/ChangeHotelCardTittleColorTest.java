package tests.booking;

import day19.L4JLogging;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import steps.bookingBaseSteps.BaseSteps;
import pages.booking.MainpagePage;
import pages.booking.SearchResultsPage;
import utils.UtilChangeColors;

public class ChangeHotelCardTittleColorTest extends BaseSteps {

    String pagename = "https://booking.com";
    String city = "Moskow";
    String redRGBEtalon = "rgba(0, 113, 194, 1)";
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());

    @Test
    public void changingCssColorsTest() {
        LOGGER.debug("start changingCssColorsTest");
        openPageAdress(pagename);
        MainpagePage.enterCityName(city);
        MainpagePage.clickSearchButton();
        UtilChangeColors.changeColors();
        String getTextColor2 = SearchResultsPage.getTittleTextColor();
        Assert.assertTrue(redRGBEtalon.equals(getTextColor2));
        LOGGER.debug("end changingCssColorsTest");
    }
}

