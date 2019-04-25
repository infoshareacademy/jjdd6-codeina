package com.infoshareacademy.jjdd6.codeina.cdi;


import javax.enterprise.context.ApplicationScoped;
import java.util.Map;

@ApplicationScoped
public class StatisticData implements StatisticDataDao {

    private Map<String, Integer> statisticDataMap =
            Map.of("btc", 0,
                    "bch", 0,
                    "ltc", 0,
                    "eth", 0,
                    "xem", 0,
                    "dcr", 0,
                    "zec", 0,
                    "dash", 0,
                    "doge", 0,
                    "pivx", 0);

    public Map<String, Integer> getStatisticDataMap() {
        return statisticDataMap;
    }

    public void setStatisticDataMap(Map<String, Integer> statisticDataMap) {
        this.statisticDataMap = statisticDataMap;
    }

    @Override
    public Map<String, Integer> addValue(String cryptoName, Map<String, Integer> map) {
        if (map.containsKey(cryptoName)) {
            int oldValue = map.get(cryptoName);
            map.put(cryptoName, oldValue + 1);
        } else {
            map.put(cryptoName, 1);
        }
        return map;
    }
}

