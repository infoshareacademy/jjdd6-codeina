package com.infoshareacademy.jjdd6.codeina.cdi;

import javax.ejb.Singleton;
import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@Singleton
public class CryptoCurrencyAllInformations {
    private List<CryptoCurrencyInformation> listOfAllInformations;

    public List<CryptoCurrencyInformation> getListOfAllInformations() {
        return listOfAllInformations;
    }

    public void setListOfAllInformations(List<CryptoCurrencyInformation> listOfAllInformations) {
        this.listOfAllInformations = listOfAllInformations;
    }
    public CryptoCurrencyInformation findByShortName(String shortName) throws Exception {
       return listOfAllInformations.stream().filter(c-> c.getShortName().equals(shortName)).findFirst().orElseThrow(Exception::new);
    }
}
