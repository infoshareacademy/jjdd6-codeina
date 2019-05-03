package com.infoshareacademy.jjdd6;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


class MathematicOperationTest {

    private LocalDate date1 = LocalDate.of(2019, 4, 30);
    private LocalDate date2 = LocalDate.of(2019, 5, 3);
    private LocalDate date3 = LocalDate.of(2019, 5, 5);
    private CryptoCurrency c1 = new CryptoCurrency(25.5, date1);
    private CryptoCurrency c2 = new CryptoCurrency(13.0, date2);
    private CryptoCurrency c3 = new CryptoCurrency(50.0, date3);
    private List<CryptoCurrency> cryptoList = Arrays.asList(c1, c2, c3);
    private LoadingData loadingData = new LoadingData();
    private MathematicOperation mathematicOperation = new MathematicOperation();
    Map<LocalDate, CryptoCurrency> cryptoCurrencyMap = loadingData.getMapFromList(cryptoList);

    @Test
    void testAverage() {
        //given
        Double average = mathematicOperation.average(cryptoCurrencyMap);
        //when
        Double expected = (25.5 + 13.0 + 50.0) / 3;
        //then
        assertEquals(average, expected);
    }

    @Test
    void testFindExtremeValue() {
        //given
        CryptoCurrency highest = mathematicOperation.findExtremeValue(cryptoCurrencyMap);
        //when
        CryptoCurrency expected = c3;
        //then
        assertEquals(highest, expected);
    }

    @Test
    void testFindSmallestValue() {
        //given
        CryptoCurrency smallest = mathematicOperation.findSmallestValue(cryptoCurrencyMap);
        //when
        CryptoCurrency expected = c2;
        //then
        assertEquals(smallest, expected);
    }

    @Test
    void testMedian() {
        //given
        Double median = mathematicOperation.median(cryptoCurrencyMap);
        //when
        Double expected = 25.5;
        //then
        assertEquals(median, expected);
    }
}