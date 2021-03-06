package com.infoshareacademy.jjdd6.codeina.hibernate;


import com.infoshareacademy.jjdd6.CryptoCurrency;
import com.infoshareacademy.jjdd6.LoadingData;
import com.infoshareacademy.jjdd6.MathematicOperation;
import com.infoshareacademy.jjdd6.codeina.servlet.AdminServlet;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Stateless
public class InformationDAO {

    private static final Logger logger = Logger.getLogger(InformationDAO.class.getName());

    @PersistenceContext
    private EntityManager entityManager;

    private LoadingData loadingData = new LoadingData();
    private MathematicOperation mathematicOperation = new MathematicOperation();

    public CryptoCurrency getNewestDate(String shortName) {
        final Query query = entityManager.createNamedQuery("InformationTable.getNewestDate");

        query.setParameter("shortName", shortName);
        InformationTable i = (InformationTable) query.setMaxResults(1).getSingleResult();
        return new CryptoCurrency(i.getPrice(), i.getDate(), i.getMarketCap());
    }


    public List<CryptoCurrency> getAllCryptoCurrencies(String shortName) {
        final Query query = entityManager.createNamedQuery("InformationTable.getAllCryptoCurrencies");
        query.setParameter("shortName", shortName);
        List<InformationTable> informationTables = (List<InformationTable>) query.getResultList();
        List<CryptoCurrency> list = new ArrayList<CryptoCurrency>();
        for (InformationTable i : informationTables) {
            list.add(new CryptoCurrency(i.getPrice(), i.getDate(), i.getMarketCap()));
        }
        return list;
    }

    public List<CryptoCurrency> getAllCryptoCurrenciesInRange(String shortName, LocalDate firstDate, LocalDate lastDate) {
        List<CryptoCurrency> list = getAllCryptoCurrencies(shortName);
        return list.stream().filter(o -> o.getDate().compareTo(firstDate) >= 0 && o.getDate().compareTo(lastDate) <= 0).collect(Collectors.toList());
    }

    public Double getMedian(String shortName, LocalDate firstDate, LocalDate lastDate) {
        return mathematicOperation.median(loadingData.getMapFromList(getAllCryptoCurrenciesInRange(shortName, firstDate, lastDate)));
    }

    public Double getAverage(String shortName, LocalDate firstDate, LocalDate lastDate) {
        return mathematicOperation.average(loadingData.getMapFromList(getAllCryptoCurrenciesInRange(shortName, firstDate, lastDate)));
    }

    public CryptoCurrency getHighestValue(String shortName, LocalDate firstDate, LocalDate lastDate) {
        List<CryptoCurrency> list = getAllCryptoCurrenciesInRange(shortName, firstDate, lastDate);
        Map<LocalDate, CryptoCurrency> map = loadingData.getMapFromList(list);
        return mathematicOperation.findExtremeValue(map);
    }

    public CryptoCurrency getLowestValue(String shortName, LocalDate firstDate, LocalDate lastDate) {
        List<CryptoCurrency> list = getAllCryptoCurrenciesInRange(shortName, firstDate, lastDate);
        Map<LocalDate, CryptoCurrency> map = loadingData.getMapFromList(list);
        return mathematicOperation.findSmallestValue(map);
    }

    public Double changeOverNight(String shortName) {
        List<CryptoCurrency> list = getAllCryptoCurrencies(shortName);
        Double yesterdaysPrice = list.get(list.size() - 2).getPrice();
        Double todayPrice = list.get(list.size() - 1).getPrice();
        return todayPrice / yesterdaysPrice - 1;
    }

    public CryptoCurrency getFirstDate(List<CryptoCurrency> list) {
        return list.get(0);
    }

    public CryptoCurrency getLastDate(List<CryptoCurrency> list) {
        return list.get(list.size() - 1);
    }

    public void deleteAll(){
        final Query query = entityManager.createQuery("DELETE  FROM InformationTable  ");
        query.executeUpdate();
    }

}
