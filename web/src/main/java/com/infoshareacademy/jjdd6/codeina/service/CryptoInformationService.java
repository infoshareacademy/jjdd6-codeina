package com.infoshareacademy.jjdd6.codeina.service;

import com.infoshareacademy.jjdd6.CryptoCurrency;
import com.infoshareacademy.jjdd6.LoadingData;
import com.infoshareacademy.jjdd6.MathematicOperation;
import com.infoshareacademy.jjdd6.codeina.cdi.CryptoCurrencyAllInformations;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RequestScoped
public class CryptoInformationService {

    @Inject
    CryptoCurrencyAllInformations cryptoCurrencyAllInformations;
    private LoadingData loadingData = new LoadingData();
    private MathematicOperation mathematicOperation = new MathematicOperation();

    public CryptoCurrency getNewestDate(String shortName) {
        return cryptoCurrencyAllInformations.findByShortName(shortName).getCryptoCurrencies().get(cryptoCurrencyAllInformations.findByShortName(shortName).getCryptoCurrencies().size() - 1);
    }

    public List<CryptoCurrency> getAllCryptoCurrencies(String shortName) {
        return cryptoCurrencyAllInformations.findByShortName(shortName).getCryptoCurrencies();
    }

    public List<CryptoCurrency> getAllCryptoCurrenciesInRange(String shortName, LocalDate firstDate, LocalDate lastDate) {
        List<CryptoCurrency> list = getAllCryptoCurrencies(shortName);
        return list.stream().filter(o -> o.getDate().compareTo(firstDate) >= 0 && o.getDate().compareTo(lastDate) <= 0).collect(Collectors.toList());
    }

    public Double getMedian(String shortName, LocalDate firstDate, LocalDate lastDate) {
        return mathematicOperation.median(loadingData.getMapFromList(getAllCryptoCurrenciesInRange(shortName, firstDate, lastDate)));
    }

    public Double getAverage(String shortName, LocalDate firstDate, LocalDate lastDate) {
        return mathematicOperation.average(loadingData.getMapFromList(getAllCryptoCurrenciesInRange(shortName, firstDate, lastDate)));
    }

    public CryptoCurrency getHighestValue(String shortName, LocalDate firstDate, LocalDate lastDate) {
        List<CryptoCurrency> list = getAllCryptoCurrenciesInRange(shortName, firstDate, lastDate);
        Map<LocalDate, CryptoCurrency> map = loadingData.getMapFromList(list);
        return mathematicOperation.findExtremeValue(map);
    }

    public CryptoCurrency getLowestValue(String shortName, LocalDate firstDate, LocalDate lastDate) {
        List<CryptoCurrency> list = getAllCryptoCurrenciesInRange(shortName, firstDate, lastDate);
        Map<LocalDate, CryptoCurrency> map = loadingData.getMapFromList(list);
        return mathematicOperation.findSmallestValue(map);
    }

    public Double changeOverNight(String shortName) {
        List<CryptoCurrency> list = getAllCryptoCurrencies(shortName);
        Double yesterdaysPrice = list.get(list.size() - 2).getPrice();
        Double todayPrice = list.get(list.size() - 1).getPrice();
        return todayPrice / yesterdaysPrice - 1;
    }

    public CryptoCurrency getFirstDate(List<CryptoCurrency> list) {
        return list.get(0);
    }

    public CryptoCurrency getLastDate(List<CryptoCurrency> list) {
        return list.get(list.size() - 1);
    }
}
