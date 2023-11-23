package org.pluppert.javatime;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjuster;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Exercise 1:
        /*
        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);
        */

        // Exercise 2:
        /*
        ZoneId zid = ZoneId.of("Europe/Stockholm");
        String today = LocalDate.now(zid).format(DateTimeFormatter.ofPattern("eeee dd MMMM"));
        System.out.println("today = " + (today.substring(0, 1).toUpperCase()) + today.substring(1));
        */

        // Exercise 3:
        /*
        LocalDate lastMonday = LocalDate.parse("2023-11-20");
        LocalDate nextMonday = LocalDate.parse("2023-11-27");
        lastMonday.datesUntil(nextMonday)
                .forEach(date -> System.out.println(date.format(DateTimeFormatter.BASIC_ISO_DATE)));
        */

        // Exercise 4:
        /*
        LocalDate theDate = LocalDate.parse("2024-05-18");
        System.out.println("theDate = " + theDate);
        */

        // Exercise 5:
        /*
        LocalDate theDate = LocalDate.parse("1945-05-08");
        System.out.println("theDate.getDayOfWeek() = " +
                theDate
                .getDayOfWeek()
                .getDisplayName(TextStyle.FULL, Locale.getDefault()).toUpperCase());
        */

        // Exercise 6:
        /*
        LocalDate theDate = LocalDate.now()
                .plusYears(10)
                .minusMonths(10);

        System.out.println("theDate = " + theDate);
        */

        // Exercise 7:
        LocalDate theDate = LocalDate.now()
                .plusYears(10)
                .minusMonths(10);
        Period period = Period.between(LocalDate.parse("1984-05-18"), theDate);

        System.out.println("Time elapsed from my birthdate until \"theDate\"");
        System.out.println("Years: " + period.getYears() +
                            "\nmonths: " + period.getMonths() +
                            "\ndays: " + period.getDays());
    }
}
