package com.infoshareacademy.jjdd6;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigProperties {
    public static String originRegionSet(int originRegion) {
        String pattern = "yyyy-MM-dd";

        try (
                InputStream input = new FileInputStream("/home/lukasz-ratajczak/IdeaProjects/jjdd6-codeina/src/main/resources/config.properties")) {

            Properties prop = new Properties();
            prop.load(input);

            if (originRegion == 1) {
                pattern = prop.getProperty("dateFormatUS");
            }

            if (originRegion == 2) {
                pattern = prop.getProperty("dateFormatEU");

            }

        } catch (
                IOException ex) {
            ex.printStackTrace();
        }

        return pattern;
    }
}