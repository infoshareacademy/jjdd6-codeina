package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Inteface {

    public int Menu() {


        System.out.println("----------------------------------------------------------------");
        System.out.println("                   Wybierz Kryptowalute:");
        System.out.println("----------------------------------------------------------------");
        System.out.println("1) Bitcoin");
        System.out.println("2) Bitcoin Cash");
        System.out.println("3) Litecoin");
        System.out.println("4) Ethereum");
        System.out.println("5) NEM");
        System.out.println("6) Decred");
        System.out.println("7) ZCash");
        System.out.println("8) Dash");
        System.out.println("9) Dogecoin");
        System.out.println("10) Ethereum Classic");

        System.out.println("----------------------------------------------------------------");

        Scanner input = new Scanner(System.in);
        int clientAnswerMenu = input.nextInt();
        emptySpacer();
        return clientAnswerMenu;
    }

    public void Logo(int Crypto) throws InterruptedException {
        Logo logo = new Logo();
        switch (Crypto) {
            case 1:
                logo.printLogo(logo.bitcoinLogo);
                break;
            case 2:
                logo.printLogo(logo.bitcoinCashLogo);
                break;
            case 3:
                logo.printLogo(logo.litecoinLogo);
                break;
            case 4:
                logo.printLogo(logo.ethereumLogo);
                break;
            case 5:
                logo.printLogo(logo.nemLogo);
                break;
            case 6:
                logo.printLogo(logo.decredLogo);
                break;
            case 7:
                logo.printLogo(logo.zCashLogo);
                break;
            case 8:
                logo.printLogo(logo.dashLogo);
                break;
            case 9:
                logo.printLogo(logo.dogeCoinLogo);
                break;
            case 10:
                logo.printLogo(logo.ethereumClassicLogo);
                break;
        }
    }

    public int Options() {

        System.out.println("----------------------------------------------------------------");
        System.out.println("                   Co chcesz zrobic:");
        System.out.println("----------------------------------------------------------------");
        System.out.println("1) Wyswietlic ostatnia cene");


        System.out.println("----------------------------------------------------------------");
        Scanner input = new Scanner(System.in);
        int clientAnswerOptions = input.nextInt();
        emptySpacer();
        return clientAnswerOptions;

    }

    public int Exit() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("                   Co chcesz zrobic:");
        System.out.println("----------------------------------------------------------------");
        System.out.println("1) Wrocic do wyboru Kryptowaluty");
        System.out.println("2) Wrocic do wyboru Opcji");
        System.out.println("9) Zamknac program");


        System.out.println("----------------------------------------------------------------");
        Scanner input = new Scanner(System.in);
        int clientAnswerExit = input.nextInt();
        emptySpacer();
        if (clientAnswerExit == 9) {
            System.out.println("----------------------------------------------------------------");
            System.out.println("                        Zegnaj!");
            System.out.println("----------------------------------------------------------------");
        }
        return clientAnswerExit;
    }

    public void emptySpacer() {
        for (int i = 0; i <= 20; i++) {
            System.out.println("\n");
        }
    }

    public void error() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("                ERROR! Zle wybrales opcje.");
        System.out.println("----------------------------------------------------------------");
    }

    public void Option1(int Crypto) throws FileNotFoundException {
        System.out.println("----------------------------------------------------------------");
        LoadingData loadingData = new LoadingData();
        switch (Crypto) {
            case 1:
                loadingData.printInformationFromLastLineOfCSV("btc.csv");
                break;
            case 2:
                loadingData.printInformationFromLastLineOfCSV("bch.csv");
                break;
            case 3:
                loadingData.printInformationFromLastLineOfCSV("ltc.csv");
                break;
            case 4:
                loadingData.printInformationFromLastLineOfCSV("eth.csv");
                break;
            case 5:
                loadingData.printInformationFromLastLineOfCSV("xem.csv");
                break;
            case 6:
                loadingData.printInformationFromLastLineOfCSV("dcr.csv");
                break;
            case 7:
                loadingData.printInformationFromLastLineOfCSV("zec.csv");
                break;
            case 8:
                loadingData.printInformationFromLastLineOfCSV("dash.csv");
                break;
            case 9:
                loadingData.printInformationFromLastLineOfCSV("doge.csv");
                break;
            case 10:
                loadingData.printInformationFromLastLineOfCSV("etc.csv");
                break;
        }

    }

}
