package tests.booking;

import org.junit.Assert;
import org.junit.Test;
import steps.bookingBaseSteps.BaseSteps;
import pages.booking.CurrencyAndLanguagePopupPage;

public class BookingCurrencyLanguage extends BaseSteps  {

    String pageadress = "https://booking.com";
    String currensyTextEtalon = "Choose your currency";
    String languageTextEtalon = "Choose your language";

    @Test
    public void currensyTooltipTest() {
        BaseSteps.openPageAdress(pageadress);
        CurrencyAndLanguagePopupPage.dragMouseToCurrensyField();
        Assert.assertTrue(CurrencyAndLanguagePopupPage.getTextFromCurrensyPupup()
                .equals(currensyTextEtalon));
    }

    @Test
    public void languageTooltipTest() {
        BaseSteps.openPageAdress(pageadress);
        CurrencyAndLanguagePopupPage.dragMouseToLanguageField();
        Assert.assertTrue(CurrencyAndLanguagePopupPage.getTextFromLanguagePupup()
                .equals(languageTextEtalon));

    }
}




