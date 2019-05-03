package com.infoshareacademy.jjdd6;

import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {

    private static final String SETTINGS_FILE = "config.properties";

    public static String originRegionSet(int originRegion) throws IOException {
        String pattern = "yyyy-MM-dd";
        Properties prop = new Properties();
        prop.load(Thread.currentThread()
                .getContextClassLoader().getResource(SETTINGS_FILE).openStream());
        if (originRegion == 1) {
            pattern = prop.getProperty("dateFormatUS");
        }

        if (originRegion == 2) {
            pattern = prop.getProperty("dateFormatEU");

        }
        return pattern;
    }
}