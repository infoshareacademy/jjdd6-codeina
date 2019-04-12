package com.infoshareacademy.jjdd6;

import java.io.File;
import java.io.FileNotFoundException;

public class Runner {
    private int runningCondition = 0;
    private int chosenCryptoC = 0;
    private int option = 0;
    private int subOptionMintoMaxPrices = 0;
    private int subOptionForMathOperations = 0;
    private int originRegion = 0;

    public void run() throws FileNotFoundException, InterruptedException {

        new File("csv").mkdirs();
        Interface anInterface = new Interface();
        Options options = new Options();
        Logo.printLogo(new Logo().applicationLogo);

        while (runningCondition != -1) {
            try {
                if (runningCondition == 0) {
                    originRegion = Interface.whereAreYouFrom();
                    runningCondition = 1;
                }
                if (runningCondition == 1) {
                    chosenCryptoC = anInterface.printMenu();
                    if (chosenCryptoC <= 10) {
                        Downloader.downloadCryptocurrency(chosenCryptoC);
                        anInterface.printLogo(chosenCryptoC);
                        runningCondition = 2;
                    } else {
                        runningCondition = 10;
                    }
                }
                if (runningCondition == 2) {
                    option = anInterface.options();
                    if (option == 1) {
                        options.optionShowLastPrice(chosenCryptoC);
                        runningCondition = 9;
                    } else if (option == 2) {
                        options.optionPriceAtGivenDay(chosenCryptoC);
                        runningCondition = 9;
                    } else if (option == 3) {
                        options.optionPricesAtGivenDates(chosenCryptoC);
                        runningCondition = 9;
                    } else if (option == 4) {
                        runningCondition = 7;
                    } else if (option == 5) {
                        runningCondition = 8;
                    } else {
                        runningCondition = 10;
                    }
                }
                if (runningCondition == 7) {
                    subOptionMintoMaxPrices = anInterface.subOptionsForDatesAndPricesSort();
                    if (subOptionMintoMaxPrices == 1) {
                        options.subOptionMintoMaxPrices(chosenCryptoC);
                        runningCondition = 9;
                    } else if (subOptionMintoMaxPrices == 2) {
                        options.subOptionMaxtoMinPrices(chosenCryptoC);
                        runningCondition = 9;
                    } else if (subOptionMintoMaxPrices == 3) {
                        options.subOptionMintoMaxDates(chosenCryptoC);
                        runningCondition = 9;
                    } else if (subOptionMintoMaxPrices == 4) {
                        options.subOptionMaxtoMinDates(chosenCryptoC);
                        runningCondition = 9;
                    } else {
                        runningCondition = 10;
                    }
                }
                if (runningCondition == 8) {
                    subOptionForMathOperations = anInterface.subOptionsForMathOperations();
                    if (subOptionForMathOperations == 1) {
                        options.subOptionAverage(chosenCryptoC);
                        runningCondition = 9;
                    } else if (subOptionForMathOperations == 2) {
                        options.subOptionExtreme(chosenCryptoC);
                        runningCondition = 9;
                    } else if (subOptionForMathOperations == 3) {
                        options.subOptionSmallestValue(chosenCryptoC);
                        runningCondition = 9;
                    } else if (subOptionForMathOperations == 4) {
                        options.subOptionMedian(chosenCryptoC);
                        runningCondition = 9;
                    } else {
                        runningCondition = 10;
                    }
                }

                if (runningCondition == 9) {
                    int Exit = anInterface.exit();
                    if (Exit == 9) {
                        runningCondition = -1;
                    } else if (Exit == 1) {
                        runningCondition = 1;
                    } else if (Exit == 2) {
                        runningCondition = 2;
                    } else {
                        runningCondition = 10;
                    }
                }
                if (runningCondition == 10) {
                    anInterface.error();
                    if (chosenCryptoC == 0) {
                        runningCondition = 1;
                    } else {
                        runningCondition = 9;
                    }
                }
            } catch (Exception InputMismatchException) {
                runningCondition = 10;
            }
        }
    }
}