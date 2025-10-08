package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {

    public static void main(String[] args) {

        // get the current local date and time
        LocalDateTime today = LocalDateTime.now();

        // define a format for display
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MM/dd/yyyy\nyyyy-MM-dd\nMMMM dd, yyyy\nE, MMM dd yyyy HH:mm\nHH:mm 'on' dd-MMM-yyyy");

        // apply the format to the local date time response and store it in a string
        String todayLocal = today.format(fmt);

        // print out the formatted string for local time
        System.out.println(todayLocal);

    }

}
