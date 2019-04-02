package com.company;

import java.io.FileNotFoundException;

public class Options {

    private String[] cryptoCurrencyFile = {"csv/btc.csv", "csv/bch.csv", "csv/ltc.csv",
            "csv/eth.csv", "csv/xem.csv", "csv/dcr.csv", "csv/zec.csv", "csv/dash.csv",
            "csv/doge.csv", "csv/etc.csv"};

    public void Option1(int Crypto) throws FileNotFoundException {
        System.out.println("----------------------------------------------------------------");
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

    }
    public void Option2(int Crypto) throws FileNotFoundException {
        System.out.println("----------------------------------------------------------------");
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

    }

}
