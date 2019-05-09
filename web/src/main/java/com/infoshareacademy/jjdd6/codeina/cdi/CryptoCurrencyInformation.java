package com.infoshareacademy.jjdd6.codeina.cdi;


import com.infoshareacademy.jjdd6.CryptoCurrency;

import java.time.LocalDate;
import java.util.List;

public class CryptoCurrencyInformation {
    private List<CryptoCurrency> cryptoCurrencies;
    private String shortName;
    private String fullName;
    private LocalDate firstDate;
    private LocalDate lastDate;

    public List<CryptoCurrency> getCryptoCurrencies() {
        return cryptoCurrencies;
    }

    public CryptoCurrencyInformation(List<CryptoCurrency> cryptoCurrencies, String shortName, String fullName, LocalDate firstDate, LocalDate lastDate) {
        this.cryptoCurrencies = cryptoCurrencies;
        this.shortName = shortName;
        this.fullName = fullName;
        this.firstDate = firstDate;
        this.lastDate = lastDate;
    }

    public void setCryptoCurrencies(List<CryptoCurrency> cryptoCurrencies) {
        this.cryptoCurrencies = cryptoCurrencies;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(LocalDate firstDate) {
        this.firstDate = firstDate;
    }

    public LocalDate getLastDate() {
        return lastDate;
    }

    public void setLastDate(LocalDate lastDate) {
        this.lastDate = lastDate;
    }
}
