package org.pluppert.javatime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
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
        /*
        LocalDate theDate = LocalDate.now()
                .plusYears(10)
                .minusMonths(10);
        Period period = Period.between(LocalDate.parse("1984-05-18"), theDate);

        System.out.println("Time elapsed from my birthdate until \"theDate\"");
        System.out.println("Years: " + period.getYears() +
                            "\nmonths: " + period.getMonths() +
                            "\ndays: " + period.getDays());
        */

        // Exercise 8:
        /*
        Period period = Period.of(4,7,29);
        LocalDate currentDatePlusPeriod = LocalDate.now().plus(period);
        System.out.println("currentDatePlusPeriod = " + currentDatePlusPeriod);
        */

        // Exercise 9:
        /*
        LocalTime current = LocalTime.now();
        System.out.println(current);
        */

        // Exercise 10:
        /*
        System.out.println(current.getNano());
        */

        // Exercise 11:
        /*
        LocalTime timeFromString = LocalTime.parse("13:37:48");
        System.out.println(timeFromString);
        */

        // Exercise 12:
        /*
        LocalTime currentLocalTime = LocalTime.parse(DateTimeFormatter
                .ofLocalizedTime(FormatStyle.MEDIUM)
                .format(LocalTime.now()));

        System.out.println("currentLocalTime = " + currentLocalTime);
        */

        // Exercise 13:
        /*
        LocalDateTime currentLocalTime = LocalDateTime.now();

        System.out.println("currentLocalTime = " +
                currentLocalTime.format(
                        DateTimeFormatter
                                .ofPattern("yyyy-MM-dd, 'time:' HH:mm")));
        */

        // Exercise 14:
        LocalDateTime currentLocalTime = LocalDateTime.now();
        String currentLocalTimeString = currentLocalTime.format(
                DateTimeFormatter.ofPattern("eeee dd MMMM HH:mm"));

        System.out.println("currentLocalTimeString = " + currentLocalTimeString);
    }
}
