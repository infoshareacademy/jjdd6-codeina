package com.infoshareacademy.jjdd6.codeina.cdi;


import javax.enterprise.context.ApplicationScoped;
import java.util.HashMap;
import java.util.Map;

@ApplicationScoped
public class StatisticData {

    private Map<String, Integer> statisticDataMap ;

    public Map<String, Integer> getStatisticDataMap() {
        return statisticDataMap;
    }

    public void setStatisticDataMap(Map<String, Integer> statisticDataMap) {
        this.statisticDataMap = statisticDataMap;
    }

    public Map<String, Integer> addValue(String cryptoName, Map<String, Integer> map) {
        if(map!=null){
            if (map.containsKey(cryptoName)) {
                int oldValue = map.get(cryptoName);
                map.put(cryptoName, oldValue + 1);
            } else {
                map.put(cryptoName, 1);
            }
            return map;
        }else{
            Map<String, Integer> newMap= new HashMap<>();
            newMap.put(cryptoName, 1);
            return newMap;
        }
    }
}

