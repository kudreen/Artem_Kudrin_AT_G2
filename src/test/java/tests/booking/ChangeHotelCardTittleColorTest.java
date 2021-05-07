package tests.booking;

import day19.L4JLogging;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import steps.bookingBaseSteps.BaseSteps;
import steps.booking.MainPageSteps;
import steps.booking.SearchResultsSteps;
import utils.UtilChangeColors;

public class ChangeHotelCardTittleColorTest extends BaseSteps {

    String pagename = "https://booking.com";
    String city = "Moskow";
    String redRGBEtalon = "rgba(0, 113, 194, 1)";
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());

    @Test
    public void changingCssColorsTest() {
        LOGGER.debug("start changingCssColorsTest");
        BaseSteps.openPageAdress(pagename);
        MainPageSteps.enterCityName(city);
        MainPageSteps.clickSearchButton();
        UtilChangeColors.changeColors();
        String getTextColor2 = SearchResultsSteps.getTittleTextColor();
        Assert.assertTrue(redRGBEtalon.equals(getTextColor2));
        LOGGER.debug("end changingCssColorsTest");
    }
}

