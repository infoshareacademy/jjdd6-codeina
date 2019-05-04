package com.infoshareacademy.jjdd6;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ConfigPropertiesTest {

    @Test
    void testOriginRegionSet() throws IOException {
        //given
        String given = ConfigProperties.originRegionSet(1);
        //when
        String expected = "yyyy-MM-dd";
        //then
        assertEquals(given, expected);
    }
}