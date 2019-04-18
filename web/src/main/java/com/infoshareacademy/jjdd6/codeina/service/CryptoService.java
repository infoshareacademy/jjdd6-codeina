package com.infoshareacademy.jjdd6.codeina.service;

import com.infoshareacademy.jjdd6.CryptoCurrency;
import com.infoshareacademy.jjdd6.LoadingData;

import javax.enterprise.context.RequestScoped;
import javax.servlet.http.HttpServletRequest;
import java.io.FileNotFoundException;

@RequestScoped
public class CryptoService {

LoadingData loadingData = new LoadingData() ;

    public CryptoCurrency getNewestDate(String csv) throws FileNotFoundException {
        return loadingData.getLastDate(loadingData.loadAllCryptoCurrenciesFromCsv(csv));
    }
}
