package com.infoshareacademy.jjdd6;

import java.io.FileNotFoundException;
import java.util.List;

public class MainNUMBERTWO {
    public static void main(String[] args) throws FileNotFoundException {
        LoadingData loadingData = new LoadingData();
       List<CryptoCurrency> list = loadingData.loadAllCryptoCurrenciesFromCsv("csv/bch.csv");
        list.forEach(loadingData::printingInformation);
    }
}
