package com.infoshareacademy.jjdd6.codeina.hibernate;


import com.infoshareacademy.jjdd6.codeina.servlet.ChoiceServlet;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class StatisticsDAO {

    private ChoiceServlet choiceServlet = new ChoiceServlet();

    @PersistenceContext
    private EntityManager entityManager;

    public void update(String shortName) {
        if (findByName(shortName) != null) {
            StatisticsTable s = findByName(shortName);
            s.setNumber(s.getNumber() + 1);
            entityManager.merge(s);
        } else {
            String fullName = choiceServlet.shortNameToFullCryptocurrencyName(shortName);
            StatisticsTable s = new StatisticsTable(shortName, 1, fullName);
            entityManager.persist(s);
        }


    }

    private StatisticsTable findByName(String shortName) {
        return entityManager.find(StatisticsTable.class, shortName);
    }

}
