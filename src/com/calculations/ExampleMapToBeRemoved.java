package com.calculations;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

public class ExampleMapToBeRemoved {

    public static void main(String[] args) {

        MatematicOperations matematicOperations = new MatematicOperations();

        matematicOperations.median(exampleMap());
    }


    public static Map exampleMap(){

        Map<LocalDate, Double> cryptoMap = new HashMap<>();

        LocalDate localDate = LocalDate.now();

            cryptoMap.put(localDate = LocalDate.of(1985, Month.DECEMBER, 19), 10.01);
            cryptoMap.put(localDate = LocalDate.of(2028, Month.JANUARY, 17), 19.91);
            cryptoMap.put(localDate = LocalDate.of(2049, Month.MARCH, 05), 10.59);
            cryptoMap.put(localDate = LocalDate.of(2010, Month.JULY, 15), 18.52);
            cryptoMap.put(localDate = LocalDate.of(2008, Month.DECEMBER, 19), 11.98);
//            cryptoMap.put(localDate = LocalDate.of(2008, Month.DECEMBER, 20), 12.98);

            return cryptoMap;
    }



}
