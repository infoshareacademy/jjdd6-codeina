package com.infoshareacademy.jjdd6.codeina.service;

import com.infoshareacademy.jjdd6.CryptoCurrency;
import com.infoshareacademy.jjdd6.LoadingData;
import com.infoshareacademy.jjdd6.MathematicOperation;

import javax.enterprise.context.RequestScoped;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;

@RequestScoped
public class CryptoService {


private LoadingData loadingData = new LoadingData() ;
private MathematicOperation mathematicOperation = new MathematicOperation();

    public CryptoCurrency getNewestDate(String csv) throws FileNotFoundException {
        return loadingData.getLastDate(loadingData.loadAllCryptoCurrenciesFromCsv(csv));
    }
    public List<CryptoCurrency>  getAllCryptoCurrencies(String csv) throws FileNotFoundException {
        return loadingData.loadAllCryptoCurrenciesFromCsv(csv);
    }
    public List<CryptoCurrency> getAllCryptoCurrenciesInRange(String csv , LocalDate firstDate , LocalDate lastDate) throws FileNotFoundException {
        if(firstDate.compareTo(lastDate)>0){
            LocalDate temp = firstDate ;
            firstDate = lastDate ;
            lastDate = temp ;
        }
        List<CryptoCurrency> list= getAllCryptoCurrencies(csv);
        LocalDate finalLastDate = lastDate;
        LocalDate finalFirstDate = firstDate;
        return list.stream().filter(o-> o.getDate().compareTo(finalFirstDate)>=0 && o.getDate().compareTo(finalLastDate)<=0)
                .collect(Collectors.toList());
    }
    public Double getMedian(String csv,LocalDate firstDate ,LocalDate lastDate) throws FileNotFoundException {
      return mathematicOperation.median(loadingData.getMapFromList(getAllCryptoCurrenciesInRange(csv,firstDate,lastDate))) ;
    }
    public Double getAverage(String csv,LocalDate firstDate ,LocalDate lastDate) throws FileNotFoundException {
        return mathematicOperation.average(loadingData.getMapFromList(getAllCryptoCurrenciesInRange(csv,firstDate,lastDate))) ;
    }
    public CryptoCurrency getHighestValue(String csv,LocalDate firstDate ,LocalDate lastDate) throws FileNotFoundException {
        List<CryptoCurrency> list =getAllCryptoCurrenciesInRange(csv,firstDate,lastDate);
        Map<LocalDate , CryptoCurrency> map = loadingData.getMapFromList(list) ;
        return mathematicOperation.findExtremeValue(map) ;
    }
    public CryptoCurrency getLowestValue(String csv,LocalDate firstDate ,LocalDate lastDate) throws FileNotFoundException {
        List<CryptoCurrency> list =getAllCryptoCurrenciesInRange(csv,firstDate,lastDate);
        Map<LocalDate , CryptoCurrency> map = loadingData.getMapFromList(list) ;
        return mathematicOperation.findSmallestValue(map) ;
    }

}
