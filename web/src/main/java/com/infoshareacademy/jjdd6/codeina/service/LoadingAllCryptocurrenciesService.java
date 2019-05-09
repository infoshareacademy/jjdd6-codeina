package com.infoshareacademy.jjdd6.codeina.service;

import com.infoshareacademy.jjdd6.CryptoCurrency;
import com.infoshareacademy.jjdd6.LoadingData;
import com.infoshareacademy.jjdd6.codeina.cdi.CryptoCurrencyInformation;
import com.infoshareacademy.jjdd6.codeina.servlet.ChoiceServlet;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@RequestScoped
public class LoadingAllCryptocurrenciesService {

   @Inject
   private LoadProperties loadProperties;

   @Inject
   private CryptoService cryptoService;

   private ChoiceServlet choiceServlet = new ChoiceServlet();

   private LoadingData loadingData = new LoadingData();

   private static final String[] cryptoCurrencyShortNames = {"btc", "bch", "ltc",
           "eth", "vtc", "dcr", "zec", "dash",
           "doge", "pivx"};

   public List<CryptoCurrencyInformation> listOfCryptoInformation() throws IOException {
      List<CryptoCurrencyInformation> listOfCryptoInformation = new ArrayList<>();
      String path = loadProperties.getSettingsFile();

      for (String shortName:cryptoCurrencyShortNames) {
         String filePath = path + shortName + ".csv";
         String fullName = choiceServlet.shortNameToFullCryptocurrencyName(shortName);
         List<CryptoCurrency> cryptoCurrencies = cryptoService.getAllCryptoCurrencies(filePath);
         LocalDate firstDate =  loadingData.getFirstDate(cryptoCurrencies).getDate();
         LocalDate lastDate =  loadingData.getLastDate(cryptoCurrencies).getDate();
         CryptoCurrencyInformation cryptoCurrencyInformation= new CryptoCurrencyInformation(
                 cryptoCurrencies,shortName,fullName,firstDate,lastDate);
         listOfCryptoInformation.add(cryptoCurrencyInformation);
      }
      return listOfCryptoInformation;
   }

}
