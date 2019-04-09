package com.company;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class SortingData {
    public List<CryptoCurrency> sortCryptoCurrencyFromMaxToMin(List<CryptoCurrency> list) {
        return list.stream()
                .sorted((o1, o2) -> (int) (o2.getPrice() - o1.getPrice()))
                .collect(toList());
    }
    public List<CryptoCurrency> sortCryptoCurrencyFromMinToMax(List<CryptoCurrency> list){
        return list.stream()
                .sorted((o1,o2)->(int)(o1.getPrice()-o2.getPrice()))
                .collect(toList()) ;
    }
    public void printSortedData(List<CryptoCurrency> list){
        LoadingData loadingData = new LoadingData();
        list.forEach(loadingData::printingInformation);
    }
}