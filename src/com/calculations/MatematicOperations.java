package com.calculations;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class MatematicOperations {

    public Double average(Map<LocalDate, Double> fromCsv) {

        Double sumOfElements = fromCsv.values().stream()
                .collect(Collectors.summingDouble(Double::doubleValue));
        System.out.println(sumOfElements/fromCsv.size());
        return sumOfElements / fromCsv.size();
    }

    public Map.Entry<LocalDate, Double> findExtremeValue(Map<LocalDate, Double> fromCsv) {

        Map.Entry<LocalDate, Double> highestValue = fromCsv.entrySet().stream()
                .max(Map.Entry.comparingByValue(Comparator.comparingDouble(Double::doubleValue)))
                .get();
        System.out.println(highestValue);
        return highestValue;
    }

    public double median(Map<LocalDate, Double> fromCsv) {

        List<Double> arrayOfValues = new ArrayList<>(fromCsv.values());

        int lengthOfArray =  arrayOfValues.size();
        int med = lengthOfArray/2;

        arrayOfValues = arrayOfValues.stream()
                .sorted((o1, o2) -> (int) (o1 - o2))
                .collect(Collectors.toList());


        if (lengthOfArray % 2 == 0) {
            med = (lengthOfArray + 1) /2;
            System.out.println("50% of records are equal or smaller than " + arrayOfValues.get(med) + ".");
            System.out.println("50% of records are equal or bigger than " + arrayOfValues.get(med) + ".");
            return med;
        }

            System.out.println("50% of records are equal or smaller than " + arrayOfValues.get(med) + ".");
            System.out.println("50% of records are equal or bigger than " + arrayOfValues.get(med) + ".");
        return med;
    }
}


