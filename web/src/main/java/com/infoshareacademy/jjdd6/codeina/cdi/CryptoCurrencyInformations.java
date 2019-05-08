package com.infoshareacademy.jjdd6.codeina.cdi;


import com.infoshareacademy.jjdd6.CryptoCurrency;

import java.time.LocalDate;
import java.util.List;

public class CryptoCurrencyInformations {
    private List<CryptoCurrency> cryptoCurrencies;
    private String name;
    private LocalDate firstDate;
    private LocalDate lastDate;

    public List<CryptoCurrency> getCryptoCurrencies() {
        return cryptoCurrencies;
    }

    public void setCryptoCurrencies(List<CryptoCurrency> cryptoCurrencies) {
        this.cryptoCurrencies = cryptoCurrencies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
