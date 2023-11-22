package org.pluppert.javatime;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Exercise 1:
        /*
        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);
        */

        // Exercise 2:
        ZoneId zid = ZoneId.of("Europe/Stockholm");
        String today = LocalDate.now(zid).format(DateTimeFormatter.ofPattern("eeee dd MMMM"));
        System.out.println("today = " + (today.substring(0, 1).toUpperCase()) + today.substring(1));
    }
}
