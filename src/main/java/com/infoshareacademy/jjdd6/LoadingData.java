package com.infoshareacademy.jjdd6;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.*;

public class LoadingData {

    private static final Logger LOGGER = LogManager.getLogger(LoadingData.class.getName());

    public CryptoCurrency sortingLineOfText(String lineOfText) {
        String[] parts = lineOfText.split(",");
        Double price;
        LocalDate date;
        try {
            price = Double.parseDouble(parts[5]);
        } catch (Exception e) {
            LOGGER.error("Method throw exception");
            price = 0.0;
        }
        try {
            date = LocalDate.parse(parts[0]);
        } catch (Exception e) {
            LOGGER.error("Method throw exception");
            date = LocalDate.now();
        }
        return new CryptoCurrency(price, date);
    }

    public void printingInformation(CryptoCurrency cryptoCurrency) {
        System.out.println(String.format("Data : %s", cryptoCurrency.getDate()));
        System.out.println(String.format("price(USD): %s", cryptoCurrency.getPrice()));
    }

    public void printInformationFromLastLineOfCSV(String csv) throws FileNotFoundException {
        printingInformation(getLastDate(loadAllCryptoCurrenciesFromCsv(csv)));
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
                LOGGER.error("Method throw exception");
                printCommunicateWrongDateFormat();
                continue;
            }
            Scanner inputStream = new Scanner(file);
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
                printCommunicateDateOutOfRange(csv);
            }

        } catch (FileNotFoundException e) {
            LOGGER.error("Method throw exception");
            e.printStackTrace();
        }

        return cryptoCurrency;
    }

    private void printCommunicateWrongDateFormat() {
        Interface.clearScreen();
        Interface.printLine();
        System.out.println("             Incorrect date format. Try again!");
        System.out.printf("                        (\"yyyy-MM-dd\") ");
        Interface.printLine();
    }

    private void printCommunicateDateOutOfRange(String csv) throws FileNotFoundException {
        LocalDate firstDate = (getFirstDate(loadAllCryptoCurrenciesFromCsv(csv))).getDate();
        LocalDate lastDate = (getLastDate(loadAllCryptoCurrenciesFromCsv(csv))).getDate();
        Interface.clearScreen();
        Interface.printLine();
        System.out.println("                 Date out of range. Try again!");
        System.out.println(String.format("Range for this cryptocurrency is from %s to %s", firstDate, lastDate));
        Interface.printLine();
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

    public void printAllCryptoCurrencies(String csv) throws FileNotFoundException {
        List<CryptoCurrency> list = getCryptoCurrencyFromDateToDate(csv);
        list.forEach(this::printingInformation);
    }

    public List<CryptoCurrency> loadAllCryptoCurrenciesFromCsv(String csv) throws FileNotFoundException {
        List<CryptoCurrency> cryptoCurrencyList = new ArrayList<CryptoCurrency>();
        File file = new File(csv);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            String line = scanner.next();
            String[] parts = line.split(",");
            if (!parts[0].equals("date")) {
                cryptoCurrencyList.add(sortingLineOfText(line));
            }
        }
        return cryptoCurrencyList;
    }

    public CryptoCurrency getFirstDate(List<CryptoCurrency> list) {
        return list.get(0);
    }

    public CryptoCurrency getLastDate(List<CryptoCurrency> list) {
        return list.get(list.size() - 1);
    }
}