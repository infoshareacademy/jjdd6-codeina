package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LoadingData {

    public String readingLastLineOFFile(String fileName) throws FileNotFoundException { //zwraca ostatnią linijkę csf-ki
        File file = new File(fileName);
        String data = null;
        try {
            Scanner inputStream = new Scanner(file);
            while (inputStream.hasNext()) {
                data = inputStream.next();
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
        System.out.println(String.format("price(USD): %s", cryptoCurrency.getPrice()));
    }

    public void printInformationFromLastLineOfCSV(String csv) throws FileNotFoundException {
        printingInformation(sortingLineOfText(readingLastLineOFFile(csv)));
    }

    public CryptoCurrency gettingDateFromUserAndReturningCryptoCurrencyFromThatDate(String csv) throws FileNotFoundException {
        boolean flag = false;
        CryptoCurrency cryptoCurrency = new CryptoCurrency();
        File file = new File(csv);
        String lineOfText = null;
        System.out.println("Choose date (date format :\"year-month-day\" ):");
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        Scanner inputStream = new Scanner(file);
        try{
            while (inputStream.hasNext()) {
                lineOfText = inputStream.next();
                cryptoCurrency = sortingLineOfText(lineOfText);
                if ((cryptoCurrency.getDate().equals(date))) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                Inteface.emptySpacer();
                System.out.println("----------------------------------------------------------------");
                System.out.println("    Incorrect date format, or date out of range. Try again!");
                System.out.println("----------------------------------------------------------------");
                gettingDateFromUserAndReturningCryptoCurrencyFromThatDate(csv);
            }

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return cryptoCurrency;
    }

    public void printInformationFromHistoricalDate(String csv) throws FileNotFoundException { //<-wyświetla informacje po podaniu daty
        CryptoCurrency cryptoCurrency =gettingDateFromUserAndReturningCryptoCurrencyFromThatDate(csv) ;
        printingInformation(cryptoCurrency);
    }

    public List<CryptoCurrency> getCryptoCurrencyFromDateToDate(String csv) throws FileNotFoundException { //WIP
        String lineOfText = null;
        boolean startAddingToList =false  ;
        List<CryptoCurrency> listOfCryptoCurrencies = new ArrayList<>();
        CryptoCurrency firstCryptoCurrency = gettingDateFromUserAndReturningCryptoCurrencyFromThatDate(csv);
        CryptoCurrency lastCryptoCurrency = gettingDateFromUserAndReturningCryptoCurrencyFromThatDate(csv);
        File file = new File(csv);
        String data = null;
        Scanner inputStream = new Scanner(file);
        while (inputStream.hasNext()){
            lineOfText= inputStream.next() ;
            CryptoCurrency cryptoCurrency=sortingLineOfText(lineOfText) ;
            String date =cryptoCurrency.getDate() ;
            if((cryptoCurrency.getDate()).equals(firstCryptoCurrency.getDate())){
                startAddingToList=true ;
            }
            if((cryptoCurrency.getDate()).equals(lastCryptoCurrency.getDate())){
                listOfCryptoCurrencies.add(lastCryptoCurrency);
                startAddingToList=false ;
            }
            else if(startAddingToList){
                listOfCryptoCurrencies.add(cryptoCurrency) ;
            }
        }


        for (CryptoCurrency currency : listOfCryptoCurrencies) {
            printingInformation(currency);
        }

        return listOfCryptoCurrencies;
    }

}