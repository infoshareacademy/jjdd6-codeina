package com.infoshareacademy.jjdd6;

import java.io.FileNotFoundException;

public class Options {

    private String[] cryptoCurrencyFile = {"csv/btc.csv", "csv/bch.csv", "csv/ltc.csv",
            "csv/eth.csv", "csv/xem.csv", "csv/dcr.csv", "csv/zec.csv", "csv/dash.csv",
            "csv/doge.csv", "csv/etc.csv"};

    public void optionShowLastPrice(int Crypto) throws FileNotFoundException {
        Interface.printLine();
        LoadingData loadingData = new LoadingData();
        loadingData.printInformationFromLastLineOfCSV(cryptoCurrencyFile[Crypto - 1]);
        Interface.printLine();
    }

    public void optionPriceAtGivenDay(int Crypto) throws FileNotFoundException {
        Interface.printLine();
        LoadingData loadingData = new LoadingData();
        loadingData.printInformationFromHistoricalDate(cryptoCurrencyFile[Crypto - 1]);
        Interface.printLine();

    }

    public void optionPricesAtGivenDates(int Crypto) throws FileNotFoundException {
        Interface.printLine();
        LoadingData loadingData = new LoadingData();
        loadingData.printAllCryptoCurrencies(cryptoCurrencyFile[Crypto - 1]);
        Interface.printLine();
    }

    public void subOptionMaxtoMinPrices(int Crypto) throws FileNotFoundException {
        Interface.printLine();
        SortingData sortingData = new SortingData();
        sortingData.printingSortedPriceFromCsvMaxtoMin(cryptoCurrencyFile[Crypto - 1]);
        Interface.printLine();
    }

    public void subOptionMintoMaxPrices(int Crypto) throws FileNotFoundException {
        Interface.printLine();
        SortingData sortingData = new SortingData();
        sortingData.printingSortedPriceFromCsvMintoMax(cryptoCurrencyFile[Crypto - 1]);
        Interface.printLine();
    }

    public void subOptionMaxtoMinDates(int Crypto) throws FileNotFoundException {
        optionPricesAtGivenDates(Crypto);
    }

    public void subOptionMintoMaxDates(int Crypto) throws FileNotFoundException {
        Interface.printLine();
        SortingData sortingData = new SortingData();
        sortingData.printSortedListFromNewestToOldestDate(cryptoCurrencyFile[Crypto - 1]);
        Interface.printLine();
    }

    public void subOptionAverage(int Crypto) throws FileNotFoundException {
        MathematicOperation mathematicOperation = new MathematicOperation();
        LoadingData loadingData = new LoadingData();
        mathematicOperation.average(loadingData.getMapFromList(loadingData.getCryptoCurrencyFromDateToDate(cryptoCurrencyFile[Crypto - 1])));
        Interface.printLine();
    }

    public void subOptionExtreme(int Crypto) throws FileNotFoundException {
        MathematicOperation mathematicOperation = new MathematicOperation();
        LoadingData loadingData = new LoadingData();
        mathematicOperation.findExtremeValue(loadingData.getMapFromList(loadingData.getCryptoCurrencyFromDateToDate(cryptoCurrencyFile[Crypto - 1])));
        Interface.printLine();
    }

    public void subOptionMedian(int Crypto) throws FileNotFoundException {
        MathematicOperation mathematicOperation = new MathematicOperation();
        LoadingData loadingData = new LoadingData();
        mathematicOperation.median(loadingData.getMapFromList(loadingData.getCryptoCurrencyFromDateToDate(cryptoCurrencyFile[Crypto - 1])));
        Interface.printLine();

    }
}
