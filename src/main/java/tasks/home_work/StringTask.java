package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTask {

    public static void main(String[] args) throws ParseException {
        duplicatesInString();
    }

    //2.1
    public static void duplicatesInString() {

        String regularExpressions = "(?i)\\b(\\w+)\\b[\\w\\W]+\\b\\b" + "(?i)\\b(\\w+)\\b[\\w\\W]+\\b\\b";
        Pattern pattern = Pattern.compile(regularExpressions);
        String phrase = "hello are mom hi how are you are mom";
        Matcher matcher = pattern.matcher(phrase);
        String group = null;
        while (matcher.find()) {
            group = matcher.group();
            System.out.println("Duplicate word: " + matcher.group(1) + ", " + matcher.group(2));
        }
        numbersInString();
    }

    //2.2
    public static void numbersInString() {
        Pattern pattern = Pattern.compile("\\d+");
        String word = "Мама мыла раму5, сын смотрел1 как мама8 моет2";
        Matcher matcher = pattern.matcher(word);
        int start = 0;
        while (matcher.find(start)) {
            String value = word.substring(matcher.start(), matcher.end());
            int result = Integer.parseInt(value);
            start = matcher.end();
            char[] res = Integer.toString(result).toCharArray();
            System.out.print(res);
        }
        ipAddresses();
    }

    //2.3
    public static void ipAddresses() {
        String log = "access_log.2020.09.07 212.168.101.5 granted access_log.2020.09.07 212.168.101.6 denied";
        String regularExpressions = "(?i)\\b[0-9]{1,3}\\W[0-9]{1,3}\\W[0-9]{1,3}\\W[0-9]{1,3}\\b";
        Pattern pattern = Pattern.compile(regularExpressions);
        Matcher matcher = pattern.matcher(log);
        String group = null;
        while (matcher.find()) {
            group = matcher.group();
            System.out.println("ip " + matcher.group(0) + ": ok - 3, failed - 2");
        }
        date();
    }

    //2.4
    public static void date() {
        Date date = new Date();
        String dateAndTime = String.format("%1$s %2$td %2$tB, %2$tY, %2$tH часов %2$tM минут", "Сейчас на дворе: \n", date);
        System.out.println(dateAndTime);

        try {
            dateTransform();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    //2.5
    public static void dateTransform() throws ParseException {
        String date = "22.00 07.09.2020";
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("hh.mm dd.MM.yyyy");
        Date docDate = format.parse(date);
        System.out.println(docDate);

    }
}



