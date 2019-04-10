package com.infoshareacademy.jjdd6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MathematicOperation {

    public Double average(Map<LocalDate, CryptoCurrency> fromCsv) {
        double sumOfElements = fromCsv.values().stream().mapToDouble(CryptoCurrency::getPrice).sum();
        System.out.println(sumOfElements / fromCsv.size());

        return sumOfElements / fromCsv.size();
    }

    public Map.Entry<LocalDate, CryptoCurrency> findExtremeValue(Map<LocalDate, CryptoCurrency> fromCsv) {

        Map.Entry<LocalDate, CryptoCurrency> highestValue = fromCsv.entrySet().stream()
                .max(Map.Entry.comparingByValue(Comparator.comparingDouble(CryptoCurrency::getPrice)))
                .get();

        System.out.println("Price: "+highestValue);
        return highestValue;
    }

    public double median(Map<LocalDate, CryptoCurrency> fromCsv) {

        List<CryptoCurrency> arrayOfValues = new ArrayList<>(fromCsv.values());

        int lengthOfArray = arrayOfValues.size();
        int med = lengthOfArray / 2;

        arrayOfValues = arrayOfValues.stream()
                .sorted((o1, o2) -> (int) (o1.getPrice() - o2.getPrice()))
                .collect(Collectors.toList());

        if (lengthOfArray % 2 == 0) {
            med = (lengthOfArray + 1) / 2;
            System.out.println("50% of records are equal or smaller than " + arrayOfValues.get(med) + "");
            System.out.println("50% of records are equal or bigger than " + arrayOfValues.get(med) + "");
            return med;
        }

        System.out.println("50% of records are equal or smaller than " + arrayOfValues.get(med) + "");
        System.out.println("50% of records are equal or bigger than " + arrayOfValues.get(med) + "");
        return med;
    }
}


