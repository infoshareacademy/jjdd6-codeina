package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LoadingData {

    public String readingFiles(String fileName) throws FileNotFoundException { //zwraca ostatnią linijkę csf-ki
        File file = new File(fileName);
        String data = null;
        try {
            Scanner inpuStream = new Scanner(file);
            while (inpuStream.hasNext()) {
                data = inpuStream.next();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return data;
    }

    public CryptoCurrency sortingLineOfText(String lineOfText) { //zwraca obiekt (kryptowalutę z datą i ceną)
        String[] parts = lineOfText.split(",");
        Double price = 0.0;
        try {
            price = Double.parseDouble(parts[5]);
        } catch (Exception e) {
        }
        String date = parts[0];
        CryptoCurrency cryptoCurrency = new CryptoCurrency();
        cryptoCurrency.setPrice(price);
        cryptoCurrency.setDate(date);
        return cryptoCurrency;
    }

    public void printingInformation(CryptoCurrency cryptoCurrency) { // wypisuje pobrane dane
        System.out.println(String.format("Data : %s", cryptoCurrency.getDate()));
        ;
        System.out.println(String.format("price(USD): %s", cryptoCurrency.getPrice()));
    }

    public void printInformationFromLastLineOfCSV(String csv) throws FileNotFoundException {
        printingInformation(sortingLineOfText(readingFiles(csv)));
    }

    public String gettingDateFromUser() {
        System.out.println("Choose date (date format :\"year-month-day\" ):");
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        return date;
    }

    public void printInformationFromHistoricalDate(String csv) { //<-wyświetla informacje po podaniu daty
        File file = new File(csv);
        String lineOfText = null;
        boolean flag = false;
        CryptoCurrency cryptoCurrency = new CryptoCurrency();
        try {
            String data = gettingDateFromUser();
            Scanner inputStram = new Scanner(file);
            while (inputStram.hasNext()) {
                lineOfText = inputStram.next();
                cryptoCurrency = sortingLineOfText(lineOfText);
                if ((cryptoCurrency.getDate().equals(data))) {
                    printingInformation(cryptoCurrency);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                Inteface.emptySpacer();
                System.out.println("----------------------------------------------------------------");
                System.out.println("    Incorrect date format, or date out of range. Try again!");
                System.out.println("----------------------------------------------------------------");
                printInformationFromHistoricalDate(csv);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<CryptoCurrency> getCryptoCurrenctFromDateToPresent() { //WIP
        List<CryptoCurrency> listOfCryptoCurrency = new LinkedList<CryptoCurrency>();
        List<String> listOfLines = new LinkedList<String>();
        String date = gettingDateFromUser();
        return listOfCryptoCurrency;
    }

}
