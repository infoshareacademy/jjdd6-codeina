package com.infoshareacademy.jjdd6.codeina.cdi;

import javax.ejb.Singleton;
import javax.ejb.Stateful;
import java.util.Map;

@Stateful
@Singleton
public interface StatisticDataDao {
    Map<String,Integer>addValue(String key, Map<String ,Integer> map);
}
