package com.infoshareacademy.jjdd6.codeina.service;

import com.infoshareacademy.jjdd6.CryptoCurrency;
import com.infoshareacademy.jjdd6.LoadingData;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.servlet.http.HttpServletRequest;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RequestScoped
public class CryptoService {

LoadingData loadingData = new LoadingData() ;

    public CryptoCurrency getNewestDate(String csv) throws FileNotFoundException {
        return loadingData.getLastDate(loadingData.loadAllCryptoCurrenciesFromCsv(csv));
    }
    public List<CryptoCurrency>  getAllCryptoCurrencies(String csv) throws FileNotFoundException {
        return loadingData.loadAllCryptoCurrenciesFromCsv(csv);
    }
    public List<CryptoCurrency> getAllCryptoCurrencieInRange(String csv ,LocalDate firstDate ,LocalDate lastDate) throws FileNotFoundException {
        List<CryptoCurrency> list= getAllCryptoCurrencies(csv);
        return list.stream().filter(o-> o.getDate().compareTo(firstDate)<=0 && o.getDate().compareTo(lastDate)>=0)
                .collect(Collectors.toList());
    }
    public CryptoCurrency getMedian(){

    }

}
