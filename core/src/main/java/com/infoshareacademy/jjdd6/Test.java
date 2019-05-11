package com.infoshareacademy.jjdd6;

import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.List;

public class Test {

    public static void main(String[] args) throws FileNotFoundException {
        LoadingData loadingData = new LoadingData();
        final DecimalFormat df = new DecimalFormat("0");
        List<CryptoCurrency> list = loadingData.loadAllCryptoCurrenciesFromCsv("csv/btc.csv");
        list.forEach(o-> System.out.println(df.format(o.getMarketCap()).replace(',', '.')));
    }}
