package pages.booking;
import org.openqa.selenium.By;

public class BookingMainPage {

    public static By loginButton() {
        By obj = By.xpath("//*[contains(@class, '-vertical-align-middle')]/child::*[6]");
        return obj;
    }

    public static By cityInput() {
        By obj = By.xpath("//*[@id='ss']");
        return obj;
    }

    public static By dateInput(){
        By obj = By.xpath("//*[contains(@class, 'xp__dates xp__group')]");
        return obj;
    }

    public static By date2021_05_01() {
        By obj = By.xpath("//*[contains(@data-date, '2021-05-01')]");
        return obj;
    }

    public static By date2021_05_07() {
        By obj = By.xpath("//*[contains(@data-date, '2021-05-07')]");
        return obj;
    }

    public static By searchButton() {
        By obj = By.xpath("//*[contains(@class, 'xp__button')]");
        return obj;
    }

    public static By guestsToggle() {
        By obj = By.xpath("//*[@id='xp__guests__toggle']");
        return obj;
    }

    public static By plusAdultGuestBUtton(){
        By obj = By.xpath("//*[contains(@aria-label, 'Increase number of Adults')]");
        return obj;
    }

    public static By registerButton(){
        By obj = By.xpath("//*[contains(@class, '-vertical-align-middle')]/child::*[5]");
        return obj;
    }






}
