package com.infoshareacademy.jjdd6.codeina.hibernate;


import com.infoshareacademy.jjdd6.codeina.servlet.ChoiceServlet;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class StatisticsDAO {

    private ChoiceServlet choiceServlet = new ChoiceServlet();

    @PersistenceContext
    private EntityManager entityManager;

    public void update(String shortName) {
        if (findByName(shortName) != null) {
            StatisticsTable s = findByName(shortName);

            s.setNumber(s.getNumber() + 1);
            int sum = findAll().stream().map(o -> o.getNumber()).reduce(0, Integer::sum);
            List<StatisticsTable> list = findAll();
            for (StatisticsTable statisticsTable : list) {
                statisticsTable.setPercentage(statisticsTable.getNumber() * 100 / sum);
                entityManager.merge(statisticsTable);
            }
            entityManager.merge(s);
        } else {
            String fullName = choiceServlet.shortNameToFullCryptocurrencyName(shortName);
            int sum = findAll().stream().map(o -> o.getNumber()).reduce(0, Integer::sum) + 1;
            StatisticsTable s = new StatisticsTable(shortName, 1, fullName, 100 / sum);
            for (StatisticsTable statisticsTable : findAll()) {
                statisticsTable.setPercentage(statisticsTable.getNumber() * 100 / sum);
                entityManager.merge(statisticsTable);
            }
            entityManager.persist(s);
        }


    }

    private StatisticsTable findByName(String shortName) {
        return entityManager.find(StatisticsTable.class, shortName);

    }

    public List<StatisticsTable> findAll() {
        final Query query = entityManager.createQuery("SELECT s FROM  StatisticsTable s ", StatisticsTable.class);

        return query.getResultList();
    }


}
