package Calculations;


import javax.xml.crypto.Data;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.Month;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MatematicOperations{


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



