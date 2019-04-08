package com.company;

import java.util.List;
import java.util.stream.Collectors;

public class SortingData {
    public List<CryptoCurrency> sortCryptoCurrencyByPrice(List<CryptoCurrency> list) {
        LoadingData loadingData = new LoadingData();
        return list.stream()
                .sorted((o1, o2) -> (int) (o2.getPrice() - o1.getPrice()))
                .collect(Collectors.toList());
    }
}
