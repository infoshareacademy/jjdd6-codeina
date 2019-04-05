package com.calculations;


import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MatematicOperations{
        //made for test
        public static void main(String[] args) {

                LocalDate localDate = LocalDate.now();

                Map<LocalDate, Double> cryptoMap = new HashMap<>();


                cryptoMap.put(new LocalDate("2018.01.05"), 11.00);

        }





        public void average(Map <LocalDate, Double> fromCsv) {





        }

        public static Map.Entry<LocalDate, Double> findExtremeValue(Map <LocalDate, Double> fromCsv) {


                Map.Entry<LocalDate, Double> highestValue = fromCsv.entrySet().stream()
                        .max(Map.Entry.comparingByValue(Comparator.comparingDouble(Double::doubleValue)))
                        .get();

                 return highestValue;

        }

        public void median(Map <Data, Double> fromCsv){




        }



}



