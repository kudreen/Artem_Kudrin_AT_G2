package pages.booking;

import org.openqa.selenium.By;

public class BookingSerchResultsPage {

    public static By tenElementInResults() {
        By obj = By.className("sr-hotel__name");
        return obj;
    }

    public static By presentigSearchResultOnPage() {
        By obj = By.xpath("//*[@id='hotellist_inner']");
        return obj;
    }

    public static By chooseMaxPriceInLeftSideMenu() {
        By obj = By.xpath("//*[contains(@data-id, 'pri-5')]");
        return obj;
    }

    public static By fluentSpinnerWait() {
        By obj = By.cssSelector(".bui-spinner.bui-spinner--size-large");
        return obj;
    }

    public static By highestStarsSelector() {
        By obj = By.xpath("//ul[contains(@role, 'menubar')]/child::*[3]");
        return obj;
    }

    public static By priseFromFirstCard() {
        By obj = By.xpath("//*[contains(@class, 'bui-price-display__value prco-inline-block-maker-helper')]");
        return obj;
    }

    public static By firstCardInSearchResults() {
        By obj = By.xpath("//*[@id='hotellist_inner']/child::*[1]//*[contains(@class, 'sr-hotel__name')]");
        return obj;
    }

        public static By ratingFildInHotelPage(){
            By obj = By.xpath("(//div[@class='bui-review-score__badge'])[1]");
            return obj;
        }


}
