package com.infoshareacademy.jjdd6.codeina.servlet;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

public class Test {
    public static void main(String[] args) {

        System.out.println( getDateEpochFromLocalDate(LocalDate.now()));
        System.out.println(getLocalDateFromString(getDateEpochFromLocalDate(LocalDate.now())));
    }

    private static String getDateEpochFromLocalDate(LocalDate localDate) {
        ZoneId zoneId = ZoneId.systemDefault();
        long epoch = localDate.atStartOfDay(zoneId).toEpochSecond();
        return String.valueOf(epoch);
    }

    private static LocalDate getLocalDateFromString(String localDateStr) {
        return Instant.ofEpochMilli(Long.valueOf(localDateStr)*1000)
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }
}
