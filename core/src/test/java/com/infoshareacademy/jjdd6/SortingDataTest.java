package com.infoshareacademy.jjdd6;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortingDataTest {

    private SortingData sortingData = new SortingData();
    private LocalDate date1 = LocalDate.of(2019, 4, 30);
    private LocalDate date2 = LocalDate.of(2019, 5, 3);
    private LocalDate date3 = LocalDate.of(2019, 5, 5);
    private CryptoCurrency c1 = new CryptoCurrency(25.5, date1);
    private CryptoCurrency c2 = new CryptoCurrency(13.0, date2);
    private CryptoCurrency c3 = new CryptoCurrency(50.0, date3);
    private List<CryptoCurrency> cryptoList = Arrays.asList(c1, c2, c3);

    @Test
    void testSortCryptoCurrencyFromMaxToMin() {
        //given
        List<CryptoCurrency> list = sortingData.sortCryptoCurrencyFromMaxToMin(cryptoList);
        //when
        List<CryptoCurrency> expectedResult = Arrays.asList(c3, c1, c2);
        //then
        assertEquals(expectedResult, list);
    }

    @Test
    void testSortCryptoCurrencyFromMinToMax() {
        //given
        List<CryptoCurrency> list = sortingData.sortCryptoCurrencyFromMinToMax(cryptoList);
        //when
        List<CryptoCurrency> expectedResult = Arrays.asList(c2, c1, c3);
        //then
        assertEquals(expectedResult, list);
    }

    @Test
    void testSortingDatesFromNewestToOldest() {
        //given
        List<CryptoCurrency> list = sortingData.sortingDatesFromNewestToOldest(cryptoList);
        //when
        List<CryptoCurrency> expectedResult = Arrays.asList(c3, c2, c1);
        //then
        assertEquals(expectedResult, list);
    }
}