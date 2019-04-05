package com.company;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {
        String csv = "csv/btc.csv" ;
        LoadingData loadingData = new LoadingData() ;
        loadingData.getCryptoCurrencyFromDateToDate(csv) ;
    }
}
