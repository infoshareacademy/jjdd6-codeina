package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.*;

public class LoadingData {

    public String readingLastLineOFFile(String fileName) throws FileNotFoundException {
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

    public CryptoCurrency sortingLineOfText(String lineOfText) {
        String[] parts = lineOfText.split(",");
        Double price = 0.0;
        LocalDate date;
        try {
            price = Double.parseDouble(parts[5]);
        } catch (Exception e) {
        }
        try {
            date = LocalDate.parse(parts[0]);
        } catch (Exception e) {
            date = LocalDate.now();
        }
        return new CryptoCurrency(price, date);
    }

    public void printingInformation(CryptoCurrency cryptoCurrency) {
        System.out.println(String.format("Data : %s", cryptoCurrency.getDate()));
        System.out.println(String.format("price(USD): %s", cryptoCurrency.getPrice()));
    }

    public void printInformationFromLastLineOfCSV(String csv) throws FileNotFoundException {
        printingInformation(sortingLineOfText(readingLastLineOFFile(csv)));
    }

    public CryptoCurrency scanningDateFromUser(String csv) throws FileNotFoundException {
        boolean flag = false;
        CryptoCurrency cryptoCurrency = new CryptoCurrency();
        File file = new File(csv);
        while (!flag) try {
            String lineOfText = null;
            System.out.println("Choose date (date format :\"yyyy-MM-dd\" ):");
            Scanner scanner = new Scanner(System.in);
            String string = scanner.nextLine();
            LocalDate date;
            Interface.printLine();

            try {
                date = LocalDate.parse(string);
            } catch (Exception e) {
                printCommunicateWrongDateFormat();
                continue;
            }
            Scanner inputStream = new Scanner(file);
//            lineOfText = inputStream.next();
            while (inputStream.hasNext()) {
                lineOfText = inputStream.next();
                String[] parts = lineOfText.split(",");
                if (parts[0] == "date") {
                    continue;
                }
                cryptoCurrency = sortingLineOfText(lineOfText);
                if ((cryptoCurrency.getDate().equals(date))) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                printCommunicateDateOutOfRange();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return cryptoCurrency;
    }

    private void printCommunicateWrongDateFormat() {
        Interface.clearScreen();
        System.out.println("----------------------------------------------------------------");
        System.out.println("             Incorrect date format. Try again!");
        System.out.println("----------------------------------------------------------------");
    }

    private void printCommunicateDateOutOfRange() {
        Interface.clearScreen();
        System.out.println("----------------------------------------------------------------");
        System.out.println("                 Date out of range. Try again!");
        System.out.println("----------------------------------------------------------------");
    }

    public void printInformationFromHistoricalDate(String csv) throws FileNotFoundException {
        CryptoCurrency cryptoCurrency = scanningDateFromUser(csv);
        printingInformation(cryptoCurrency);
    }

    public boolean newerDate(LocalDate ld1, LocalDate ld2) {
        return ld1.compareTo(ld2) > 0;
    }


    public List<CryptoCurrency> getCryptoCurrencyFromDateToDate(String csv) throws FileNotFoundException { //WIP
        CryptoCurrency firstCryptoCurrency = scanningDateFromUser(csv);
        CryptoCurrency lastCryptoCurrency = scanningDateFromUser(csv);
        if (newerDate(firstCryptoCurrency.getDate(), lastCryptoCurrency.getDate())) {
            CryptoCurrency temporary = firstCryptoCurrency;
            firstCryptoCurrency = lastCryptoCurrency;
            lastCryptoCurrency = temporary;
        }
        List<CryptoCurrency> listOfCryptoCurrencies = loadingCrypotoCurrencyIntoMyList(csv, firstCryptoCurrency, lastCryptoCurrency);


        for (CryptoCurrency currency : listOfCryptoCurrencies) {
            printingInformation(currency);
        }

        return listOfCryptoCurrencies;
    }

    private List<CryptoCurrency> loadingCrypotoCurrencyIntoMyList(String csv, CryptoCurrency first, CryptoCurrency last) throws FileNotFoundException {
        List<CryptoCurrency> listOfCryptoCurrencies = new ArrayList<>();
        boolean startAddingToList = false;
        File file = new File(csv);
        Scanner inputStream = new Scanner(file);
        while (inputStream.hasNext()) {
            String lineOfText = inputStream.next();
            CryptoCurrency cryptoCurrency = sortingLineOfText(lineOfText);
            if ((cryptoCurrency.getDate()).equals(first.getDate())) {
                startAddingToList = true;
            }
            if ((cryptoCurrency.getDate()).equals(last.getDate())) {
                listOfCryptoCurrencies.add(last);
                startAddingToList = false;
            } else if (startAddingToList) {
                listOfCryptoCurrencies.add(cryptoCurrency);
            }
        }
        return listOfCryptoCurrencies;
    }

    public Map<LocalDate, CryptoCurrency> getMapFromList(List<CryptoCurrency> list) {
        Map<LocalDate, CryptoCurrency> map = new HashMap<LocalDate, CryptoCurrency>();
        list.forEach(o -> map.put(o.getDate(), o));
        return map;
    }
}