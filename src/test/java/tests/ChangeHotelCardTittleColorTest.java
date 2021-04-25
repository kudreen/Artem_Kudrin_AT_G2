package tests;

import org.junit.*;
import pages.BookingPage;
import steps.СhangeHotelCardTittleColorSteps;
import steps.BaseSteps;
import utils.UtilChangeColors;

public class ChangeHotelCardTittleColorTest extends BaseSteps {

    @Test
    public void changingCssColorsTest() {
        BookingPage.openBookingPage();
        СhangeHotelCardTittleColorSteps.enterCityName();
        СhangeHotelCardTittleColorSteps.pushFindButton();
        UtilChangeColors.changeColors();
        String getTextColor = СhangeHotelCardTittleColorSteps.getTittleTextColor();
        String redRGBEtalon = "rgba(0, 113, 194, 1)";
        Assert.assertTrue(redRGBEtalon.equals(getTextColor));
    }
}

