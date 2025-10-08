package com.pluralsight;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {

    public static void main(String[] args) {

        // get the current local date and time
        LocalDateTime today = LocalDateTime.now();

        // create a ZonedDateTime in a GMT)
        ZonedDateTime gmtNow = ZonedDateTime.now(ZoneId.of("GMT"));

        // define a format for display
        DateTimeFormatter fmtLocal = DateTimeFormatter.ofPattern("MM/dd/yyyy\nyyyy-MM-dd\nMMMM dd, yyyy\nE, MMM dd yyyy HH:mm\nHH:mm 'on' dd-MMM-yyyy");

        // apply the format to the local date time response and store it in a string
        String todayLocal = today.format(fmtLocal);

        // format the ZonedDateTime using the formatter (will use the ZonedDateTime's zone)
        String todayGMT = gmtNow.format(fmtLocal);

        // print out the formatted strings for local time
        System.out.println("Local time\n" + todayLocal + "\n");
        System.out.println("GMT Time\n" + todayGMT + "\n");

    }

}
