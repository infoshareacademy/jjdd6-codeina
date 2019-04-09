package com.infoshareacademy.jjdd6;

import java.io.FileNotFoundException;

public class Options {

    private String[] cryptoCurrencyFile = {"csv/btc.csv", "csv/bch.csv", "csv/ltc.csv",
            "csv/eth.csv", "csv/xem.csv", "csv/dcr.csv", "csv/zec.csv", "csv/dash.csv",
            "csv/doge.csv", "csv/etc.csv"};

    public void option1(int Crypto) throws FileNotFoundException {
        Interface.printLine();
        LoadingData loadingData = new LoadingData();
        switch (Crypto) {
            case 1:
                loadingData.printInformationFromLastLineOfCSV(cryptoCurrencyFile[0]);
                break;
            case 2:
                loadingData.printInformationFromLastLineOfCSV(cryptoCurrencyFile[1]);
                break;
            case 3:
                loadingData.printInformationFromLastLineOfCSV(cryptoCurrencyFile[2]);
                break;
            case 4:
                loadingData.printInformationFromLastLineOfCSV(cryptoCurrencyFile[3]);
                break;
            case 5:
                loadingData.printInformationFromLastLineOfCSV(cryptoCurrencyFile[4]);
                break;
            case 6:
                loadingData.printInformationFromLastLineOfCSV(cryptoCurrencyFile[5]);
                break;
            case 7:
                loadingData.printInformationFromLastLineOfCSV(cryptoCurrencyFile[6]);
                break;
            case 8:
                loadingData.printInformationFromLastLineOfCSV(cryptoCurrencyFile[7]);
                break;
            case 9:
                loadingData.printInformationFromLastLineOfCSV(cryptoCurrencyFile[8]);
                break;
            case 10:
                loadingData.printInformationFromLastLineOfCSV(cryptoCurrencyFile[9]);
                break;
        }
        Interface.printLine();

    }

    public void option2(int Crypto) throws FileNotFoundException {
        Interface.printLine();
        LoadingData loadingData = new LoadingData();
        switch (Crypto) {
            case 1:
                loadingData.printInformationFromHistoricalDate(cryptoCurrencyFile[0]);
                break;
            case 2:
                loadingData.printInformationFromHistoricalDate(cryptoCurrencyFile[1]);
                break;
            case 3:
                loadingData.printInformationFromHistoricalDate(cryptoCurrencyFile[2]);
                break;
            case 4:
                loadingData.printInformationFromHistoricalDate(cryptoCurrencyFile[3]);
                break;
            case 5:
                loadingData.printInformationFromHistoricalDate(cryptoCurrencyFile[4]);
                break;
            case 6:
                loadingData.printInformationFromHistoricalDate(cryptoCurrencyFile[5]);
                break;
            case 7:
                loadingData.printInformationFromHistoricalDate(cryptoCurrencyFile[6]);
                break;
            case 8:
                loadingData.printInformationFromHistoricalDate(cryptoCurrencyFile[7]);
                break;
            case 9:
                loadingData.printInformationFromHistoricalDate(cryptoCurrencyFile[8]);
                break;
            case 10:
                loadingData.printInformationFromHistoricalDate(cryptoCurrencyFile[9]);
                break;
        }
        Interface.printLine();

    }

    public void option3(int Crypto) throws FileNotFoundException {
        Interface.printLine();
        LoadingData loadingData = new LoadingData();
        switch (Crypto) {
            case 1:
                loadingData.getCryptoCurrencyFromDateToDate(cryptoCurrencyFile[0]);
                break;
            case 2:
                loadingData.getCryptoCurrencyFromDateToDate(cryptoCurrencyFile[1]);
                break;
            case 3:
                loadingData.getCryptoCurrencyFromDateToDate(cryptoCurrencyFile[2]);
                break;
            case 4:
                loadingData.getCryptoCurrencyFromDateToDate(cryptoCurrencyFile[3]);
                break;
            case 5:
                loadingData.getCryptoCurrencyFromDateToDate(cryptoCurrencyFile[4]);
                break;
            case 6:
                loadingData.getCryptoCurrencyFromDateToDate(cryptoCurrencyFile[5]);
                break;
            case 7:
                loadingData.getCryptoCurrencyFromDateToDate(cryptoCurrencyFile[6]);
                break;
            case 8:
                loadingData.getCryptoCurrencyFromDateToDate(cryptoCurrencyFile[7]);
                break;
            case 9:
                loadingData.getCryptoCurrencyFromDateToDate(cryptoCurrencyFile[8]);
                break;
            case 10:
                loadingData.getCryptoCurrencyFromDateToDate(cryptoCurrencyFile[9]);
                break;
        }
        Interface.printLine();
    }
    public void option4MaxtoMin(int Crypto) throws FileNotFoundException {
        Interface.printLine();
        SortingData sortingData = new SortingData();
        switch (Crypto) {
            case 1:
                sortingData.printingSortedDateFromCsvMaxtoMin(cryptoCurrencyFile[0]);
                break;
            case 2:
                sortingData.printingSortedDateFromCsvMaxtoMin(cryptoCurrencyFile[1]);
                break;
            case 3:
                sortingData.printingSortedDateFromCsvMaxtoMin(cryptoCurrencyFile[2]);
                break;
            case 4:
                sortingData.printingSortedDateFromCsvMaxtoMin(cryptoCurrencyFile[3]);
                break;
            case 5:
                sortingData.printingSortedDateFromCsvMaxtoMin(cryptoCurrencyFile[4]);
                break;
            case 6:
                sortingData.printingSortedDateFromCsvMaxtoMin(cryptoCurrencyFile[5]);
                break;
            case 7:
                sortingData.printingSortedDateFromCsvMaxtoMin(cryptoCurrencyFile[6]);
                break;
            case 8:
                sortingData.printingSortedDateFromCsvMaxtoMin(cryptoCurrencyFile[7]);
                break;
            case 9:
                sortingData.printingSortedDateFromCsvMaxtoMin(cryptoCurrencyFile[8]);
                break;
            case 10:
                sortingData.printingSortedDateFromCsvMaxtoMin(cryptoCurrencyFile[9]);
                break;
        }
        Interface.printLine();
    }
    public void option4MintoMax(int Crypto) throws FileNotFoundException {
        Interface.printLine();
        SortingData sortingData = new SortingData();
        switch (Crypto) {
            case 1:
                sortingData.printingSortedDateFromCsvMintoMax(cryptoCurrencyFile[0]);
                break;
            case 2:
                sortingData.printingSortedDateFromCsvMintoMax(cryptoCurrencyFile[1]);
                break;
            case 3:
                sortingData.printingSortedDateFromCsvMintoMax(cryptoCurrencyFile[2]);
                break;
            case 4:
                sortingData.printingSortedDateFromCsvMintoMax(cryptoCurrencyFile[3]);
                break;
            case 5:
                sortingData.printingSortedDateFromCsvMintoMax(cryptoCurrencyFile[4]);
                break;
            case 6:
                sortingData.printingSortedDateFromCsvMintoMax(cryptoCurrencyFile[5]);
                break;
            case 7:
                sortingData.printingSortedDateFromCsvMintoMax(cryptoCurrencyFile[6]);
                break;
            case 8:
                sortingData.printingSortedDateFromCsvMintoMax(cryptoCurrencyFile[7]);
                break;
            case 9:
                sortingData.printingSortedDateFromCsvMintoMax(cryptoCurrencyFile[8]);
                break;
            case 10:
                sortingData.printingSortedDateFromCsvMintoMax(cryptoCurrencyFile[9]);
                break;
        }
        Interface.printLine();
    }
}
