package com.infoshareacademy.jjdd6;

import java.io.FileNotFoundException;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class SortingData {
    public List<CryptoCurrency> sortCryptoCurrencyFromMaxToMin(List<CryptoCurrency> list) {
        return list.stream()
                .sorted((o1, o2) -> (int) (o2.getPrice() - o1.getPrice()))
                .collect(toList());
    }

    public List<CryptoCurrency> sortCryptoCurrencyFromMinToMax(List<CryptoCurrency> list) {
        return list.stream()
                .sorted((o1, o2) -> (int) (o1.getPrice() - o2.getPrice()))
                .collect(toList());
    }

    public void printSortedData(List<CryptoCurrency> list) {
        LoadingData loadingData = new LoadingData();
        list.forEach(loadingData::printingInformation);
    }

    public void printingSortedPriceFromCsvMaxtoMin(String csv) throws FileNotFoundException {
        SortingData sortingData = new SortingData();
        LoadingData loadingData = new LoadingData();
        sortingData.printSortedData(sortingData.sortCryptoCurrencyFromMaxToMin(loadingData.getCryptoCurrencyFromDateToDate(csv)));
    }

    public void printingSortedPriceFromCsvMintoMax(String csv) throws FileNotFoundException {
        SortingData sortingData = new SortingData();
        LoadingData loadingData = new LoadingData();
        sortingData.printSortedData(sortingData.sortCryptoCurrencyFromMinToMax(loadingData.getCryptoCurrencyFromDateToDate(csv)));
    }

    public List<CryptoCurrency> sortingDatesFromNewestToOldest(List<CryptoCurrency> list) {
        return list.stream()
                .sorted(((o1, o2) -> o2.getDate().compareTo(o1.getDate())))
                .collect(toList());
    }

    public void printSortedListFromNewestToOldestDate(String csv) throws FileNotFoundException {
        LoadingData loadingData = new LoadingData();
        List<CryptoCurrency> sortedList = sortingDatesFromNewestToOldest(loadingData.getCryptoCurrencyFromDateToDate(csv));
        sortedList.forEach(loadingData::printingInformation);
    }
}