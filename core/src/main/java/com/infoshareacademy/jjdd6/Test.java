package com.infoshareacademy.jjdd6;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) throws IOException {

        String csv ="C:\\Users\\janos\\Desktop\\codeinaProduction\\jjdd6-codeina\\csv\\btc.csv" ;
        LoadingData loadingData =new LoadingData();
        List<CryptoCurrency> listOfAll =  loadingData.loadAllCryptoCurrenciesFromCsv(csv);
        LocalDate firstDate = LocalDate.of(2019,03,15);
        LocalDate lastDate = LocalDate.of(2019,03,12);
        if(firstDate.compareTo(lastDate)>0){
            LocalDate temp = firstDate ;
            firstDate = lastDate ;
            lastDate = temp ;
        }
        LocalDate finalFirstDate = firstDate;
        LocalDate finalLastDate = lastDate;
        List<CryptoCurrency> list  = listOfAll.stream().filter(o-> o.getDate().compareTo(finalLastDate)<=0 && o.getDate().compareTo(finalFirstDate)>=0)
                .collect(Collectors.toList());
        list.forEach(loadingData::printingInformation);
    }
}
