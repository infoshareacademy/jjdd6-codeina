package com.infoshareacademy.jjdd6;

import java.io.FileNotFoundException;

public class Runner {
    private int con = 1;
    private int crypto = 0;
    private int option = 0;
    private int subOption4 = 0;
    private int subOption5 = 0;

    public void run() throws FileNotFoundException, InterruptedException {

        Interface anInterface = new Interface();
        Options options = new Options();
        Logo.printLogo(new Logo().applicationLogo);
        while (con != 0) {
            try {
                if (con == 1) {
                    crypto = anInterface.printMenu();
                    if (crypto <= 10) {
                        Downloader.downloadCryptocurrency(crypto);
                        anInterface.printLogo(crypto);
                        con = 2;
                    } else {
                        con = 10;
                    }
                }
                if (con == 2) {
                    option = anInterface.options();
                    if (option == 1) {
                        options.optionShowLastPrice(crypto);
                        con = 9;
                    } else if (option == 2) {
                        options.optionPriceAtGivenDay(crypto);
                        con = 9;
                    } else if (option == 3) {
                        options.optionPricesAtGivenDates(crypto);
                        con = 9;
                    } else if (option == 4) {
                        con = 7;
                    } else if (option == 5) {
                        con = 8;
                    } else {
                        con = 10;
                    }
                }
                if (con == 7) {
                    subOption4 = anInterface.subOptionsFor4();
                    if (subOption4 == 1) {
                        options.subOptionMintoMaxPrices(crypto);
                        con = 9;
                    } else if (subOption4 == 2) {
                        options.subOptionMaxtoMinPrices(crypto);
                        con = 9;
                    } else if (subOption4 == 3) {
                        options.subOptionMintoMaxDates(crypto);
                        con = 9;
                    } else if (subOption4 == 4) {
                        options.subOptionMaxtoMinDates(crypto);
                        con = 9;
                    } else {
                        con = 10;
                    }
                }
                if (con == 8) {
                    subOption5 = anInterface.subOptionsFor5();
                    if (subOption5 == 1) {
                        options.subOptionAverage(crypto);
                        con = 9;
                    } else if (subOption5 == 2) {
                        options.subOptionExtreme(crypto);
                        con = 9;
                    } else if (subOption5 == 3) {
                        options.subOptionMedian(crypto);
                        con = 9;
                    } else {
                        con = 10;
                    }
                }

                if (con == 9) {
                    int Exit = anInterface.exit();
                    if (Exit == 9) {
                        con = 0;
                    } else if (Exit == 1) {
                        con = 1;
                    } else if (Exit == 2) {
                        con = 2;
                    } else {
                        con = 10;
                    }
                }
                if (con == 10) {
                    anInterface.error();
                    if (crypto == 0) {
                        con = 1;
                    } else {
                        con = 9;
                    }
                }
            } catch (Exception inputMismatchException) {

                con = 10;
            }
        }
    }
}