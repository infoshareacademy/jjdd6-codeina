package com.infoshareacademy.jjdd6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class LoadingDataTest {
    private LoadingData loadingData;
    private LocalDate date1 = LocalDate.of(2019, 4, 30);
    private LocalDate date2 = LocalDate.of(2019, 5, 3);
    private LocalDate date3 = LocalDate.of(2019, 5, 5);
    private CryptoCurrency c1 = new CryptoCurrency(25.5, date1);
    private CryptoCurrency c2 = new CryptoCurrency(13.0, date2);
    private CryptoCurrency c3 = new CryptoCurrency(50.0, date3);
    private List<CryptoCurrency> cryptoList = Arrays.asList(c1, c2, c3);

    @BeforeEach
    void prep() {
        loadingData = new LoadingData();
    }

    @Test
    void testSortingLineOfText() {
        //given
        String s = "2014-02-15,78550.2272195603,54982.05727697249,3236,1100630.5677290265,0.331111,21119.0,,30944.0,5.23855816," +
                "3916,38.0124093594692,3206,11.09550283636454,0.001,1337727,596";
        CryptoCurrency cryptoCurrency = loadingData.sortingLineOfText(s);
        //when
        CryptoCurrency expected = new CryptoCurrency(0.331111, LocalDate.parse("2014-02-15"));
        //then
        assertEquals(expected.getPrice(), cryptoCurrency.getPrice());
        assertEquals(expected.getDate(), cryptoCurrency.getDate());

    }

    @Test
    void testGetMapFromList() {
        List<CryptoCurrency> list = cryptoList;
        //when
        Map<LocalDate, CryptoCurrency> map = loadingData.getMapFromList(list);
        //then
        assertTrue(map.keySet().contains(date1));
        assertTrue(map.keySet().contains(date2));
        assertEquals(3, map.keySet().size());
    }

    @Test
    void testNewerDate() {
        boolean result = loadingData.newerDate(date1, date2);
        assertFalse(result);
    }

    @Test
    void testFirstDate() {
        //given
        CryptoCurrency cryptoCurrency = loadingData.getFirstDate(cryptoList);
        //when
        CryptoCurrency expected = c1;
        //then
        assertEquals(cryptoCurrency, expected);
    }

    @Test
    void testLastDate() {
        //given
        CryptoCurrency cryptoCurrency = loadingData.getLastDate(cryptoList);
        //when
        CryptoCurrency expected = c3;
        //then
        assertEquals(cryptoCurrency, expected);
    }
}