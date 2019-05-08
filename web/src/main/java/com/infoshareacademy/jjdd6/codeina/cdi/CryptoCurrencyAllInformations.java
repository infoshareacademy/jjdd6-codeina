package com.infoshareacademy.jjdd6.codeina.cdi;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class CryptoCurrencyAllInformations {
    private List<CryptoCurrencyInformations> listOfAllInformations;

    public List<CryptoCurrencyInformations> getListOfAllInformations() {
        return listOfAllInformations;
    }

    public void setListOfAllInformations(List<CryptoCurrencyInformations> listOfAllInformations) {
        this.listOfAllInformations = listOfAllInformations;
    }
}
