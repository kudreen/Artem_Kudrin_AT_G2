package utils;

import static steps.booking.SearchResultsSteps.getPriceFromFirstCard;
import static steps.booking.SearchResultsSteps.getTexFromLeftSideMenu;

public class TransformTextUtil {


    public static String minPriceForRoom() {
        String minPriceForRoomTakeInts = getPriceFromFirstCard().replaceAll("[^0-9]", "");
        return minPriceForRoomTakeInts;
    }

    public static String maxPriceForRoom() {
        String maxPriceTakeInts = getTexFromLeftSideMenu().replaceAll("[^0-9]", "");
        return maxPriceTakeInts;
    }

    public static int transformMaxPriceForRoom() {
        int maxPriceParseInts = Integer.parseInt(maxPriceForRoom());
        return maxPriceParseInts;
    }

    public static int transformMinPriceForRoom() {
        int minPriceForRoomPaseInts = Integer.parseInt(minPriceForRoom());
        return minPriceForRoomPaseInts;
    }

    public static int takePriceForDayFromSearchResult() {
        int c = transformMinPriceForRoom() / 7;
        return c;
    }
}
