package com.infoshareacademy.jjdd6;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
public class MathematicOperation {

    public Double average(Map<LocalDate, CryptoCurrency> fromCsv) {
        double sumOfElements = fromCsv.values().stream().mapToDouble(CryptoCurrency::getPrice).sum();
        System.out.println(String.format("Average price = %s (USD)", (sumOfElements / fromCsv.size())));

        return sumOfElements / fromCsv.size();
    }

    public CryptoCurrency findExtremeValue(Map<LocalDate, CryptoCurrency> fromCsv) {
        LoadingData loadingData = new LoadingData();
        Map.Entry<LocalDate, CryptoCurrency> highestValue = fromCsv.entrySet().stream()
                .max(Map.Entry.comparingByValue(Comparator.comparingDouble(CryptoCurrency::getPrice)))
                .get();

        System.out.println("Highest value at given range is in");
        loadingData.printingInformation(highestValue.getValue());
        return highestValue.getValue();
    }

    public  CryptoCurrency findSmallestValue(Map<LocalDate, CryptoCurrency> cryptoCurrencies) {
        LoadingData loadingData = new LoadingData();
        Map.Entry<LocalDate, CryptoCurrency> lowestValue = cryptoCurrencies.entrySet().stream()
                .min(Map.Entry.comparingByValue(Comparator.comparingDouble(CryptoCurrency::getPrice)))
                .get();
        System.out.println("Smallest value at given range is in");
        loadingData.printingInformation(lowestValue.getValue());

        return lowestValue.getValue();
    }
    public double median(Map<LocalDate, CryptoCurrency> fromCsv) {
        LoadingData loadingData = new LoadingData();
        List<CryptoCurrency> arrayOfValues = new ArrayList<>(fromCsv.values());

        int lengthOfArray = arrayOfValues.size();
        int med = lengthOfArray / 2;

        arrayOfValues = arrayOfValues.stream()
                .sorted((o1, o2) -> (int) (o1.getPrice() - o2.getPrice()))
                .collect(Collectors.toList());

        if (lengthOfArray % 2 == 0) {
            med = (lengthOfArray + 1) / 2;
            System.out.println("50% of records are equal or smaller than ");
            loadingData.printingInformation(arrayOfValues.get(med));
            return arrayOfValues.get(med).getPrice();
        }
        System.out.println("50% of records are equal or smaller than ");
        loadingData.printingInformation(arrayOfValues.get(med));
        return arrayOfValues.get(med).getPrice();
    }

}


