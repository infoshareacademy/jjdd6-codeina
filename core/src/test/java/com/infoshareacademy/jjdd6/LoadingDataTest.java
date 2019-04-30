package com.infoshareacademy.jjdd6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LoadingDataTest {
    private LoadingData loadingData ;
    private LocalDate date1 = LocalDate.of(2019,4,30);
    private LocalDate date2 = LocalDate.of(2019,5,3);
    private List<CryptoCurrency> cryptoList = Arrays.asList(new CryptoCurrency(2.0,date1),new CryptoCurrency(3.0,date2));
    @BeforeEach
    void prep(){
        loadingData = new LoadingData() ;
    }

    @Test
    void testSortingLineOfText() {
        //given
        String s = "2014-02-15,78550.2272195603,54982.05727697249,3236,1100630.5677290265,0.331111,21119.0,,30944.0,5.23855816," +
                "3916,38.0124093594692,3206,11.09550283636454,0.001,1337727,596";
        CryptoCurrency cryptoCurrency = loadingData.sortingLineOfText(s);
        //when
        CryptoCurrency expected = new CryptoCurrency(0.331111, LocalDate.parse( "2014-02-15"));
        //then
        assertThat(expected.equals(cryptoCurrency));

    }
    @Test
    void testGetMapFromList(){
        List<CryptoCurrency> list = cryptoList ;
        //when
        Map<LocalDate,CryptoCurrency> map= loadingData.getMapFromList(list);
        //then
        assertThat(map.keySet().contains(date1));
        assertThat(map.keySet().contains(date2));
        assertThat(map.keySet().size()==2);
    }
    @Test
    void testNewerDate(){
        boolean result =  loadingData.newerDate(date1,date2);
        assertThat(!result);
    }
    @Test
    void testFirstDate(){
        //given
        List<CryptoCurrency> list =cryptoList;
        //when
        CryptoCurrency expected = new CryptoCurrency(2.0,date1);
        //then
        assertThat(loadingData.getFirstDate(list).equals(expected));
    }

}