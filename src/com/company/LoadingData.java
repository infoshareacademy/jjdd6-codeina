package com.company;

import java.io.File;
import java.io.FileNotFoundException;
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
        Double price = Double.parseDouble(parts[5]);
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
        printingInformation(sortingLineOfText(readingFiles(csv)));
    }


}
