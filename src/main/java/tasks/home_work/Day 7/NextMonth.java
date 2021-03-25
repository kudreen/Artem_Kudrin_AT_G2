package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class NextMonth {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDate = new SimpleDateFormat("dd-MM-yyy");

        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(simpleDate.parse(incoming));
            calendar.add(Calendar.MONTH, 1);
            incoming = simpleDate.format(calendar.getTime());
            System.out.println(incoming);
            return;
        }
    }
}

