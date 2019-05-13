package com.infoshareacademy.jjdd6.codeina.hibernate;


import com.infoshareacademy.jjdd6.CryptoCurrency;
import com.infoshareacademy.jjdd6.codeina.cdi.CryptoCurrencyAllInformations;
import com.infoshareacademy.jjdd6.codeina.cdi.CryptoCurrencyInformation;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class TableFiller {


    @PersistenceContext
    private EntityManager entityManager;


    public void save(InformationTable s) {
        entityManager.persist(s);
    }

    public void fillTable(List<CryptoCurrencyInformation> cryptoList) {
        for (CryptoCurrencyInformation information : cryptoList) {
            String shortName = information.getShortName();
            String fullName = information.getFullName();
            for (CryptoCurrency cryptoCurrency : information.getCryptoCurrencies()) {
                InformationTable informationTable = new InformationTable(shortName, fullName
                        , cryptoCurrency.getPrice(), cryptoCurrency.getMarketCap(), cryptoCurrency.getDate());
                save(informationTable);
            }
        }
    }
}
