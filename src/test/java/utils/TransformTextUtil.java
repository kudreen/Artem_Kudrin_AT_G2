package utils;

import static steps.booking.SearchResultsSteps.*;

public class TransformTextUtil {


    public static String minPriceForRoom() {
        String minPriceForRoomTakeInts = getPriceFromFirstCard().replaceAll("[^0-9]", "");
        return minPriceForRoomTakeInts;
    }

    public static String maxPriceForRoom() {
        String maxPriceTakeInts = getTexFromLeftSideMenu().replaceAll("[^0-9]", "");
        return maxPriceTakeInts;
    }

    public static String ratingFromHotelpage() {
        String rating = getRatingFromHotelPage().replaceAll("[^0-9]", "");
        return rating;
    }

    public static int ratingFromHotelPageInteger() {
        int actualRate = Integer.parseInt(ratingFromHotelpage());
        return actualRate;
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
