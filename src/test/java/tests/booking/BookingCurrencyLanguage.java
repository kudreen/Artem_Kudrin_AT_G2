package tests.booking;

import org.junit.Assert;
import org.junit.Test;
import steps.bookingBaseSteps.BaseSteps;
import steps.booking.CurrencyAndLanguagePopupSteps;

public class BookingCurrencyLanguage extends BaseSteps {

    String pageadress = "https://booking.com";
    String currensyTextEtalon = "Choose your currency";
    String languageTextEtalon = "Choose your language";

    @Test
    public void currensyTooltipTest() {
        BaseSteps.openPageAdress(pageadress);
        CurrencyAndLanguagePopupSteps.dragMouseToCurrensyField();
        Assert.assertTrue(CurrencyAndLanguagePopupSteps.getTextFromCurrensyPupup()
                .equals(currensyTextEtalon));
    }

    @Test
    public void languageTooltipTest() {

        CurrencyAndLanguagePopupSteps.dragMouseToLanguageField();
        Assert.assertTrue(CurrencyAndLanguagePopupSteps.getTextFromLanguagePupup()
                .equals(languageTextEtalon));

    }
}




