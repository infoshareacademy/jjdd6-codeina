package com.infoshareacademy.jjdd6.codeina.service;

import com.infoshareacademy.jjdd6.Downloader;
import com.infoshareacademy.jjdd6.codeina.cdi.CryptoCurrencyAllInformations;
import com.infoshareacademy.jjdd6.codeina.hibernate.InformationDAO;
import com.infoshareacademy.jjdd6.codeina.hibernate.TableFiller;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.inject.Inject;
import java.io.IOException;
import java.util.logging.Logger;

@Singleton
public class ScheduledDataProvider {

    @Inject
    private CryptoCurrencyAllInformations cryptoCurrencyAllInformations;

    @Inject
    private LoadingAllCryptocurrenciesService loadingAllCryptocurrenciesService;

    @Inject
    private TableFiller tableFiller;

    @Inject
    private InformationDAO informationDAO;

    private static final Logger logger = Logger.getLogger(ScheduledDataProvider.class.getName());

    @Schedule(hour = "03", minute = "37", second = "02", info = "Download all cryptocurrencies.ftlh")
    public void downloader() throws IOException {
        try {
            Downloader.downloadAllForServer();
            logger.info("Files were downloaded ;-))");
            cryptoCurrencyAllInformations.setListOfAllInformations(loadingAllCryptocurrenciesService.listOfCryptoInformation());

          try{  logger.info("Files were downloaded ;-))");

              informationDAO.deleteAll();

              tableFiller.fillTable(cryptoCurrencyAllInformations.getListOfAllInformations());

          }catch (Exception e){
              logger.severe("Failed to refill database :-(");
          }


        } catch (Exception e) {
            logger.warning("Error while loading data: " + e);
        }
    }
}

